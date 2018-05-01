package com.example.anil.magisnewstask;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("getAllNews")
    Call<News> getNewsList();


    /*@GET("getNewsDetail?{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
*/

}
