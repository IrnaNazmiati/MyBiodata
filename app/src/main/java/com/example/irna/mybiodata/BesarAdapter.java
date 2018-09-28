package com.example.irna.mybiodata;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class BesarAdapter extends RecyclerView.Adapter<BesarAdapter.BesarHolder> {
    private List<Biodata> biodatanya;
    private Activity activity;

    public BesarAdapter(List<Biodata> biodatanya, Activity activity) {
        this.biodatanya = biodatanya;
        this.activity = activity;
    }

    @Override
    public BesarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_besar,parent,false);
        return new BesarAdapter.BesarHolder(view);
    }


    @Override
    public void onBindViewHolder(BesarHolder holder, int position) {
        holder.txtNamanya.setText(biodatanya.get(position).getNama());
        Picasso.with(activity).load(biodatanya.get(position).getFoto()).into(holder.fotonya);

    }

    @Override
    public int getItemCount() {
        return biodatanya.size();

    }

    static class BesarHolder extends RecyclerView.ViewHolder{
        ImageView fotonya;
        TextView txtNamanya;


        public BesarHolder(View itemView) {
            super(itemView);
            fotonya=(ImageView) itemView.findViewById(R.id.img_biodata);
            txtNamanya=(TextView)itemView.findViewById(R.id.txt_nama);

        }
    }


}

