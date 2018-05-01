
package com.example.anil.magisnewstask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetailsResponse {

    @SerializedName("news")
    @Expose
    private NewsD news;

    public NewsD getNews() {
        return news;
    }

    public void setNews(NewsD news) {
        this.news = news;
    }

}
