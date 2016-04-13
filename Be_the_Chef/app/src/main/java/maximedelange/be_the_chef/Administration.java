package maximedelange.be_the_chef;

import java.util.ArrayList;

/**
 * Created by Maxime on 25-3-2016.
 */
public class Administration
{
    // Fields
    private Recipe[] recipes;
    private ArrayList<Recipe> recipees;

    // Constructor
    public Administration()
    {
        this.recipees = new ArrayList<>();
    }

    // Methods
    public ArrayList<Recipe> getRecipees()
    {
        return recipees;
    }

    public void addRecipe(Recipe recipe)
    {
        recipees.add(recipe);
    }

    public void removeRecipe(Recipe recipe)
    {
        recipees.remove(recipe);
    }

    public void testBakingData()
    {
        //addRecipe(new Recipe("Chocolate pie", 500, 120, 10, 0));
        //addRecipe(new Recipe("Cake", 400, 100, 2, 0));
        //addRecipe(new Recipe("Carrot cake", 350, 80, 3, 0));
        //addRecipe(new Recipe("Cheese cake", 300, 60, 4, 0));
        //addRecipe(new Recipe("Chocolate fudge", 400, 90, 3, 0));
    }

    public void testingFastfoodData()
    {
        //addRecipe(new Recipe("Hamburgers", 500, 30, 2, 0));
        //addRecipe(new Recipe("Mac&cheese", 300, 45, 4, 0));
        //addRecipe(new Recipe("Pizza", 600, 30, 2, 0));
        //addRecipe(new Recipe("Onion rings", 200, 15, 1, 0));
        //addRecipe(new Recipe("Cheeseburgers", 650, 30, 2, 0));
    }

    public void testingRegularDishesData()
    {
        //addRecipe(new Recipe("Noodles with chicken", 400, 10, 1, 0));
        //addRecipe(new Recipe("Quiche", 600, 45, 4, 0));
        //addRecipe(new Recipe("Spagetti Bolognese", 600, 20, 2, 0));
        //addRecipe(new Recipe("Macaroni seafood", 300, 20, 4, 0));
        //addRecipe(new Recipe("Macaroni carbonara", 400, 25, 4, 0));
    }
}
