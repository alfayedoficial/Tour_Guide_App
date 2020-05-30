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

    public static ArrayList<InfoPlaceModel> storeDateRestaurant(){
        ArrayList<InfoPlaceModel> infoPlaceArrayList = new ArrayList<>();
        InfoPlaceModel infoPlaceModel = new InfoPlaceModel();

        infoPlaceModel.setImgPlace(R.drawable.ic_house_of_spice);
        infoPlaceModel.setNamePlace("House of Spice");
        infoPlaceModel.setAddressPlace("Sultan Gardens Resort Shark's Bay, Sharm El Sheikh 111 Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3602130");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("The newest addition to the Sultan Gardens Resort dining options; this exciting new outlet, serving Indian Cuisine, benefits from a central location, eye catching designs and stunning menu which are sure to make it an instant favorite.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_the_queen_vic);
        infoPlaceModel.setNamePlace("The Queen Vic");
        infoPlaceModel.setAddressPlace("Soho Square, Sharm El Sheikh Egypt");
        infoPlaceModel.setPhonePlace("+20 100 010 9109");
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceModel.setDescriptionPlace("The Queen Vic is the traditional British local pub, where English native guests feel at home thanks to the design, atmosphere, the look & feel of the pub. Football matches are displayed on screens/T.V during the English football tournament /season. There's plenty of room with a long bar, indoor tables, chairs and booths. The Queen Vic serves a wide variety of beers, wines, and non-alcoholic beverages. The front of the Queen Vic is always open, leading out to the large wooden terrace, with outdoor tables and seating overlooking SOHO Square, also providing darts and a billiards room to enjoy with your friends.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_boharat_restaurant);
        infoPlaceModel.setNamePlace("Boharat Restaurant");
        infoPlaceModel.setAddressPlace("Namma Bay, next to Tropitl resort and Little Buddha, Sharm El Sheikh Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3600570");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("Boharat Restaurant is the traditional British local pub, where English native guests feel at home thanks to the design, atmosphere, the look & feel of the pub.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_fleu_de_lis);
        infoPlaceModel.setNamePlace("Fleur De Lis");
        infoPlaceModel.setAddressPlace("Sultan Gardens Resort Shark's Bay, Sharm El Sheikh 111 Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3602130");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("Fleur De Lis is the traditional British local pub, where English native guests feel at home thanks to the design, atmosphere, the look & feel of the pub.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_el_kababgy);
        infoPlaceModel.setNamePlace("El Kababgy");
        infoPlaceModel.setAddressPlace("Mövenpick Resort, Naama Bay, Sharm El Sheikh 46619 Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3600081");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("Kababgy fuses five-star Swiss service with Egyptian traditions of hospitality. Enjoy smart-casual dining in exquisite surroundings whether you choose to be seated indoors in the laid-back ambiance of Arabic interiors or outdoors with a breathtaking view of Naama Bay. Indulge in rich flavors of charcoal-grilled meats marinated according to time-honored recipes and variety of local delicacies!");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_mandarin_bistro);
        infoPlaceModel.setNamePlace("Mandarin Bistro");
        infoPlaceModel.setAddressPlace("Soho Square Sharks Bay, Sharm El Sheikh 12444 Egypt");
        infoPlaceModel.setPhonePlace("+20 100 010 9109");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("Al fresco dining with meals served outside (open-air). Choose from the menus of four tip-top restaurants: Luxor, Mai-Thai, Zen and Bombay, each offering authentic cuisine with specialized chefs & imported spices.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_casa_mia);
        infoPlaceModel.setNamePlace("Casa Mia");
        infoPlaceModel.setAddressPlace("Sultan Gardens Resort Shark's Bay, Sharm El Sheikh 111 Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3602130");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("Al fresco dining with meals served outside (open-air). Choose from the menus of four tip-top restaurants:");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_rangoli);
        infoPlaceModel.setNamePlace("Rangoli");
        infoPlaceModel.setAddressPlace("Mövenpick Resort, Naama Bay, Sharm El Sheikh 46619 Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3600081");
        infoPlaceModel.setRatePlace(3f);
        infoPlaceModel.setDescriptionPlace("Al fresco dining with meals served outside (open-air). Choose from the menus of four tip-top restaurants:");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_bombay);
        infoPlaceModel.setNamePlace("Bombay");
        infoPlaceModel.setAddressPlace("Soho Square, Sharm El Sheikh 169 Egypt");
        infoPlaceModel.setPhonePlace("+20 100 010 9109");
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceModel.setDescriptionPlace("Bombay Indian restaurant with our gourmet chef Tilakraj from Delhi, who demonstrates his wholehearted devotion to Indian food and the tandoori oven. Imported Indian sauces such as melonin masala or jawatri powder are used in different sauce-based dishes, such as Karachi gosht, with tender lamb cooked in a rich and delicious sauce. The menu also includes vegetarian options. Dress code applies for men: no-shorts, no flip-flops");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_arab_bucks);
        infoPlaceModel.setNamePlace("Arab Bucks");
        infoPlaceModel.setAddressPlace("Nabq Bay, opposite Laguna Vista Resort, Sharm El Sheikh Egypt");
        infoPlaceModel.setPhonePlace("+20 100 612 2649");
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceModel.setDescriptionPlace("Takeout, Reservations, Outdoor Seating, Seating, Parking Available, Street Parking, Television, Highchairs Available, Wheelchair Accessible, Serves Alcohol, Full Bar, Accepts American Express, Accepts Mastercard, Accepts Visa, Cash Only, Free Wifi, Accepts Credit Cards, Table Service");
        infoPlaceArrayList.add(infoPlaceModel);



        return infoPlaceArrayList;
    }

    public static ArrayList<InfoPlaceModel> storeDateShopping(){
        ArrayList<InfoPlaceModel> infoPlaceArrayList = new ArrayList<>();
        InfoPlaceModel infoPlaceModel = new InfoPlaceModel();

        infoPlaceModel.setImgPlace(R.drawable.ic_la_strada_shopping_center);
        infoPlaceModel.setNamePlace("La Strada Shopping Center");
        infoPlaceModel.setAddressPlace("Sultan Gardens Resort Shark's Bay, Sharm El Sheikh 111 Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3602130");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("The newest addition to the Sultan Gardens Resort dining options; this exciting new outlet, serving Indian Cuisine, benefits from a central location, eye catching designs and stunning menu which are sure to make it an instant favorite.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_soho_square);
        infoPlaceModel.setNamePlace("Soho Square");
        infoPlaceModel.setAddressPlace("Soho Square, Sharm El Sheikh Egypt");
        infoPlaceModel.setPhonePlace("+20 100 010 9109");
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceModel.setDescriptionPlace("SOHO Square Sharm El Sheikh is the middle East's leading shopping & entertainment center, the finest in the Red Sea region. SOHO Square is a hub for entertainment, dining, clubbing, shopping, sport activities enhance with a dancing fountain, mega stage & kids fun activities, a great environment to enjoy with friends, family, or couples.\n");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.ic_genena_city);
        infoPlaceModel.setNamePlace("Genena City");
        infoPlaceModel.setAddressPlace("Halomy Street 38, Sharm El Sheikh 11311 Egypt");
        infoPlaceModel.setPhonePlace("+20 69 3600570");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("Sharm Tours Club provide a wide range of day tours and Excursions in Sharm El Sheikh to make your holiday i Egypt a memorable experience.\n");
        infoPlaceArrayList.add(infoPlaceModel);


        return infoPlaceArrayList;
    }

    public static ArrayList<InfoPlaceModel> storeDatePharmacies(){
        ArrayList<InfoPlaceModel> infoPlaceArrayList = new ArrayList<>();
        InfoPlaceModel infoPlaceModel = new InfoPlaceModel();

        infoPlaceModel.setImgPlace(R.drawable.el_ezaby_pharmacies);
        infoPlaceModel.setNamePlace("El - Ezaby Pharmacies");
        infoPlaceModel.setAddressPlace("Sharm Elysees St , Inside Il Mercato Sharm El Sheikh Mall, Umm El Sid Hill, Sharm El Sheikh");
        infoPlaceModel.setPhonePlace("+201221616130");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("El Ezaby Pharmacies is recognized as Egypt’s uncontested leading provider of health and personal care products. A success story that began with one pharmacy established in 1975, the group is now a major corporation driving the country’s healthcare sector. With nearly 40 years of experience serving the Egyptian community, El Ezaby Pharmacies has an ambitious plan to cement its leadership across the region.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.fekry_pharmacies);
        infoPlaceModel.setNamePlace("Omar and Omar Pharmacies");
        infoPlaceModel.setAddressPlace("El Sultan Qabous St , El Mashaya, Inside Movenpick Mall, Shop No 9, Naama Bay, Sharm El Sheikh");
        infoPlaceModel.setPhonePlace("+201223137145");
        infoPlaceModel.setRatePlace(4.5f);
        infoPlaceModel.setDescriptionPlace("Omar and Omar Pharmacies is recognized as Egypt’s uncontested leading provider of health and personal care products.");
        infoPlaceArrayList.add(infoPlaceModel);

        infoPlaceModel = new InfoPlaceModel();
        infoPlaceModel.setImgPlace(R.drawable.fekry_pharmacies);
        infoPlaceModel.setNamePlace("Islam Fekry Pharmacy");
        infoPlaceModel.setAddressPlace("El Montazah, Inside Elmar Mall, Shop No 3g, Ground Floor, Nabq Bay, Sharm El Sheikh" +
                "Nabq Bay Sharm El Sheikh");
        infoPlaceModel.setPhonePlace("+201223137145");
        infoPlaceModel.setRatePlace(5f);
        infoPlaceModel.setDescriptionPlace("Islam Fekry Pharmacies is recognized as Egypt’s uncontested leading provider of health and personal care products.");
        infoPlaceArrayList.add(infoPlaceModel);


        return infoPlaceArrayList;
    }
}
