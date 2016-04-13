package maximedelange.csi_week_1_rebuild;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.widget.AdapterView.*;

public class criminallist extends AppCompatActivity {

    private String name;
    private String age;
    private String gender;
    private String bounty;
    private String description;
    private Drawable photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminallist);

        // Get a reference to the listview by its ID.
        ListView listview = (ListView)findViewById(R.id.criminalListView);
        // Get a reference to the list with names ID.
        final String[] criminals = getResources().getStringArray(R.array.names);
        // Create an adapter that feeds the data to the listview.
        listview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, criminals));



        listview.setOnItemClickListener(new OnItemClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent;


                String name = criminals[position];
                String criminalName = name;
                // switch aangemaakt. De waarde wordt opgezocht aan de hand van de geselecteerde naam.
                // Vervolgens wordt er een intent aangemaakt die verwijst naar de juiste pagina.
                switch(criminalName)
                {
                    case "Maxime":
                        gender = getResources().getString(R.string.Gender);
                        age = getResources().getString(R.string.Age);
                        bounty = getResources().getString(R.string.Bounty);
                        description = getResources().getString(R.string.Description);

                        intent = new Intent(parent.getContext(), MainActivity.class);
                        intent.putExtra("crimName",criminalName);
                        intent.putExtra("crimGender", gender);
                        intent.putExtra("crimAge", age);
                        intent.putExtra("crimBounty", bounty);
                        intent.putExtra("crimDescription", description);
                        startActivity(intent);

                        break;
                    case "John Cena":
                        gender = getResources().getString(R.string.Gender_2);
                        age = getResources().getString(R.string.Age_2);
                        bounty = getResources().getString(R.string.Bounty_2);
                        description = getResources().getString(R.string.Description_2);

                        intent = new Intent(parent.getContext(), MainActivity.class);
                        intent.putExtra("crimName",criminalName);
                        intent.putExtra("crimGender", gender);
                        intent.putExtra("crimAge", age);
                        intent.putExtra("crimBounty", bounty);
                        intent.putExtra("crimDescription", description);
                        startActivity(intent);
                        break;
                    case "Warrior blood":
                        gender = getResources().getString(R.string.Gender_3);
                        age = getResources().getString(R.string.Age_3);
                        bounty = getResources().getString(R.string.Bounty_3);
                        description = getResources().getString(R.string.Description_3);

                        intent = new Intent(parent.getContext(), MainActivity.class);
                        intent.putExtra("crimName",criminalName);
                        intent.putExtra("crimGender", gender);
                        intent.putExtra("crimAge", age);
                        intent.putExtra("crimBounty", bounty);
                        intent.putExtra("crimDescription", description);
                        startActivity(intent);
                        break;
                    case "Drunken pitcher":
                        gender = getResources().getString(R.string.Gender_5);
                        age = getResources().getString(R.string.Age_5);
                        bounty = getResources().getString(R.string.Bounty_5);
                        description = getResources().getString(R.string.Description_5);

                        intent = new Intent(parent.getContext(), MainActivity.class);
                        intent.putExtra("crimName",criminalName);
                        intent.putExtra("crimGender", gender);
                        intent.putExtra("crimAge", age);
                        intent.putExtra("crimBounty", bounty);
                        intent.putExtra("crimDescription", description);
                        startActivity(intent);
                        break;
                }
            }
        });

    }

}
