package com.example.cn1404;

public class ClassMonAn {
    String FoodName;
    String Introduct;
    String Ingredient;
    String Perform;
    public ClassMonAn(String FoodName, String Introduct, String Ingredient, String Perform ) {
        this.FoodName = FoodName;
        this.Introduct = Introduct;
        this.Ingredient = Ingredient;
        this.Perform = Perform;
    }
public ClassMonAn(){

}
    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }


    public String getIntroduct() {
        return Introduct;
    }

    public void setIngredient(String ingredient) {
        Ingredient = ingredient;
    }

    public String getIngredient() {
        return Ingredient;
    }

    public void setIntroduct(String introduct) {
        Introduct = introduct;
    }

    public String getPerform() {
        return Perform;
    }

    public void setPerform(String perform) {
        Perform = perform;
    }
}
