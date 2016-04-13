package maximedelange.be_the_chef;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Maxime on 1-4-2016.
 */
public class ReceptenAdapter extends ArrayAdapter<Recipe>
{
    private Context context;
    private List<Recipe> recipees;

    public ReceptenAdapter(Context context, List<Recipe> recipees)
    {
        super(context, R.layout.receptenlistitem, recipees);

        this.context = context;
        this.recipees = recipees;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Recipe requestedRecipe = recipees.get(position);
        View recipeView;

        if(convertView != null)
        {
            recipeView = convertView;
        }
        else
        {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            recipeView = inflater.inflate(R.layout.receptenlistitem, null);

        }

        //TextView recipeName = (TextView)recipeView.findViewById(R.id.recipeName);
        //TextView recipeAmountOfPersons = (TextView)recipeView.findViewById(R.id.recipeAmountOfPersonsTextPeople);
        //TextView recipeCalories = (TextView)recipeView.findViewById(R.id.recipeCaloriesText);
        //TextView recipeCookingTime = (TextView)recipeView.findViewById(R.id.recipeCookingTimeText);
        //TextView recipeDescription = (TextView)recipeView.findViewById(R.id.recipeDescriptionText);
        //ImageView recipePicture = (ImageView)recipeView.findViewById(R.id.recipeImageText);

        //recipeName.setText("" + requestedRecipe.name);
        //recipeAmountOfPersons.setText("" + requestedRecipe.amountOfPersons);
        //recipeCalories.setText("" + requestedRecipe.calories);
        //recipeCookingTime.setText("" + requestedRecipe.cookingTime);
        //recipeDescription.setText("" + requestedRecipe.description);
        //recipePicture.setImageDrawable(requestedRecipe.foodPicture);

        return recipeView;
    }
}
