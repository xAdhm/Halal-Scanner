public class Ingredient {

    private final String name;
    private PermissibilityStatus status;

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

    public void setStatus(PermissibilityStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + " - " + status;
    }

}