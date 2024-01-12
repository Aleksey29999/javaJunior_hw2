package ru.geekbrains.junior.lesson2.task1;

public class Animal {

    private String name;
    private int age;

    public Animal() {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
    //    public void displayInfo(){
//        System.out.printf("Имя: %s; Возраст: %d\n%n", name, age);
//    }

}
