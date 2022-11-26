package de.tum.in.ase;

public class StockIngredient {
    //TODO: Implement Part 1 added
    private String name;
    private int price;
    private int quantity;

    public StockIngredient(String name, int price, int quantity){
        if(name == null){
            setName("");
        } else {
            setName(name);
        }

        if(price < 0){
            setPrice(0);
        }else {
            setPrice(price);
        }

        if(price < 0){
            setQuantity(0);
        }else {
            setQuantity(quantity);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if(!(quantity < 0)){
            this.quantity = quantity;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
