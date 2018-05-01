
package com.example.anil.magisnewstask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("response")
    @Expose
    private Response response;


    public News(Boolean error, Response response) {
        super();
        this.error = error;
        this.response = response;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

}
