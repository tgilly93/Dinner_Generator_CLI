package org.example;

import org.example.model.Meal;
import org.example.model.MealManager;
import org.example.service.DinnerService;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MealManager mealManager = new MealManager(scanner);

        System.out.println("🍽️ Welcome to Meal Generator! 🍽️");

        boolean running = true;
        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1️⃣  Pick a meal");
            System.out.println("2️⃣  View saved meals");
            System.out.println("3️⃣  Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    mealManager.pickMeal();
                    break;
                case 2:
                    mealManager.viewSavedMeals();
                    break;
                case 3:
                    System.out.println("👋 Thank you for using Meal Generator! Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice! Please select 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}