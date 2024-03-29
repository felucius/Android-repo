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

public class Fastfood extends AppCompatActivity
{
    //Fields
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecipeProvider recipeProvider = new RecipeProvider(this);
        recipeProvider.fastfoodList();

        ListView listView = (ListView) findViewById(R.id.listViewFastfood);
        List<ListViewItem> items = new ArrayList<>();
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.burger;
            RecipeName = "American classic burger";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.cheesepizza;
            RecipeName = "Italia meets America cheese pizza";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.frenchfries;
            RecipeName = "Not so french fries, french fries";
            amountOfPersons = 3;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.macandcheese;
            RecipeName = "New way mac and cheese";
            amountOfPersons = 10;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.onionrings;
            RecipeName = "Crispy delicious onion rings";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.salamipizza;
            RecipeName = "New italian styl salami pizza";
            amountOfPersons = 4;
        }});

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        listView.setAdapter(adapter);

        final String[] recipees = getResources().getStringArray(R.array.recipeFastfood);

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
