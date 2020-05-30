package com.alialfayed.tourguideapp;

import java.io.Serializable;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/30/2020 - 12:48 PM
 */
public class InfoPlaceModel implements Serializable {
    private int imgPlace ;
    private String namePlace;
    private String addressPlace;
    private String phonePlace;
    private float ratePlace;
    private String descriptionPlace;

    public InfoPlaceModel(){}

    public int getImgPlace() {
        return imgPlace;
    }

    public void setImgPlace(int imgPlace) {
        this.imgPlace = imgPlace;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public String getAddressPlace() {
        return addressPlace;
    }

    public void setAddressPlace(String addressPlace) {
        this.addressPlace = addressPlace;
    }

    public String getPhonePlace() {
        return phonePlace;
    }

    public void setPhonePlace(String phonePlace) {
        this.phonePlace = phonePlace;
    }

    public float getRatePlace() {
        return ratePlace;
    }

    public void setRatePlace(float ratePlace) {
        this.ratePlace = ratePlace;
    }

    public String getDescriptionPlace() {
        return descriptionPlace;
    }

    public void setDescriptionPlace(String descriptionPlace) {
        this.descriptionPlace = descriptionPlace;
    }
}
