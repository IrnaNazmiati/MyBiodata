package com.example.irna.mybiodata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("bins/10am7w")
    Call<List<Biodata>>getAllBiodata();
}

