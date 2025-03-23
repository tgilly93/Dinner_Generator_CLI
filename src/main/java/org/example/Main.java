package org.example;

import org.example.service.DinnerService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hungry?! Let us choose your next meal!");
        LocalDate date = LocalDate.now();
        //System.out.println(date);

        DinnerService service = new DinnerService();
        service.getRandomMeal();
    }
}