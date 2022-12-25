package org.example;


import java.time.LocalDate;

public class ModifiedFacebook implements User {
    private FacebookUser user;

    public ModifiedFacebook(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getUserEmail() {
        return user.getEmail();
    }

    @Override
    public Country getUserCountry() {
        return user.getUserCountry();
    }

    @Override
    public LocalDate getLastActivity() {
        return user.getGetUserActiveTime();
    }
}
