package org.example.service;

import org.example.model.DinnerResponse;
import org.example.model.Meal;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class DinnerService {
    private RestTemplate template;

    private final String API_URL = "https://www.themealdb.com/api/json/v1/1/random.php";

    public DinnerService() {
        this.template = new RestTemplate();

    }

    public Meal getRandomMeal() {
        String rawResponse = template.getForObject(API_URL, String.class);
        System.out.println("🔍 Raw API Response: " + rawResponse);


        DinnerResponse dinnerResponse = template.getForObject(API_URL, DinnerResponse.class);

        System.out.println("📢 Debug: dinnerResponse = " + dinnerResponse);
        System.out.println("📢 Debug: meals = " + (dinnerResponse != null ? dinnerResponse.getMeals() : "null"));


        if (dinnerResponse != null && dinnerResponse.getMeals() != null && !dinnerResponse.getMeals().isEmpty()) {
            return dinnerResponse.getMeals().get(0);
        }

        return null;
    }
}