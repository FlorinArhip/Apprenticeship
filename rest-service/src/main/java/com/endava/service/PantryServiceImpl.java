package com.endava.service;

import com.endava.datasource.MyPantry;
import com.endava.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PantryServiceImpl implements PantryService{

    private final MyPantry pantry;

    @Autowired
    public PantryServiceImpl(MyPantry pantry){
        this.pantry = pantry;
    }

    @Override
    public List<Ingredient> getAllIngredients(){
        return pantry.getAllIngredients();
    }
}
