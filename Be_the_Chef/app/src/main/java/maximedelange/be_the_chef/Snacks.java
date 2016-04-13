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

public class Snacks extends AppCompatActivity
{

    // Fields
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecipeProvider recipeProvider = new RecipeProvider(this);
        recipeProvider.snacksList();

        ListView listView = (ListView) findViewById(R.id.listViewSnacks);
        List<ListViewItem> items = new ArrayList<>();
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.deepfriedsnacks;
            RecipeName = "Salty crunchy deepfried snacks";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.hotdogs;
            RecipeName = "American style juice hotdogs";
            amountOfPersons = 4;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.yogurtmueslifruit;
            RecipeName = "Exotic healthy yogurt with muesli and fruits";
            amountOfPersons = 3;
        }});
        items.add(new ListViewItem()
        {{
            photo = R.mipmap.yogurtwithfruit;
            RecipeName = "Rich flavoured yogurt with fresh fruit";
            amountOfPersons = 2;
        }});

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        listView.setAdapter(adapter);

        final String[] recipees = getResources().getStringArray(R.array.recipeSnacks);

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
