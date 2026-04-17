public class Main {

    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("Chicken", PermissibilityStatus.HALAL);
        Ingredient ingredient2 = new Ingredient("Pork", PermissibilityStatus.HARAM);
        Ingredient ingredient3 = new Ingredient("Gelatin", PermissibilityStatus.DOUBTFUL);

        System.out.println(ingredient1);
        System.out.println(ingredient2);
        System.out.println(ingredient3);
    }

}