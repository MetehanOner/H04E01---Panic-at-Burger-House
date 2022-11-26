package de.tum.in.ase;

import java.util.List;
import java.util.Objects;

public class BurgerShop {
    //TODO: Implement Part 1
    private List<Burger> orders;
    private Stock stock;

    public int calculateTotalPrice(Burger burger){

        List<String> burgerIngredients = burger.getIngredients();

        int cost = 0;
        for(int i = 0; i < burgerIngredients.size(); i++){
            if(getStock().findStockIngredient(burgerIngredients.get(i))!=null){
                if(Objects.equals(burgerIngredients.get(i), getStock().findStockIngredient(burgerIngredients.get(i)).getName())){
                    cost += getStock().findStockIngredient(burgerIngredients.get(i)).getPrice();
                }
            }
        }

        return cost;
    }

    public void acceptSupplyDelivery(String name, int price, int quantity){

    }

    public void orderBurger(Burger burger){

    }

    public void checkOrderReady(){

    }

    public void setOrders(List<Burger> orders) {
        this.orders = orders;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<Burger> getOrders() {
        return orders;
    }

    public Stock getStock() {
        return stock;
    }

    //TODO: Implement Part 3

    //TODO: Implement Part 4
}
