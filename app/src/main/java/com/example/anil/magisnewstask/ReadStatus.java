package com.example.anil.magisnewstask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReadStatus {

    @SerializedName("id")
    @Expose
    private int id;

    public ReadStatus(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
