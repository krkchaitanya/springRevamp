package com.simplePersistance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    private Number user_id;
    private String username;
    private String first_name;
    private String lastr_name;

    public Users(Number user_id, String username, String first_name, String lastr_name) {
        this.user_id = user_id;
        this.username = username;
        this.first_name = first_name;
        this.lastr_name = lastr_name;
    }

    public Number getUser_id() {
        return user_id;
    }

    public void setUser_id(Number user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastr_name() {
        return lastr_name;
    }

    public void setLastr_name(String lastr_name) {
        this.lastr_name = lastr_name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", lastr_name='" + lastr_name + '\'' +
                '}';
    }
}
