
package com.example.anil.magisnewstask;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsResponse {

    @SerializedName("newsList")
    @Expose
    private List<NewsList> newsList = null;

    public NewsResponse() {
    }

    public NewsResponse(List<NewsList> newsList) {
        super();
        this.newsList = newsList;
    }

    public List<NewsList> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<NewsList> newsList) {
        this.newsList = newsList;
    }

}
