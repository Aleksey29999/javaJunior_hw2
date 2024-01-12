package ru.geekbrains.junior.lesson2.task1;

public class Cat extends Animal{
    private String name;
    private int age;

    public Cat() {
        name = "Барсик";
        age = 2;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void makeSound(){
        System.out.println("вызов метода makeSound()");
    }
}

