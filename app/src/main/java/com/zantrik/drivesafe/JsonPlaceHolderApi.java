package com.zantrik.drivesafe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET("account/CompleteSignIn")
    Call<List<ResponseData>> getPosts();

    //@FormUrlEncoded
    @POST("account/CompleteSignIn")
    Call<ResponseData> createPost(@Query("apikey") String apikey, @Query("phone") String phone, @Query("fireBaseToken") String fireBaseToken);

}