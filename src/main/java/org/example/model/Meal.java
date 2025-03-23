package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {

    @JsonProperty("idMeal")
    private String id;

    @JsonProperty("strMeal")
    private String name;

    @JsonProperty("strCategory")
    private String category;

    @JsonProperty("strArea")
    private String area;

    @JsonProperty("strInstructions")
    private String instructions;

    @JsonProperty("strMealThumb")
    private String imageUrl;

    @JsonProperty("strYoutube")
    private String youtubeUrl;

    @JsonProperty("strSource")
    private String sourceUrl;

    @JsonProperty("strIngredient1") private String ingredient1;
    @JsonProperty("strIngredient2") private String ingredient2;
    @JsonProperty("strIngredient3") private String ingredient3;
    @JsonProperty("strIngredient4") private String ingredient4;
    @JsonProperty("strIngredient5") private String ingredient5;
    @JsonProperty("strIngredient6") private String ingredient6;
    @JsonProperty("strIngredient7") private String ingredient7;
    @JsonProperty("strIngredient8") private String ingredient8;
    @JsonProperty("strIngredient9") private String ingredient9;
    @JsonProperty("strIngredient10") private String ingredient10;
    @JsonProperty("strIngredient11") private String ingredient11;
    @JsonProperty("strIngredient12") private String ingredient12;
    @JsonProperty("strIngredient13") private String ingredient13;
    @JsonProperty("strIngredient14") private String ingredient14;
    @JsonProperty("strIngredient15") private String ingredient15;
    @JsonProperty("strIngredient16") private String ingredient16;
    @JsonProperty("strIngredient17") private String ingredient17;
    @JsonProperty("strIngredient18") private String ingredient18;
    @JsonProperty("strIngredient19") private String ingredient19;
    @JsonProperty("strIngredient20") private String ingredient20;

    @JsonProperty("strMeasure1") private String measure1;
    @JsonProperty("strMeasure2") private String measure2;
    @JsonProperty("strMeasure3") private String measure3;
    @JsonProperty("strMeasure4") private String measure4;
    @JsonProperty("strMeasure5") private String measure5;
    @JsonProperty("strMeasure6") private String measure6;
    @JsonProperty("strMeasure7") private String measure7;
    @JsonProperty("strMeasure8") private String measure8;
    @JsonProperty("strMeasure9") private String measure9;
    @JsonProperty("strMeasure10") private String measure10;
    @JsonProperty("strMeasure11") private String measure11;
    @JsonProperty("strMeasure12") private String measure12;
    @JsonProperty("strMeasure13") private String measure13;
    @JsonProperty("strMeasure14") private String measure14;
    @JsonProperty("strMeasure15") private String measure15;
    @JsonProperty("strMeasure16") private String measure16;
    @JsonProperty("strMeasure17") private String measure17;
    @JsonProperty("strMeasure18") private String measure18;
    @JsonProperty("strMeasure19") private String measure19;
    @JsonProperty("strMeasure20") private String measure20;

    public String getIngredient(int i) {
        switch (i) {
            case 1:
                return ingredient1;
            case 2:
                return ingredient2;
            case 3:
                return ingredient3;
            case 4:
                return ingredient4;
            case 5:
                return ingredient5;
            case 6:
                return ingredient6;
            case 7:
                return ingredient7;
            case 8:
                return ingredient8;
            case 9:
                return ingredient9;
            case 10:
                return ingredient10;
            case 11:
                return ingredient11;
            case 12:
                return ingredient12;
            case 13:
                return ingredient13;
            case 14:
                return ingredient14;
            case 15:
                return ingredient15;
            case 16:
                return ingredient16;
            case 17:
                return ingredient17;
            case 18:
                return ingredient18;
            case 19:
                return ingredient19;
            case 20:
                return ingredient20;
            default:
                return null;
        }
    }

    public String getMeasure(int i) {
        switch (i) {
            case 1: return measure1;
            case 2: return measure2;
            case 3: return measure3;
            case 4: return measure4;
            case 5: return measure5;
            case 6: return measure6;
            case 7: return measure7;
            case 8: return measure8;
            case 9: return measure9;
            case 10: return measure10;
            case 11: return measure11;
            case 12: return measure12;
            case 13: return measure13;
            case 14: return measure14;
            case 15: return measure15;
            case 16: return measure16;
            case 17: return measure17;
            case 18: return measure18;
            case 19: return measure19;
            case 20: return measure20;
            default: return null;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getArea() {
        return area;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", area='" + area + '\'' +
                ", instructions='" + instructions + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", youtubeUrl='" + youtubeUrl + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                ", ingredient3='" + ingredient3 + '\'' +
                ", ingredient4='" + ingredient4 + '\'' +
                ", ingredient5='" + ingredient5 + '\'' +
                ", ingredient6='" + ingredient6 + '\'' +
                ", ingredient7='" + ingredient7 + '\'' +
                ", ingredient8='" + ingredient8 + '\'' +
                ", ingredient9='" + ingredient9 + '\'' +
                ", ingredient10='" + ingredient10 + '\'' +
                ", ingredient11='" + ingredient11 + '\'' +
                ", ingredient12='" + ingredient12 + '\'' +
                ", ingredient13='" + ingredient13 + '\'' +
                ", ingredient14='" + ingredient14 + '\'' +
                ", ingredient15='" + ingredient15 + '\'' +
                ", ingredient16='" + ingredient16 + '\'' +
                ", ingredient17='" + ingredient17 + '\'' +
                ", ingredient18='" + ingredient18 + '\'' +
                ", ingredient19='" + ingredient19 + '\'' +
                ", ingredient20='" + ingredient20 + '\'' +
                ", measure1='" + measure1 + '\'' +
                ", measure2='" + measure2 + '\'' +
                ", measure3='" + measure3 + '\'' +
                ", measure4='" + measure4 + '\'' +
                ", measure5='" + measure5 + '\'' +
                ", measure6='" + measure6 + '\'' +
                ", measure7='" + measure7 + '\'' +
                ", measure8='" + measure8 + '\'' +
                ", measure9='" + measure9 + '\'' +
                ", measure10='" + measure10 + '\'' +
                ", measure11='" + measure11 + '\'' +
                ", measure12='" + measure12 + '\'' +
                ", measure13='" + measure13 + '\'' +
                ", measure14='" + measure14 + '\'' +
                ", measure15='" + measure15 + '\'' +
                ", measure16='" + measure16 + '\'' +
                ", measure17='" + measure17 + '\'' +
                ", measure18='" + measure18 + '\'' +
                ", measure19='" + measure19 + '\'' +
                ", measure20='" + measure20 + '\'' +
                '}';
    }
}
