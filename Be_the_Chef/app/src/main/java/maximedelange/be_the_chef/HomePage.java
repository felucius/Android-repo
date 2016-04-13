package maximedelange.be_the_chef;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {

    private ImageView btnGoToActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        goToRegularDishes();
        goToBaking();
        goToCookBook();
        goToHealthy();;
        goToLuxuryFoods();
        goToSettings();
        goToSnacks();
        goToFastfood();
    }

    /**
     * Create an intent to go to the regular dishes page on a button click.
     */
    public void goToRegularDishes()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewRegularDishes);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), RegularDishes.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Create an intent to go to the baking page on a button click.
     */
    public void goToBaking()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewBaking);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), Baking.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Create an intent to go to the healthy page on a button click.
     */
    public void goToHealthy()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewHealthy);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), Healthy.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Create an intent to go to the fastfood page on a button click.
     */
    public void goToFastfood()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewFastfood);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), Fastfood.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Create an intent to go to the luxury foods page on a button click.
     */
    public void goToLuxuryFoods()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewLuxuryDishes);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), LuxuryDishes.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Create an intent to go to the snacks page on a button click.
     */
    public void goToSnacks()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewSnacks);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), Snacks.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Create an intent to go to the settings page on a button click.
     */
    public void goToSettings()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewSettings);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), Settings.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Create an intent to go to the cookbook page on a button click.
     */
    public void goToCookBook()
    {
        btnGoToActivity = (ImageView)findViewById(R.id.viewCookbook);
        btnGoToActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), CookBook.class);
                startActivity(intent);
            }
        });
    }


}
