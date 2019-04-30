package com.example.sampledragger2.network;

import com.example.sampledragger2.module.Data;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserData {

    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
