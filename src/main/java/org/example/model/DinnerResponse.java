package org.example.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DinnerResponse {

    @JsonProperty("meals")
    private List<Meal> meals;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeal(List<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "DinnerResponse{" +
                "meals=" + meals +
                '}';
    }
}
