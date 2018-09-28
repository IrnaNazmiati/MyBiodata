package com.example.irna.mybiodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AlamatAdapter alamatAdapter;
    private ApiInterface apiInterface;
    private List<Biodata> biodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv_besar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
       Call<List<Biodata>> call=apiInterface.getAllBiodata();
        call.enqueue(new Callback<List<Biodata>>() {
            @Override
            public void onResponse(Call<List<Biodata>> call, Response<List<Biodata>> response) {
                biodata=response.body();
                BesarAdapter adap = new BesarAdapter(biodata,MainActivity.this);
                recyclerView.setAdapter(adap);

            }

            @Override
            public void onFailure(Call<List<Biodata>> call, Throwable t) {

            }
        });

    }


}

