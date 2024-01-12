package ru.geekbrains.junior.lesson2.task1;

public class Dog extends Animal {
    private String name;
    private int age;

    public Dog() {
        name = "Пес";
        age = 5;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void makeSound(){
        System.out.println("вызов метода makeSound()");
    }
}

