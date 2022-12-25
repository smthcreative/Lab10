package org.example;


import java.time.LocalDate;

public class ModifiedTwitter implements User {
    private TwitterUser user;

    public ModifiedTwitter(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getUserEmail() {
        return user.getUserMail();
    }

    @Override
    public Country getUserCountry() {
        return Country.valueOf(user.getCountry());
    }

    @Override
    public LocalDate getLastActivity() {
        return user.getLastActiveTime();
    }
}
