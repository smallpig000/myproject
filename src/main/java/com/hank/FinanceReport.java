package com.hank;

public class FinanceReport implements IReport{
    @Override
    public void load() {
        System.out.println("Finance loading data");
    }

    @Override
    public void print() {
        System.out.println("Finance printing data");
    }
}
