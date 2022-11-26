package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Stock {
    //TODO: Implement Part 1
    private List<StockIngredient> stockIngredients = new ArrayList<>();

    public int add(String name){

        StockIngredient s = findStockIngredient(name);

        if(s == null){
            return -1;
        }

        s.setQuantity(s.getQuantity() + 1);

        return s.getQuantity();

    }
    
    public int take(String name){

        StockIngredient s = findStockIngredient(name);

        if(s == null || s.getQuantity() == 0){
            return -1;
        }

        s.setQuantity(s.getQuantity() - 1);

        return s.getQuantity();
    }
    
    public StockIngredient findStockIngredient(String name) {

        for(int i = 0; i < getStockIngredients().size(); i++){
            if(Objects.equals(getStockIngredients().get(i).getName(), name)){
                return getStockIngredients().get(i);
            }
        }
        return null;

    }

    public void setStockIngredients(List<StockIngredient> stockIngredients) {
        this.stockIngredients = stockIngredients;
    }

    public List<StockIngredient> getStockIngredients() {
        return stockIngredients;
    }

    //TODO: Implement Part 2
}
