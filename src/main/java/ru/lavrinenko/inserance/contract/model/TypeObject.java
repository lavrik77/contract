package ru.lavrinenko.inserance.contract.model;

public enum TypeObject {

    FLAT("Квартира"),
    HAUSE("Дом"),
    ROOM("Комната");


    private String title;
    TypeObject(String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
