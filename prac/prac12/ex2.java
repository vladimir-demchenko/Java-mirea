package com.company.prac12;

import java.util.*;

public class ex2 {
    private String country;
    private String state;
    private String city;
    private String street;
    private String build;
    private String house;
    private String flat;

    void AddressSepByC(String Address) {
        String[] address = Address.split(",");
        this.country = address[0];
        this.state = address[1];
        this.city = address[2];
        this.street = address[3];
        this.build = address[4];
        this.house = address[5];
        this.flat = address[6];
    }
    void AddressSepByG(String Address) {
        StringTokenizer st = new StringTokenizer(Address, ",.;-/");
        List<String> addressList = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            addressList.add(st.nextToken());
        }
        this.country = addressList.get(0);
        this.state = addressList.get(1);
        this.city = addressList.get(2);
        this.street = addressList.get(3);
        this.build = addressList.get(4);
        this.house = addressList.get(5);
        this.flat = addressList.get(6);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + build + '\'' +
                ", housing='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
