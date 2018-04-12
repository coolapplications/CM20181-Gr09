package co.edu.udea.compumovil.gr09_20181.lab2.Tables;

/**
 * Created by estudiante on 11/04/18.
 */

public class Drink {

    String drinkhUri;
    String drinkName;
    String drinkType;
    String drinkIng;
    String drinkPrice;

    public Drink(String drinkhUri, String drinkName, String drinkType, String drinkIng, String drinkPrice) {
        this.drinkhUri = drinkhUri;
        this.drinkName = drinkName;
        this.drinkType = drinkType;
        this.drinkIng = drinkIng;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkhUri() {
        return drinkhUri;
    }

    public void setDrinkhUri(String drinkhUri) {
        this.drinkhUri = drinkhUri;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkIng() {
        return drinkIng;
    }

    public void setDrinkIng(String drinkIng) {
        this.drinkIng = drinkIng;
    }

    public String getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(String drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
