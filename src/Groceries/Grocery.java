package Groceries;

public class Grocery {
    private int quantity;
    private String name;
    private String category;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Grocery(){

    }

    public Grocery(int quantity, String name, String category) {
        this.quantity = quantity;
        this.name = name;
        this.category = category;
    }
}
