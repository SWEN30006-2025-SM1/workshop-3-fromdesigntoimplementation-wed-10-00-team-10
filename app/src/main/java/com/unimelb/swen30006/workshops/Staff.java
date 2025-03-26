package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Staff extends Person {
    private String[] roles;
    private String staffID;
    private List<Subject> subjects;

    public Staff(String address, Date dob, String name, String[] roles, String staffID) {
        super(address, dob, name);
        this.roles = roles;
        this.staffID = staffID;
    }


}
