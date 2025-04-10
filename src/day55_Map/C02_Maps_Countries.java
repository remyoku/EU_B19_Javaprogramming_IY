package day55_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_Maps_Countries {
    public static void main(String[] args) {

       //("countryName","capitalCity")
        Map<String,String>capitalCities = new HashMap<>();
       //capitalCities.put(key , value);
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington Dc");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Turkey","Ankara");

        System.out.println("capitalCities = " + capitalCities);
        //capitalCities = {USA=Washington Dc, Turkey=Ankara, Norway=Oslo, Germany=Berlin}

        Map<String ,String> capitalCitiesLHM = new LinkedHashMap<>();
        capitalCitiesLHM.put("Norway","Oslo");
        capitalCitiesLHM.put("USA","Washington Dc");
        capitalCitiesLHM.put("Germany","Berlin");
        capitalCitiesLHM.put("Turkey","Ankara");

        System.out.println("capitalCitiesLHM = " + capitalCitiesLHM);
        //capitalCitiesLHM = {Norway=Oslo, USA=Washington Dc, Germany=Berlin, Turkey=Ankara}

        Map<String ,String > capitalCitiesTM = new TreeMap<>();
        capitalCitiesTM.put("Norway","Oslo");
        capitalCitiesTM.put("USA","Washington Dc");
        capitalCitiesTM.put("Germany","Berlin");
        capitalCitiesTM.put("Turkey","Ankara");

        System.out.println("capitalCitiesTM = " + capitalCitiesTM);
        //key sorted order
        //capitalCitiesTM = {Germany=Berlin, Norway=Oslo, Turkey=Ankara, USA=Washington Dc}


    }
}
