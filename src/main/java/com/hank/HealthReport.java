package com.hank;

public class HealthReport implements IReport{
    @Override
    public void load() {
        System.out.println("Helth loading data");
    }

    @Override
    public void print() {
        System.out.println("Helth printing data");
    }
}
