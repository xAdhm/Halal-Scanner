public class Ingredient {

    private final String name;
    private final PermissibilityStatus status;

    public Ingredient(String name, PermissibilityStatus status) {
        this.name = name.toLowerCase();
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public PermissibilityStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return name + " - " + status;
    }

}