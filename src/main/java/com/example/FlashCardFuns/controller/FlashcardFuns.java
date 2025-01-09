package com.example.FlashCardFuns.controller;

import com.example.FlashCardFuns.model.Flashcard;
import com.example.FlashCardFuns.model.People;
import com.example.FlashCardFuns.service.FlashcardManager;
import com.example.FlashCardFuns.service.PeopleManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlashcardFuns {
    private final FlashcardManager flashcardManager = new FlashcardManager();
    private final PeopleManager peopleManager = new PeopleManager();

    @GetMapping("/getByFlashCardId")
    public FlashcardResponse getByFlashCardId(@RequestParam String cardId) {
        Flashcard flashcard = FlashcardManager.getFlashcardById(cardId);
        if (flashcard == null) {
            throw new RuntimeException("Flashcard not found!");
        }

        List<People> people = peopleManager.getPeopleByFlashcardId(cardId);
        return new FlashcardResponse(flashcard.getId(), people);
    }
}