package maximedelange.be_the_chef;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Settings extends AppCompatActivity {

    // Fields
    private ImageButton btnBack;
    private ImageView btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        changeProfilePicture();
        giveRating();
        changeName();
    }

    /**
     * Creating a new intent that goes to the profile picture page on button click.
     */
    public void changeProfilePicture()
    {
        btnClick = (ImageView)findViewById(R.id.viewProfilePic);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ChangeProfilePicture.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Creating a new intent that goes to the change name page on button click.
     */
    public void changeName()
    {
        btnClick = (ImageView)findViewById(R.id.viewName);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ChangeName.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Creating a new intent that goes tot the rating page on button click.
     */
    public void giveRating()
    {
        btnClick = (ImageView)findViewById(R.id.viewRating);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Rating.class);
                startActivity(intent);
            }
        });
    }
}
