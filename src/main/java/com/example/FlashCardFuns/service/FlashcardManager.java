package com.example.FlashCardFuns.service;

import com.example.FlashCardFuns.model.Flashcard;

import java.util.HashMap;
import java.util.Map;

public class FlashcardManager {
    private static final Map<String, Flashcard> flashcards = new HashMap<>();

    public FlashcardManager() {
        flashcards.put("fc123", new Flashcard("fc123", "Flashcard 1"));
        flashcards.put("fc234", new Flashcard("fc234", "Flashcard 2"));
    }

    public static Flashcard getFlashcardById(String id) {
        return flashcards.get(id);
    }
}