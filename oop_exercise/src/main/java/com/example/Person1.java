package com.example;

public class Person1 {
    public static void main(String[] args) {
        // ساخت یک شیء از کلاس Person
        Person p1 = new Person("Amir", 20);
        Person p2 = new Person("Sara", 15);

        // نمایش اطلاعات
        p1.displayInfo();
        p1.checkAdult();

        System.out.println("-------------");

        p2.displayInfo();
        p2.checkAdult();
    }
}

// تعریف کلاس Person به صورت مستقل
class Person {
    // 1️⃣ فیلدهای خصوصی
    private String name;
    private int age;

    // 2️⃣ سازنده (Constructor)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3️⃣ متدهای getter و setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 4️⃣ متد برای نمایش اطلاعات شخص
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // 5️⃣ متد برای بررسی بزرگسال بودن
    public void checkAdult() {
        if (age >= 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is not an adult.");
        }
    }
}
