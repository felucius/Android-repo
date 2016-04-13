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

public class Baking extends AppCompatActivity
{
    // Fields
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baking);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecipeProvider recipeProvider = new RecipeProvider(this);
        recipeProvider.bakingList();

        ListView listView = (ListView)findViewById(R.id.listViewBaking);
        List<ListViewItem> items = new ArrayList<>();
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.applepie;
            RecipeName = "Grandma's apple pie";
            amountOfPersons = 8;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.brownie;
            RecipeName = "Brownie";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.carrotcake;
            RecipeName = "Carrot cake";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem() {{
            photo = R.mipmap.cheesecake;
            RecipeName = "Cheese cake with fruits";
            amountOfPersons = 2;
        }});
        items.add(new ListViewItem() {{
            photo = R.mipmap.chocolatecake;
            RecipeName = "Rich chocolate cake";
            amountOfPersons = 10;
        }});
        items.add(new ListViewItem() {{
            photo = R.mipmap.chocolatechipcookie;
            RecipeName = "Old style chocolate-chip-cookie";
            amountOfPersons = 3;
        }});

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        listView.setAdapter(adapter);

        final String[] recipees = getResources().getStringArray(R.array.recipeBaking);

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
