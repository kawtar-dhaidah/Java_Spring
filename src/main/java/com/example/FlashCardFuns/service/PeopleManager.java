package com.example.FlashCardFuns.service;

import com.example.FlashCardFuns.model.People;

import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
    private final List<People> peopleList = new ArrayList<>();

    public PeopleManager() {
        peopleList.add(new People("1", "Kawtar Dhaidah", "Female", "person 1", "fc123"));
        peopleList.add(new People("2", "Juliet Smith", "Female", " person 2", "fc123"));
        peopleList.add(new People("3", "Louis Tom", "Male", " person 3", "fc234"));
    }

    public List<People> getPeopleByFlashcardId(String flashcardId) {
        List<People> result = new ArrayList<>();
        for (People person : peopleList) {
            if (person.getFlashcardId().equals(flashcardId)) {
                result.add(person);
            }
        }
        return result;
    }
}