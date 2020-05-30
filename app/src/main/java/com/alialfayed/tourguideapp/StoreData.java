package com.alialfayed.tourguideapp;

import java.util.ArrayList;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 5/30/2020 - 12:55 PM
 */
public class StoreData {

    public static ArrayList<InfoPlaceModel> storeDateTouristPlace(MainActivity mainActivity){
        ArrayList<InfoPlaceModel> infoPlaceArrayList = new ArrayList<>();
        InfoPlaceModel infoPlaceModel = new InfoPlaceModel();

        infoPlaceModel.setImgPlace(R.drawable.ic_ras_mohammed_national_park);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l1_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l1_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l1_d1_phone));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l1_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_thistlegorm_dive_site);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l2_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l2_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l2_d1_phone));
        infoPlaceModel.setRatePlace(3.9f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l2_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_ras_um_sid_beach_and_reef);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l3_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l3_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l3_d1_phone));
        infoPlaceModel.setRatePlace(4.2f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l3_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_saint_catherines_monastery);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l4_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l4_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l4_d1_phone));
        infoPlaceModel.setRatePlace(4.9f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l4_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_dahab);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l5_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l5_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l5_d1_phone));
        infoPlaceModel.setRatePlace(4.7f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l5_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_gardens_dive_site);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l6_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l6_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l6_d1_phone));
        infoPlaceModel.setRatePlace(4.2f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l6_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_thomas_reef_dive_site);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l7_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l7_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l7_d1_phone));
        infoPlaceModel.setRatePlace(4f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l7_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_colored_canyon);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l8_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l8_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l8_d1_phone));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l8_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_nabq_protectorate);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l9_d1_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l9_d1_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l9_d1_phone));
        infoPlaceModel.setRatePlace(4.7f);
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l9_d1_description));
        infoPlaceArrayList.add(infoPlaceModel);

        return infoPlaceArrayList;
    }

    public static ArrayList<InfoPlaceModel> storeDateRestaurant(MainActivity mainActivity){
        ArrayList<InfoPlaceModel> infoPlaceArrayList = new ArrayList<>();
        InfoPlaceModel infoPlaceModel = new InfoPlaceModel();

        infoPlaceModel.setImgPlace(R.drawable.ic_house_of_spice);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l2_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l2_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l2_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l3_d2_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_the_queen_vic);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l2_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l2_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l2_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l2_d2_description));
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_boharat_restaurant);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l3_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l3_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l3_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l3_d2_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_fleu_de_lis);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l4_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l4_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l4_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l4_d2_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_el_kababgy);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l5_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l5_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l5_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l5_d2_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_mandarin_bistro);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l6_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l6_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l6_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l6_d2_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_casa_mia);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l7_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l7_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l7_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l7_d2_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_rangoli);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l8_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l8_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l8_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l8_d2_description));
        infoPlaceModel.setRatePlace(3f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_bombay);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l9_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l9_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l9_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l9_d2_description));
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_arab_bucks);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l10_d2_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l10_d2_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l10_d2_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l10_d2_description));
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceArrayList.add(infoPlaceModel);



        return infoPlaceArrayList;
    }

    public static ArrayList<InfoPlaceModel> storeDateShopping(MainActivity mainActivity){
        ArrayList<InfoPlaceModel> infoPlaceArrayList = new ArrayList<>();
        InfoPlaceModel infoPlaceModel = new InfoPlaceModel();

        infoPlaceModel.setImgPlace(R.drawable.ic_la_strada_shopping_center);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l1_d3_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l1_d3_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l1_d3_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l1_d3_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_soho_square);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l2_d3_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l2_d3_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l2_d3_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l2_d3_description));
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_genena_city);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l3_d3_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l3_d3_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l3_d3_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l3_d3_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);


        return infoPlaceArrayList;
    }

    public static ArrayList<InfoPlaceModel> storeDatePharmacies(MainActivity mainActivity){
        ArrayList<InfoPlaceModel> infoPlaceArrayList = new ArrayList<>();
        InfoPlaceModel infoPlaceModel = new InfoPlaceModel();

        infoPlaceModel.setImgPlace(R.drawable.el_ezaby_pharmacies);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l1_d4_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l1_d4_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l1_d4_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l1_d4_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.fekry_pharmacies);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l2_d4_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l2_d4_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l2_d4_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l2_d4_description));
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.fekry_pharmacies);
        infoPlaceModel.setNamePlace(mainActivity.getString(R.string.l3_d4_title));
        infoPlaceModel.setAddressPlace(mainActivity.getString(R.string.l3_d4_address));
        infoPlaceModel.setPhonePlace(mainActivity.getString(R.string.l3_d4_phone));
        infoPlaceModel.setDescriptionPlace(mainActivity.getString(R.string.l3_d4_description));
        infoPlaceModel.setRatePlace(5f);
        infoPlaceArrayList.add(infoPlaceModel);


        return infoPlaceArrayList;
    }
}
