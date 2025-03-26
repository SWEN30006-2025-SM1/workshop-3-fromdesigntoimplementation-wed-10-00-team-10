package com.unimelb.swen30006.workshops;

import java.util.Date;

public abstract class Person {
    private String address;
    private Date dob;
    private String name;

    public Person(String address, Date dob, String name) {
        this.address = address;
        this.dob = dob;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public Date getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }
}
