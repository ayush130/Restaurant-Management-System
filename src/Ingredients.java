public class Ingredients {
    String ingredientName;
    float quantity;

    public Ingredients(String ingredientName, float quantity) {
        this.ingredientName = ingredientName;
        this.quantity = quantity;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
