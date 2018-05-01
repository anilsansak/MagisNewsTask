package com.example.anil.magisnewstask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReadResponse {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("response")
    @Expose
    private ReadResponse response;

    public ReadResponse(Boolean error) {
        this.error = error;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public ReadResponse getResponse() {
        return response;
    }

    public void setResponse(ReadResponse response) {
        this.response = response;
    }
}
