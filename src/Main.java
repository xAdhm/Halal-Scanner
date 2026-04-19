import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // load haram list
        HashMap<String, PermissibilityStatus> haramList = IngredientFileLoader.loadIngredients(new File("haram_list.txt"));
        HalalScanner scanner = new HalalScanner(haramList);

        // fully halal product
        ArrayList<Ingredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Ingredient("beef", PermissibilityStatus.HALAL));
        ingredients1.add(new Ingredient("salt", PermissibilityStatus.HALAL));
        Product product1 = new Product("Beef Jerky", ingredients1);
        scanner.analyze(product1);
        System.out.println(product1);

        // product with haram ingredient
        ArrayList<Ingredient> ingredients2 = new ArrayList<>();
        ingredients2.add(new Ingredient("wheat", PermissibilityStatus.HALAL));
        ingredients2.add(new Ingredient("pork", PermissibilityStatus.HARAM));
        Product product2 = new Product("Instant Noodles", ingredients2);
        scanner.analyze(product2);
        System.out.println(product2);

        // product with doubtful ingredient
        ArrayList<Ingredient> ingredients3 = new ArrayList<>();
        ingredients3.add(new Ingredient("milk", PermissibilityStatus.HALAL));
        ingredients3.add(new Ingredient("enzymes", PermissibilityStatus.DOUBTFUL));
        Product product3 = new Product("Cheese", ingredients3);
        scanner.analyze(product3);
        System.out.println(product3);
    }

}