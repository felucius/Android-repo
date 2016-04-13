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

public class Healthy extends AppCompatActivity
{
    // Fields
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecipeProvider recipeProvider = new RecipeProvider(this);
        recipeProvider.healthyList();

        ListView listView = (ListView)findViewById(R.id.listViewHealthy);
        List<ListViewItem> items = new ArrayList<>();
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.broccolisoup;
            RecipeName = "Healthy brocolli soup";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.yoghurtwalnut;
            RecipeName = "Walnut and yoghurt with honey";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
                photo = R.mipmap.chickenvegetable;
                RecipeName = "Roast chicken with vegetables";
                amountOfPersons = 3;
        }});
        items.add(new ListViewItem()
        {{
                photo = R.mipmap.salmonasparagus;
                RecipeName = "Salmon with asparagus";
                amountOfPersons = 1;
        }});
        items.add(new ListViewItem()
        {{
                photo = R.mipmap.veganpasta;
                RecipeName = "Vegan pasta";
                amountOfPersons = 3;
        }});
        items.add(new ListViewItem()
        {{
                photo = R.mipmap.vegantortilla;
                RecipeName = "Vegan tortilla";
                amountOfPersons = 5;
        }});

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        listView.setAdapter(adapter);

        final String[] recipees = getResources().getStringArray(R.array.recipeHealthy);

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
