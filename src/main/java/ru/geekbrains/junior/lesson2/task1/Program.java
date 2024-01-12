package ru.geekbrains.junior.lesson2.task1;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//import static sun.jvm.hotspot.opto.Node.constructors;


public class Program {
//    Задача 1:
//    Создайте абстрактный класс "Animal" с полями "name" и "age".
//    Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
//    Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
//    Выведите на экран информацию о каждом объекте.
//    Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.



    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
       Cat cat = new Cat();
       Dog dog = new Dog();
       Animal[] animal = new Animal[]{cat, dog};

//        System.out.println(dog);
//        System.out.println(cat);
        System.out.println(Arrays.toString(animal));


        for (Animal animal1 : animal) {
            Class<?> clazz= animal1.getClass();
            System.out.println("Класс: " + clazz);
            System.out.println("Поля класса:  " + Arrays.toString(clazz.getDeclaredFields()));
            System.out.println("Методы класса: " + Arrays.toString(clazz.getDeclaredMethods()));
            Constructor[] constructors = clazz.getConstructors();
            System.out.println("Конструкторы класса: " + Arrays.toString(constructors));
            Object personInstance1 = constructors[0].newInstance(null);
            Method makeSound = clazz.getMethod("makeSound");
            makeSound.invoke(personInstance1);
        }
        // Вызов метода

        // Создадим экземпляр класса

//        for (Animal animal1 : animal) {
////            Class<?> clazz= animal1.getClass();
////            Method makeSound = clazz.getMethod("makeSound");
////            makeSound.invoke(clazz);
//        }
//        Method makeSound = animal.getClass().getEnclosingMethod();
//        makeSound.invoke(animal);


//        Class<?> concreteClass = Class.forName("ru.geekbrains.junior.lesson2.task1.Program");
//        Class<?>[] classes = concreteClass.getDeclaredClasses();
//        for (Class<?> class1 : classes) {
//            System.out.println(class1.getSimpleName());
//        }


//       Class<?>[] animalClass = new Class[]{Class.forName("ru.geekbrains.junior.lesson2.task1.Program")};
//      System.out.println(Arrays.toString(animalClass));
//
//        Class<?>[] classes = new Class[]{animal.getClass()};
//        System.out.println(Arrays.toString(classes));


//        for (Animal anima : animal) {
//            System.out.println("Поле: " + anima.getName());
//        }
        // Получить список всех полей
//        Field[] fields = animal.getClass().getDeclaredFields();
//
//        for (Field field : fields) {
//            field.setAccessible(true);
//            System.out.println("Поле: " + field.getName());
//        }

//        // Получить список всех конструкторов
//        Constructor[] constructors = animal.getConstructors();
//        for (Constructor constructor : constructors){
//            System.out.println("Конструктор: " + constructor);
//        }


        // Создадим экземпляр класса
//        Object animals1 = constructors[0].newInstance(null);


//        // Вызов метода
//        Method displayInfoMethod = animal.getDeclaredMethod("makeSound");
//        displayInfoMethod.invoke(animal);


//        // Получить список всех полей
//        Field[] fields = personalClass.getDeclaredFields();
//        for (Field field : fields){
//            System.out.println("Поле: " + field.getName());
//        }
//
//        // Получить список всех конструкторов
//        Constructor[] constructors
//                = personalClass.getConstructors();
//
//
//        // Создадим экземпляр класса
//        Object personInstance1 = constructors[0].newInstance(null);
//        Object personInstance2 = constructors[0].newInstance(null);
//
//
//        //Устанавливаем значения полей
//        Field nameField = personalClass.getDeclaredField("name");
//        nameField.setAccessible(true); // Разрешаем доступ к закрытому полю
//        nameField.set(personInstance2, "Alice");
//
//        Field ageField = personalClass.getDeclaredField("age");
//        ageField.setAccessible(true); // Разрешаем доступ к закрытому полю
//        ageField.set(personInstance2, 30);
//
//        // Вызов метода
//        Method displayInfoMethod = personalClass.getDeclaredMethod("displayInfo");
//        displayInfoMethod.invoke(personInstance2);


    }

}
