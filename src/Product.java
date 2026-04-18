import java.util.ArrayList;

public class Product {

    private final String name;
    private ArrayList<Ingredient> ingredients;
    private PermissibilityStatus status = PermissibilityStatus.HARAM;

    public Product(String name, ArrayList<Ingredient> ingredients) {
        this.name = name.toLowerCase();
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
        this.status = PermissibilityStatus.HARAM;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        this.status = PermissibilityStatus.HARAM;
    }

    public void removeIngredient(Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }

    public PermissibilityStatus getStatus() {
        return status;
    }

    public void setStatus(PermissibilityStatus status) {
        this.status = status;
    }

    public boolean isHalal() {
        return this.status == PermissibilityStatus.HALAL;
    }

    @Override
    public String toString() {
        return this.name + " - " + status;
    }

}