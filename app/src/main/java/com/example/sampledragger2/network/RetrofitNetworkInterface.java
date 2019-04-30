package com.example.sampledragger2.network;

import retrofit2.Call;
import retrofit2.http.GET;


public interface RetrofitNetworkInterface {
    @GET("/api/users/2")
    Call<GetUserData> getUserData();
}
