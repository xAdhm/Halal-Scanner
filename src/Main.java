import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, PermissibilityStatus> haramList = IngredientFileLoader.loadIngredients(new File("haram_list.txt"));
        HalalScanner scanner = new HalalScanner(haramList);
        Scanner input = new Scanner(System.in);

        String name;
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        String ingredientName;

        System.out.println("*************");
        System.out.println("Halal Scanner");
        System.out.println("*************");

        System.out.print("Enter Product Name: ");
        name = input.nextLine();

        while (true) {
            System.out.print("Enter ingredient name (enter 'done' when finished): ");
            ingredientName = input.nextLine().toLowerCase();
            if (ingredientName.equals("done")) break;
            Ingredient ingredient = new Ingredient(ingredientName, PermissibilityStatus.HALAL);
            ingredients.add(ingredient);
        }

        Product product = new Product(name, ingredients);
        scanner.analyze(product);

        System.out.println("************************");
        System.out.println("Product - Permissibility");
        System.out.println(product);

        input.close();
    }
}