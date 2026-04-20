import java.util.HashMap;

public class HalalScanner {

    private HashMap<String, PermissibilityStatus> haramList;

    public HalalScanner(HashMap<String, PermissibilityStatus> haramList) {
        this.haramList = haramList;
    }

    public void analyze(Product product) {
        product.setStatus(PermissibilityStatus.HALAL);

        for (Ingredient ingredient : product.getIngredients()) {
            String name = ingredient.getName();

            if (haramList.containsKey(name)) {
                product.setStatus(haramList.get(name));
                ingredient.setStatus(haramList.get(name));

                if (product.getStatus().equals(PermissibilityStatus.HARAM)) {
                    break;
                }
            }
        }

    }

}