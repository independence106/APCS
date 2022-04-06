import javax.print.DocFlavor.STRING;

public class Cereal {
    private String name;
    private String type;

    private double calories;
    private double protein;
    private double fat;
    private double sodium;
    private double fiber;
    private double carbs;
    private double sugar;
    private double potassium;
    private double vitamins;
    private double shelf;
    private double weight;
    private double cups;
    private double rating;

    // this is optional you don't have to use this constructor
    public Cereal(String name, String type, double calories, double protein, double fat, double sodium, double fiber, double carbs, double sugar, double potassium, double vitamins, double shelf, double weight, double cups, double rating) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbs = carbs;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }

    /** Assignment Methods */
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCalories(double calories) {
        this.calories= calories;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    public void setVitamins(double vitamins) {
        this.vitamins = vitamins;
    }

    public void setShelf(double shelf) {
        this.shelf = shelf;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCups(double cups) {
        this.cups = cups;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    /** Accessor Methods */

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getCalories() {
        return this.calories;
    }

    public double getProtein() {
        return this.protein;
    }

    public double getFat() {
        return this.fat;
    }

    public double getSodium() {
        return this.sodium;
    }

    public double getFiber() {
        return this.fiber;
    }

    public double getCarbs() {
       return this.carbs;
    }

    public double getSugar() {
        return this.sugar;
    }

    public double getPotassium() {
        return this.potassium;
    }

    public double getVitamins() {
        return this.vitamins;
    }

    public double getShelf() {
        return this.shelf;
    }

    public double getWeight() {
       return this.weight;
    }

    public double getCups() {
        return this.cups;
    }

    public double getRating() {
        return this.rating;
    }

    public static void main(String[] args) {
        Cereal appleJacks = new Cereal("Apple Jacks", "C", 110, 2, 1, 0, 125, 1, 11, 12, 12, 12, 12, 13, 20);
        Cereal Fruitloops = new Cereal("Fruit Loops", "C", 110, 2, 1, 0, 125, 1, 11, 12, 12, 12, 12, 13, 20);
        Cereal oatmeal = new Cereal("oatmeal", "C", 110, 2, 1, 0, 125, 1, 11, 12, 12, 12, 12, 13, 20);
    }

}