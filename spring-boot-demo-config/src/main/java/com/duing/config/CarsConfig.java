package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "cars")
@PropertySource("classpath:cars.properties")
public class CarsConfig {
    private String bmw;
    private String bz;
    private String audi;

    public String getBmw() {
        return bmw;
    }

    public void setBmw(String bmw) {
        this.bmw = bmw;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getAudi() {
        return audi;
    }

    public void setAudi(String audi) {
        this.audi = audi;
    }
}
