package de.tum.in.ase;

import java.util.*;

public class BurgerShop {
    //TODO: Implement Part 1
    private List<Burger> orders;
    private Stock stock;

    public BurgerShop(){
        Stock s = new Stock();
        setStock(s);
        List<Burger> orders = new ArrayList<>();
        setOrders(orders);
    }

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

        StockIngredient fresh = new StockIngredient(name, price, quantity);

        if(getStock().findStockIngredient(name) != null){
            int q = getStock().findStockIngredient(name).getQuantity() + quantity;
            getStock().findStockIngredient(name).setQuantity(q);
        }

        getStock().getStockIngredients().add(fresh);
    }

    public void orderBurger(Burger burger){
        getOrders().add(burger);
        List<String> burgerIngredients = burger.getIngredients();

        checkOrderReady();

    }

    public void checkOrderReady(){
        if(getOrders().size() == 0){
            return;
        }

        for(int i=0; i < getOrders().size(); i++){
           for(int j=0; j < getOrders().get(i).getIngredients().size(); j++){

               StockIngredient s = getStock().findStockIngredient(getOrders().get(i).getIngredients().get(j));
               if(s == null && s.getQuantity()<=0){
                   return;
               }

           }


           System.out.println("The order is ready: " + getOrders().get(i).getName());
           getOrders().remove(getOrders().get(i));
        }

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
}
