package de.tum.in.ase;

import java.util.List;

public class Burger {
    //TODO: Implement Part 1 added
    private String name;
    private List<String> ingredients;

    public Burger(String name, List<String> ingredients){
        if(name == null){
            setName("");
        } else {
            setName(name);
        }

        if (ingredients == null){
            setIngredients(null);
        } else {
            setIngredients(ingredients);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
