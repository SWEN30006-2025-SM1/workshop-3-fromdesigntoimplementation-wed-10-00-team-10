package com.unimelb.swen30006.workshops;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String email;
    private String studentID;
    private List<Submission> submissions;

    public Student(String email, String studentID) {
        this.email = email;
        this.studentID = studentID;
        submissions = new ArrayList<Submission>();
    }

    public void sendEmailMSG(String message){
        System.out.println(message);
    }

    public float totalGrade(){
        return 0.0f;
    }
}
