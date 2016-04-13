package maximedelange.be_the_chef;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class ReceptenList extends AppCompatActivity
{

    // Fields
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepten_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Getting the position number from the chosen recipe
        int recipePosition = getIntent().getIntExtra("recipePosition", 0);
        Recipe recipe = RecipeProvider.getRecipe(recipePosition);

        // Making text variables and bind them with an exisiting text ID.
        TextView recipeName = (TextView)findViewById(R.id.recipeName);
        TextView recipeAmountOfPersons = (TextView)findViewById(R.id.recipeAmountOfPersonsTextPeople);
        TextView recipeCalories = (TextView)findViewById(R.id.recipeCaloriesText);
        TextView recipeCookingTime = (TextView)findViewById(R.id.recipeCookingTimeText);
        TextView recipeDescription = (TextView)findViewById(R.id.recipeDescriptionText);
        ImageView recipePicture = (ImageView)findViewById(R.id.recipeImageText);

        // Setting the textview elements with new values of the list
        recipeName.setText(recipe.name);
        recipeAmountOfPersons.setText(recipe.amountOfPersons);
        recipeCalories.setText(recipe.calories);
        recipeCookingTime.setText(recipe.cookingTime);
        recipeDescription.setText(recipe.description);
        recipePicture.setImageResource(recipe.foodPicture);
    }
}
