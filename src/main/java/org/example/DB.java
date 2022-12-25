package org.example;

public class DB extends БазаДаних{

    public String getUserData(){
        return отриматиДаніКористувача();
    }

    public String getStatisticalData(){
        return отриматиСтатистичніДані();
    }
}
