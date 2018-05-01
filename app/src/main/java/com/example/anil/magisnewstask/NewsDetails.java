
package com.example.anil.magisnewstask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsDetails {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("response")
    @Expose
    private DetailsResponse response;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public DetailsResponse getResponse() {
        return response;
    }

    public void setResponse(DetailsResponse response) {
        this.response = response;
    }

}
