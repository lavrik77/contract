package ru.lavrinenko.inserance.contract.model;

public enum SizeObject {

    SMALL("Менее 50 кв.м."),
    MEDIUM("50-100 кв.м."),
    LARGE("Более 100 кв.м.");


    private String title;
    SizeObject(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
