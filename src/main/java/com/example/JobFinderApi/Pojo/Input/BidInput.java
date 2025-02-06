package com.example.JobFinderApi.Pojo.Input;

import com.example.JobFinderApi.Pojo.Entity.Work;
import com.example.JobFinderApi.Pojo.Entity.Worker;

public class BidInput {

    private double price;

    public BidInput(){}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
