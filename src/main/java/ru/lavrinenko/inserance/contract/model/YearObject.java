package ru.lavrinenko.inserance.contract.model;

public enum YearObject {

    LESS("Меньше 2000"),
    BETWEEN("2000-2014"),
    AFTER("2015");


    private String title;
    YearObject(String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
