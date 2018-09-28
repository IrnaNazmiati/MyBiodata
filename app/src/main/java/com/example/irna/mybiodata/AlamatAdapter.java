package com.example.irna.mybiodata;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AlamatAdapter extends RecyclerView.Adapter<AlamatAdapter.AlamatHolder>{

    List<Alamat> alamats;
    Activity activity;

    public AlamatAdapter(List<Alamat> alamats, Activity activity) {
        this.alamats = alamats;
        this.activity = activity;
    }


    @Override
    public AlamatHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lv_alamat,parent,false);
        return new AlamatHolder(view);
    }

    @Override
    public void onBindViewHolder(AlamatHolder holder, int position) {
        holder.txtKec.setText(alamats.get(position).getKecamatan());
        holder.txtKab.setText(alamats.get(position).getKabupaten());
        holder.txtProv.setText(alamats.get(position).getProvinsi());

    }


    @Override
    public int getItemCount() {
        return alamats.size();
    }

    static class AlamatHolder extends RecyclerView.ViewHolder{
        TextView txtKec, txtKab, txtProv;
        public AlamatHolder(View itemView) {
            super(itemView);
            txtKec=(TextView)itemView.findViewById(R.id.txt_kec);
            txtKab=(TextView)itemView.findViewById(R.id.txt_kab);
            txtProv=(TextView)itemView.findViewById(R.id.txt_prov);
        }


    }
}

