package com.mycompany.oodms.user;

import java.util.List;

public abstract class User implements UserAuthn {
    public static final String USER_FILENAME = "user";

    private Long id;
    private String username;
    private String password;
    private Boolean staff;
    private Boolean admin;

    public User(Long id, String username, String password, Boolean staff, Boolean admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.staff = staff;
        this.admin = admin;
    }

    abstract public List<String> toList();

    @Override
    public User login() {
        return null;
    }

    @Override
    public void logout() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStaff() {
        return staff;
    }

    public void setStaff(Boolean staff) {
        this.staff = staff;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", staff=" + staff +
                ", admin=" + admin +
                '}';
    }
}
