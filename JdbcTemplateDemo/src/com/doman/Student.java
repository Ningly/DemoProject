package com.doman;

import java.io.Serializable;

public class Student implements Serializable {
    private int Id;

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender=" + Gender +
                '}';
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    public void setId(int id) {
        Id = id;
    }

    private String FirstName;
    private String LastName;
    private int Gender;
}
