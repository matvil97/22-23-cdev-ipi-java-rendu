package composite.recette;

import java.util.HashMap;
import java.util.Map;

public class Recette {
    private Map<Ingredient, Double> ingredients = new HashMap<>();
    private Map<Recette, Double> sousRecettes = new HashMap<>();

    public void add(double quantite, Ingredient ingredient) {
        ingredients.put(ingredient, quantite);
    }

    public void addSousRecette(double quantite, Recette recette) {
        sousRecettes.put(recette, quantite);
    }

    public Map<Ingredient, Double> getIngredients() {
        return ingredients;
    }

    public Map<Recette, Double> getSousRecettes() {
        return sousRecettes;
    }

    public double calculerPrix() {
        double prixTotal = 0;

        // Prix des ingrédients
        for (Map.Entry<Ingredient, Double> entry : ingredients.entrySet()) {
            Ingredient ingredient = entry.getKey();
            double quantite = entry.getValue();
            double prixIngredient = ingredient.getPrix() * quantite;
            prixTotal += prixIngredient;
        }

        // Prix des sous-recettes
        for (Map.Entry<Recette, Double> entry : sousRecettes.entrySet()) {
            Recette sousRecette = entry.getKey();
            double quantite = entry.getValue();
            double prixUnitaireDeLaSousRecette = sousRecette.calculerPrix();
            double prixSousRecette = prixUnitaireDeLaSousRecette * quantite;
            prixTotal += prixSousRecette;
        }

        return prixTotal;
    }
}
