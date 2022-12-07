package com.duing.domain;

public class Cars {
    private String bmw;
    private String bz;
    private String audi;

    public Cars() {
    }

    public Cars(String bmw, String bz, String audi) {
        this.bmw = bmw;
        this.bz = bz;
        this.audi = audi;
    }

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
