package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Subject {
    public String name;
    public String subjectCode;
    public ArrayList<Assignment> assignments;

    public Subject(String name, String subjectCode) {
        this.name = name;
        this.subjectCode = subjectCode;
    }

    public void createAssignment(String description, Date dueDate, Integer maxAttempts, String name){
        Assignment temp = new Assignment(description, dueDate, maxAttempts, name);
        assignments.add(temp);
    }

    public void deleteAssignment(String assignment){

    }
}
