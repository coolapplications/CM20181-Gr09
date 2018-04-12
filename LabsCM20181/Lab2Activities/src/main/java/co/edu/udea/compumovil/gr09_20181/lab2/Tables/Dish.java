package co.edu.udea.compumovil.gr09_20181.lab2.Tables;

/**
 * Created by estudiante on 11/04/18.
 */

public class Dish {

    String dishUri;
    String dishName;
    String dishType;
    String dishIng;
    String dishPrice;

    public Dish(String dishUri, String dishName, String dishType, String dishIng, String dishPrice) {
        this.dishUri = dishUri;
        this.dishName = dishName;
        this.dishType = dishType;
        this.dishIng = dishIng;
        this.dishPrice = dishPrice;
    }

    public String getDishUri() {
        return dishUri;
    }

    public void setDishUri(String dishUri) {
        this.dishUri = dishUri;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public String getDishIng() {
        return dishIng;
    }

    public void setDishIng(String dishIng) {
        this.dishIng = dishIng;
    }

    public String getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(String dishPrice) {
        this.dishPrice = dishPrice;
    }
}
