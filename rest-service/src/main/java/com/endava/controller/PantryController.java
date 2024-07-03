package com.endava.controller;

import com.endava.model.Ingredient;
import com.endava.service.PantryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pantry")
public class PantryController {

    private final PantryService pantryService;

    @Autowired
    public PantryController(PantryService pantryService){
        this.pantryService = pantryService;
    }

    @GetMapping
    public ResponseEntity<List<Ingredient>> getAllIngredients(){
        return ResponseEntity.ok(pantryService.getAllIngredients());
    }
}
