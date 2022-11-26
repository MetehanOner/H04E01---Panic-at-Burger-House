package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    //TODO: Implement Part 1
    private List<StockIngredient> stockIngredients = new ArrayList<>();

    public int add(String name){
        if(!(stockIngredients==null)){
            return -1;
        }

        return 0;

    }
    
    public int take(String a){
        return 0;
    }
    
    public StockIngredient findStockIngredient(String a){
        return new StockIngredient(a, 0,0);
    }

    public void setStockIngredients(List<StockIngredient> stockIngredients) {
        this.stockIngredients = stockIngredients;
    }

    public List<StockIngredient> getStockIngredients() {
        return stockIngredients;
    }

    //TODO: Implement Part 2
}
