package org.example.model;

import org.example.service.DinnerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MealManager {
    private final DinnerService dinnerService = new DinnerService();
    private final List<Meal> savedMeals = new ArrayList<>();
    private final Scanner scanner;

    public MealManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void pickMeal() {
        boolean choosing = true;

        while (choosing) {
            Meal meal = dinnerService.getRandomMeal();

            if (meal != null) {
                displayMeal(meal);

                System.out.println("\nWould you like to:");
                System.out.println("1️⃣ Save this meal");
                System.out.println("2️⃣ Generate a new meal");
                System.out.println("3️⃣ Return to main menu");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        savedMeals.add(meal);
                        System.out.println("✅ Meal saved!");
                        choosing = false;
                        break;
                    case 2:
                        System.out.println("🔄 Generating a new meal...");
                        break;
                    case 3:
                        choosing = false;
                        break;
                    default:
                        System.out.println("❌ Invalid choice! Please select 1, 2, or 3.");
                }
            } else {
                System.out.println("❌ No meal found. Try again.");
            }
        }
    }

    public void viewSavedMeals() {
        if (savedMeals.isEmpty()) {
            System.out.println("📂 No saved meals yet.");
        } else {
            System.out.println("\n📖 Saved Meals:");
            for (int i = 0; i < savedMeals.size(); i++) {
                Meal meal = savedMeals.get(i);
                System.out.println((i + 1) + ". " + meal.getName() + " (" + meal.getCategory() + " - " + meal.getArea() + ")");
            }
        }
    }

    private void displayMeal(Meal meal) {
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
        System.out.println("=================================");
    }
}
