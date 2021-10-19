package com.uni.repository;


import com.uni.model.Dog;

import java.util.List;

public class DogRepository extends InMemoryRepository<Dog> {

    public DogRepository() {
        super();
    }

    @Override
    public Dog update(Dog obj) {
        Dog dogToUpdate = this.repoList.stream()
                .filter(dog -> dog.getId() == obj.getId())
                .findFirst()
                .orElseThrow();

        dogToUpdate.setName(obj.getName());

        return dogToUpdate;
    }
}
