import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // create some ingredients
        Ingredient chicken = new Ingredient("Chicken", PermissibilityStatus.HALAL);
        Ingredient salt = new Ingredient("Salt", PermissibilityStatus.HALAL);
        Ingredient gelatin = new Ingredient("Gelatin", PermissibilityStatus.HARAM);

        // create a product with an ingredients list
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(chicken);
        ingredients.add(salt);

        Product product = new Product("Chicken Chips", ingredients);

        // test toString and default status
        System.out.println(product);
        System.out.println("Is halal: " + product.isHalal());

        // test addIngredient
        product.addIngredient(gelatin);
        System.out.println("After adding gelatin: " + product.getIngredients());

        // test removeIngredient
        product.removeIngredient(gelatin);
        System.out.println("After removing gelatin: " + product.getIngredients());

        // test setStatus
        product.setStatus(PermissibilityStatus.HALAL);
        System.out.println("After setting HALAL: " + product.isHalal());
    }

}