package com.uni;

import com.uni.model.Dog;
import com.uni.repository.DogRepository;

public class Main {

    public static void main(String[] args) {

        DogRepository dogRepository = new DogRepository();

        Dog myDog = new Dog("Rex", 1);
        Dog myDog3 = new Dog("Rexio", 3);

        dogRepository.create(myDog);
        dogRepository.create(myDog3);
        System.out.println(dogRepository.getAll());

        Dog myDog2 = new Dog("sparky", 1);

        dogRepository.update(myDog2);

        System.out.println(dogRepository.getAll());

        dogRepository.delete(new Dog("Rexio", 3));

        System.out.println(dogRepository.getAll());
    }
}
