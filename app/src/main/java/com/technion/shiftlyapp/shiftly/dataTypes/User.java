package com.technion.shiftlyapp.shiftly.dataTypes;

import java.util.ArrayList;
import java.util.List;

// A class that represents a user in the app
// This group syncs with the firebase database

public class User {

    private String firstname;
    private String lastname;
    private String email;
    private Long groups_count;
    private List<String> groups;

    public User() {
    }

    // C'tor that is used for a new user creation
    public User(String firstname_p, String lastname_p, String email_p) {
        this.firstname = firstname_p;
        this.lastname = lastname_p;
        this.email = email_p;
        this.groups_count = 0L;
        this.groups = new ArrayList<>();
    }

    // Copy C'tor
    public User(User u) {
        this.firstname = u.firstname;
        this.lastname = u.lastname;
        this.email = u.email;
        this.groups_count = u.groups_count;
        this.groups.addAll(u.groups);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String fn) {
        this.firstname = fn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String ln) {
        this.lastname = ln;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String ea) {
        this.email = ea;
    }

    public Long getGroups_count() {
        return groups_count;
    }

    public List<String> getGroups() {
        return groups;
    }

}