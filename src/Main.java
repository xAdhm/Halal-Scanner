import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("haram_list.txt");
        HashMap<String, PermissibilityStatus> map = IngredientFileLoader.loadIngredients(file);
        System.out.println(map);
    }

}