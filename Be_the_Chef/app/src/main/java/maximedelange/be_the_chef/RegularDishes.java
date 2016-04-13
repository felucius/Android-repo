package maximedelange.be_the_chef;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RegularDishes extends AppCompatActivity
{

    // Fields
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_dishes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Instantie aanmaken van de recipeProvider. Recipeprovider maakt de lijst aan met recepten.
        RecipeProvider recipeProvider = new RecipeProvider(this);
        recipeProvider.regularDishesList();


        ListView listView = (ListView) findViewById(R.id.listViewRegularDishes);
        List<ListViewItem> items = new ArrayList<>();
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.meatloaf;
            RecipeName = "Momma's meatloaf";
            amountOfPersons = 6;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.spagettitomato;
            RecipeName = "Italian spagetti with tomato saus";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.beefnoodle;
            RecipeName = "Chinese beef noodle";
            amountOfPersons = 3;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.cheeselasagne;
            RecipeName = "Quik and fast cheese lasagne";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.paella;
            RecipeName = "Spanish delicious paella";
            amountOfPersons = 12;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.beefnoodle;
            RecipeName = "Indian style beef noodle";
            amountOfPersons = 3;
        }});

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        listView.setAdapter(adapter);

        final String[] recipees = getResources().getStringArray(R.array.recipeRegularDishes);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String name = recipees[position];

                Intent intent = new Intent(parent.getContext(), ReceptenList.class);
                intent.putExtra("recipePosition", position);
                startActivity(intent);
            }
        });
    }
}
