package maximedelange.be_the_chef;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LuxuryDishes extends AppCompatActivity
{
    // Fields
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luxury_dishes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecipeProvider recipeProvider = new RecipeProvider(this);
        recipeProvider.luxuryDishes();

        ListView listView = (ListView)findViewById(R.id.listViewLuxuryDishes);
        List<ListViewItem> items = new ArrayList<>();
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.avocadocrab;
            RecipeName = "Delicious avocado soup with cooked crab";
            amountOfPersons = 1;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.beefpotato;
            RecipeName = "Beef rolled with baked potato and vegetables";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.coquilles;
            RecipeName = "Exotic coquilles with a light dressing";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.crabsoup;
            RecipeName = "Rich flavoured crab-soup";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.luxuryfish;
            RecipeName = "Soft white fish with orange caviar eggs";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.sweetriceonion;
            RecipeName = "Sweet rice with sauteded onions and light sweet dressing";
            amountOfPersons = 4;
        }});

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        listView.setAdapter(adapter);

        final String[] recipees = getResources().getStringArray(R.array.recipeLuxuryDishes);

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
