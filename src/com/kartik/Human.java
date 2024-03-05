package com.kartik;

class Human {
    public int age;
    int marks;
    String hairstyle;
    static int population = 100000;

    public Human(int age, int marks, String hairstyle) {
        this.age = age;
        this.marks = marks;
        this.hairstyle = hairstyle;
    }
    public Human(int age, int marks) {
        this.age = age;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Human vasu = new Human(23, 90);
        Human kartik = new Human(16, 95, "army");
        Human ayush = new Human(22, 96);
        System.out.println(vasu.age);
        System.out.println(kartik.age);
        System.out.println(vasu.hairstyle);
        System.out.println(kartik.hairstyle);
        System.out.println(vasu.population);
        vasu.population = 200000;
        System.out.println(kartik.population);
        System.out.println(ayush.hairstyle);

    }

}

