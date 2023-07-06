package org.example;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class FXrates {
    @SerializedName("cc")
    private String currency;
    @SerializedName("rate")
    private Double fxrate;
    @SerializedName("exchangedate")
    private Date date;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getFxrate() {
        return fxrate;
    }

    public void setFxrate(Double fxrate) {
        this.fxrate = fxrate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FXrates{" +
                "currency='" + currency + '\'' +
                ", fxrate=" + fxrate +
                ", date=" + date +
                '}';
    }
}
