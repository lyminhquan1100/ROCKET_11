package com.hust.company.enity.Abstraction.Question1;

public abstract class Phone {
    private String[] contacts ;
    private String name;
    private int number;

    public abstract void insertContact(String name, String phone);

    public abstract void removeContact(String name);

    public abstract void updateContact(String name, String newPhone);

    public String[] getContacts() {
        return contacts;
    }

    public void setContacts(String[] contacts) {
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void searchContact(String name);

}
