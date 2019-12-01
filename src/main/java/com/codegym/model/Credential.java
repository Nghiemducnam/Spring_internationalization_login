package com.codegym.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Credential {
    @NotEmpty
    @Size(min = 6, max = 30)
    private String userName;

    @NotEmpty
    @Size( min = 6, max = 12)
    private String password;

    public Credential() {
    }

    public Credential(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}