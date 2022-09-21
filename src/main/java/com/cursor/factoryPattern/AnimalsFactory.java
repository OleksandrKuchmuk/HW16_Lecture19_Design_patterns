package com.cursor.factoryPattern;

public class AnimalsFactory {
    public Animal getAnimal(String animal){
        if (animal.equalsIgnoreCase("CAT")){
            return new Cat();
        }
        if (animal.equalsIgnoreCase("DOG")){
            return new Dog();
        }
        if (animal.equalsIgnoreCase("COW")){
            return new Cow();
        }
        if (animal.equalsIgnoreCase("DUCK")){
            return new Duck();
       }
        return null;
    }
}
