package maximedelange.be_the_chef;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maxime on 12-4-2016.
 */
public class RecipeProvider
{
    private static List<Recipe> recipeeList;
    private Context context;

    public RecipeProvider(Context context)
    {
        this.context = context;

        if(recipeeList == null)
        {
            //recipeeList = new ArrayList<Recipe>();
            //regularDishesList();
            //bakingList();
        }
    }

    public List<Recipe> getRecipees()
    {
        return recipeeList;
    }

    public static Recipe getRecipe(int index)
    {
        if(index >= recipeeList.size())
        {
            return null;
        }

        return recipeeList.get(index);
    }

    public void regularDishesList()
    {
        recipeeList = new ArrayList<Recipe>();

        String[] recipeName = context.getResources().getStringArray(R.array.recipeRegularDishes);
        String[] forAmountOfPeople = context.getResources().getStringArray(R.array.forAmountOfPeopleRegularDishes);
        String[] calories = context.getResources().getStringArray(R.array.caloriesRegularDishes);
        String[] cookingTime = context.getResources().getStringArray(R.array.cookingTimeRegularDishes);
        String[] description = context.getResources().getStringArray(R.array.descriptionRegularDishes);
        int[] regularDishesPicture = new int[]
                {
                        R.mipmap.meatloaf,
                        R.mipmap.spagettitomato,
                        R.mipmap.beefnoodle,
                        R.mipmap.cheeselasagne,
                        R.mipmap.paella,
                        R.mipmap.beefnoodle
                };

        for(int regularDishIndex = 0; regularDishIndex < recipeName.length; regularDishIndex++)
        {
            Recipe recipe = new Recipe();
            recipe.name = recipeName[regularDishIndex];
            recipe.amountOfPersons = forAmountOfPeople[regularDishIndex];
            recipe.calories = calories[regularDishIndex];
            recipe.cookingTime = cookingTime[regularDishIndex];
            recipe.description = description[regularDishIndex];
            recipe.foodPicture = regularDishesPicture[regularDishIndex];

            recipeeList.add(recipe);
        }
    }

    public void bakingList()
    {
        recipeeList = new ArrayList<Recipe>();

        String[] recipeName = context.getResources().getStringArray(R.array.recipeBaking);
        String[] forAmountOfPeople = context.getResources().getStringArray(R.array.forAmountOfPeopleBaking);
        String[] calories = context.getResources().getStringArray(R.array.caloriesBaking);
        String[] cookingTime = context.getResources().getStringArray(R.array.cookingTimeBaking);
        String[] description = context.getResources().getStringArray(R.array.descriptionBaking);
        int[] bakingPictures = new int[]
                {
                        R.mipmap.applepie,
                        R.mipmap.brownie,
                        R.mipmap.carrotcake,
                        R.mipmap.cheesecake,
                        R.mipmap.chocolatecake,
                        R.mipmap.chocolatechipcookie
                };

        for(int bakingIndex = 0; bakingIndex < recipeName.length; bakingIndex++)
        {
            Recipe recipe = new Recipe();
            recipe.name = recipeName[bakingIndex];
            recipe.amountOfPersons = forAmountOfPeople[bakingIndex];
            recipe.calories = calories[bakingIndex];
            recipe.cookingTime = cookingTime[bakingIndex];
            recipe.description = description[bakingIndex];
            recipe.foodPicture = bakingPictures[bakingIndex];

            recipeeList.add(recipe);
        }
    }

    public void healthyList()
    {
        recipeeList = new ArrayList<Recipe>();

        String[] recipeName = context.getResources().getStringArray(R.array.recipeHealthy);
        String[] forAmountOfPeople = context.getResources().getStringArray(R.array.forAmountOfPeopleHealthy);
        String[] calories = context.getResources().getStringArray(R.array.caloriesHealthy);
        String[] cookingTime = context.getResources().getStringArray(R.array.cookingTimeHealthy);
        String[] description = context.getResources().getStringArray(R.array.descriptionHealthy);
        int[] healthyPictures = new int[]
                {
                        R.mipmap.broccolisoup,
                        R.mipmap.yoghurtwalnut,
                        R.mipmap.chickenvegetable,
                        R.mipmap.salmonasparagus,
                        R.mipmap.veganpasta,
                        R.mipmap.vegantortilla
                };

        for(int bakingIndex = 0; bakingIndex < recipeName.length; bakingIndex++)
        {
            Recipe recipe = new Recipe();
            recipe.name = recipeName[bakingIndex];
            recipe.amountOfPersons = forAmountOfPeople[bakingIndex];
            recipe.calories = calories[bakingIndex];
            recipe.cookingTime = cookingTime[bakingIndex];
            recipe.description = description[bakingIndex];
            recipe.foodPicture = healthyPictures[bakingIndex];

            recipeeList.add(recipe);
        }
    }

    public void fastfoodList()
    {
        recipeeList = new ArrayList<Recipe>();

        String[] recipeName = context.getResources().getStringArray(R.array.recipeFastfood);
        String[] forAmountOfPeople = context.getResources().getStringArray(R.array.forAmountOfPeopleFastfood);
        String[] calories = context.getResources().getStringArray(R.array.caloriesFastfood);
        String[] cookingTime = context.getResources().getStringArray(R.array.cookingTimeFastfood);
        String[] description = context.getResources().getStringArray(R.array.descriptionFastfood);
        int[] healthyPictures = new int[]
                {
                        R.mipmap.burger,
                        R.mipmap.cheesepizza,
                        R.mipmap.frenchfries,
                        R.mipmap.macandcheese,
                        R.mipmap.onionrings,
                        R.mipmap.salamipizza
                };

        for(int bakingIndex = 0; bakingIndex < recipeName.length; bakingIndex++)
        {
            Recipe recipe = new Recipe();
            recipe.name = recipeName[bakingIndex];
            recipe.amountOfPersons = forAmountOfPeople[bakingIndex];
            recipe.calories = calories[bakingIndex];
            recipe.cookingTime = cookingTime[bakingIndex];
            recipe.description = description[bakingIndex];
            recipe.foodPicture = healthyPictures[bakingIndex];

            recipeeList.add(recipe);
        }
    }

    public void luxuryDishes()
    {
        recipeeList = new ArrayList<Recipe>();

        String[] recipeName = context.getResources().getStringArray(R.array.recipeLuxuryDishes);
        String[] forAmountOfPeople = context.getResources().getStringArray(R.array.forAmountOfPeopleLuxuryDishes);
        String[] calories = context.getResources().getStringArray(R.array.caloriesLuxuryDishes);
        String[] cookingTime = context.getResources().getStringArray(R.array.cookingTimeLuxuryDishes);
        String[] description = context.getResources().getStringArray(R.array.descriptionLuxuryDishes);
        int[] healthyPictures = new int[]
                {
                        R.mipmap.avocadocrab,
                        R.mipmap.beefpotato,
                        R.mipmap.coquilles,
                        R.mipmap.crabsoup,
                        R.mipmap.luxuryfish,
                        R.mipmap.sweetriceonion
                };

        for(int bakingIndex = 0; bakingIndex < recipeName.length; bakingIndex++)
        {
            Recipe recipe = new Recipe();
            recipe.name = recipeName[bakingIndex];
            recipe.amountOfPersons = forAmountOfPeople[bakingIndex];
            recipe.calories = calories[bakingIndex];
            recipe.cookingTime = cookingTime[bakingIndex];
            recipe.description = description[bakingIndex];
            recipe.foodPicture = healthyPictures[bakingIndex];

            recipeeList.add(recipe);
        }
    }

    public void snacksList()
    {
        recipeeList = new ArrayList<Recipe>();

        String[] recipeName = context.getResources().getStringArray(R.array.recipeSnacks);
        String[] forAmountOfPeople = context.getResources().getStringArray(R.array.forAmountOfPeopleSnacks);
        String[] calories = context.getResources().getStringArray(R.array.caloriesSnacks);
        String[] cookingTime = context.getResources().getStringArray(R.array.cookingTimeSnacks);
        String[] description = context.getResources().getStringArray(R.array.descriptionSnacks);
        int[] snackPictures = new int[]
                {
                        R.mipmap.deepfriedsnacks,
                        R.mipmap.hotdogs,
                        R.mipmap.yogurtmueslifruit,
                        R.mipmap.yogurtwithfruit,
                };

        for(int bakingIndex = 0; bakingIndex < recipeName.length; bakingIndex++)
        {
            Recipe recipe = new Recipe();
            recipe.name = recipeName[bakingIndex];
            recipe.amountOfPersons = forAmountOfPeople[bakingIndex];
            recipe.calories = calories[bakingIndex];
            recipe.cookingTime = cookingTime[bakingIndex];
            recipe.description = description[bakingIndex];
            recipe.foodPicture = snackPictures[bakingIndex];

            recipeeList.add(recipe);
        }
    }
}
