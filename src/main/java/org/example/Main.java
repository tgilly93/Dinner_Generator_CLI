package org.example;

import org.example.model.Meal;
import org.example.service.DinnerService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hungry?! Let us choose your next meal!");
        LocalDate date = LocalDate.now();
        //System.out.println(date);

        DinnerService dinnerService = new DinnerService();
        Meal meal = dinnerService.getRandomMeal();

        if (meal != null) {
            System.out.println("\n🍽️  Random Meal Generated 🍽️");
            System.out.println("================================");
            System.out.println("Name: " + meal.getName());
            System.out.println("Category: " + meal.getCategory());
            System.out.println("Cuisine: " + meal.getArea());
            System.out.println("Instructions: " + meal.getInstructions());
            System.out.println("\n Ingredients & Measurements:");
            System.out.println("--------------------------------");

            for (int i = 1; i <= 20; i++) {
                String ingredient = meal.getIngredient(i);
                String measurement = meal.getMeasure(i);
                if (ingredient != null && !ingredient.isEmpty()) {
                    System.out.println("✅ " + ingredient + " - " + (measurement != null ? measurement : ""));
                }
            }

            System.out.println("\n📸 Image: " + meal.getImageUrl());
            System.out.println("🎥 YouTube Tutorial: " + meal.getYoutubeUrl());
            System.out.println("🔗 Source: " + meal.getSourceUrl());
            System.out.println("=================================\n");
        } else {
            System.out.println("No meal found.");
        }
    }
}