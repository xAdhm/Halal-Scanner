import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class IngredientFileLoader {

    public static HashMap<String, PermissibilityStatus> loadIngredients(File file) throws FileNotFoundException {
        HashMap<String, PermissibilityStatus> map = new HashMap<String, PermissibilityStatus>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" - ");
            String ingredient = parts[0];
            PermissibilityStatus status = PermissibilityStatus.valueOf(parts[1]);
            map.put(ingredient, status);
        }

        scanner.close();
        return map;
    }

}