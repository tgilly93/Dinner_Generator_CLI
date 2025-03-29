package org.example.service;

import org.example.model.DinnerResponse;
import org.example.model.Meal;
import org.springframework.web.client.RestTemplate;

public class DinnerService {
    private RestTemplate template;

    private final String API_URL = "https://www.themealdb.com/api/json/v1/1/random.php";

    public DinnerService() {
        this.template = new RestTemplate();

    }

    public Meal getRandomMeal() {

        DinnerResponse dinnerResponse = template.getForObject(API_URL, DinnerResponse.class);


        if (dinnerResponse != null && dinnerResponse.getMeals() != null && !dinnerResponse.getMeals().isEmpty()) {
            return dinnerResponse.getMeals().get(0);
        }

        return null;
    }
}