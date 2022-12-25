package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private LocalDate lastActiveTime;
}
