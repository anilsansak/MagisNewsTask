
package com.example.anil.magisnewstask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("response")
    @Expose
    private NewsResponse newsResponse;


    public News(Boolean error, NewsResponse newsResponse) {
        super();
        this.error = error;
        this.newsResponse = newsResponse;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public NewsResponse getNewsResponse() {
        return newsResponse;
    }

    public void setNewsResponse(NewsResponse newsResponse) {
        this.newsResponse = newsResponse;
    }

}
