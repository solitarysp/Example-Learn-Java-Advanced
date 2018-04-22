package com.higgsup.reflection.entity;

public class DogVip extends Dog implements Animal {
    private Integer test;
    private String loai;
    public String type2;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
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

    public DogVip(Integer test, String loai) {
        this.test = test;
        this.loai = loai;
    }

    public DogVip(Integer test) {
        this.test = test;
        this.loai = loai;
    }

    private void testMethodPrivate() {
        System.out.println("chạy method Private");
    }


}
