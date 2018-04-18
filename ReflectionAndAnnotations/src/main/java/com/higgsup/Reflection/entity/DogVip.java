package com.higgsup.Reflection.entity;

public class DogVip extends Dog implements Animal {
    private Integer test;
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Integer getTest() {
        return test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }

    public void eat() {
        System.out.println("cho vip an");
    }

    public void dogSay() {
        System.out.println("cho vip noi");
    }

    public void dogKeu(String value) {
        System.out.println("dogKeu vip noi " + value);
    }

    public DogVip() {
    }

    public DogVip(Integer test, String type) {
        this.test = test;
        this.type = type;
    }

    public DogVip(Integer test) {
        this.test = test;
        this.type = type;
    }

    private void testMethodPrivate() {
        System.out.println("chạy method Private");
    }


}
