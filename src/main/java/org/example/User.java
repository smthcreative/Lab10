package org.example;


import java.time.LocalDate;

public interface User {
    String getUserEmail();
    Country getUserCountry();
    LocalDate getLastActivity();
}
