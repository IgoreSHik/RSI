package com.company;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class Client {
    public static void main(String[] args) {

        GeoIPService geoIPService = new GeoIPService();
        GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();

        String xmlResponse = geoIPServiceSoap.getIpLocation20("82.139.168.220");
        String countryCode = xmlResponse.substring(16, 18);
        String countryResponse = geoIPServiceSoap.getCountryNameByISO2(countryCode);
        System.out.println(countryResponse);
    }
}
