package com.hust.company.enity.Abstraction.Question1;

public  class VietnamesePhone extends Phone {

    public VietnamesePhone(){

    }

    @Override
    public void insertContact(String name, String phone) {
        System.out.println(name +" "+ phone);
    }

    @Override
    public void removeContact(String name) {
        System.out.println(name);
    }

    @Override
    public void updateContact(String name, String newPhone) {
        System.out.println(name + " " + newPhone);
    }

    @Override
    public void searchContact(String name) {
        System.out.println(name);
    }
}
