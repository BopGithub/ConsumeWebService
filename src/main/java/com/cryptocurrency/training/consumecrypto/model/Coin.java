package com.cryptocurrency.training.consumecrypto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*Ignore the other fields*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coin {

    private String id ;
    private String name;
    private String price_usd;

    public Coin(String name, String price_usd) {
        this.name = name;
        this.price_usd = price_usd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price_usd='" + price_usd + '\'' +
                '}';
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }
}
