package com.example.anil.magisnewstask;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @GET("getAllNews")
    Call<News> getNewsList();

    @GET("getNewsDetail?id=")
    Call<NewsDetails> getNewsDetails(@Query("id") int id);

    @POST("saveReadDetail")
    @FormUrlEncoded
    Call<ReadResponse> readNews(@Field("id") int id);
}
