package org.example.service;

import org.example.model.DinnerResponse;
import org.example.model.Meal;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class DinnerService {
    private RestTemplate template;

    private final String API_URL = "https://www.themealdb.com/api/json/v1/1/random.php";

    // ✅ Constructor to add Jackson JSON converter
    public DinnerService() {
        this.template = new RestTemplate();

        // ✅ Add Jackson message converter inside constructor
        List<HttpMessageConverter<?>> messageConverters = template.getMessageConverters();
        messageConverters.add(new MappingJackson2HttpMessageConverter());
    }

    public Meal getRandomMeal() {
        // ✅ Fetch raw JSON response
        String rawResponse = template.getForObject(API_URL, String.class);
        System.out.println("🔍 Raw API Response: " + rawResponse);

        // ✅ Deserialize response into DinnerResponse object
        DinnerResponse dinnerResponse = template.getForObject(API_URL, DinnerResponse.class);

        System.out.println("📢 Debug: dinnerResponse = " + dinnerResponse);
        System.out.println("📢 Debug: meals = " + (dinnerResponse != null ? dinnerResponse.getMeals() : "null"));


        if (dinnerResponse != null && dinnerResponse.getMeals() != null && !dinnerResponse.getMeals().isEmpty()) {
            return dinnerResponse.getMeals().get(0);  // ✅ Get first meal from list
        }

        return null;
    }
}