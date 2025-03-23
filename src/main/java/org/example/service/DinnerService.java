package org.example.service;

import org.springframework.web.client.RestTemplate;

public class DinnerService {
    private RestTemplate template = new RestTemplate();

    private final String API_URL = "https://www.themealdb.com/api/json/v1/1/random.php";

    public void getRandomMeal() {
        String url = API_URL;

        String response = template.getForObject(url, String.class).toString();
        System.out.println(response);
    }
}