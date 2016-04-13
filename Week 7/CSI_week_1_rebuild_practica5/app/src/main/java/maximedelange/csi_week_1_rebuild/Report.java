package maximedelange.csi_week_1_rebuild;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Report extends AppCompatActivity {

    private Button btnBack;
    private Drawable newCriminalPicture;
    private ImageView criminalPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getTheRightCriminalPicture();
        backToMainActivity();
    }

    public void backToMainActivity()
    {
        btnBack = (Button)findViewById(R.id.Back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void getTheRightCriminalPicture()
    {
        // Getting the position number from the chose criminal.
        //int chosenCriminalPosition = getIntent().getIntExtra("chosenCriminalPosition", 0);
        //Criminal criminal = CriminalProvider.GetCriminal(chosenCriminalPosition);
        Intent intent = getIntent();
        String criminalName = intent.getStringExtra("criminalName");

        TextView crima = (TextView)findViewById(R.id.textViewCriminalName);
        crima.setText(criminalName);



        switch (criminalName)
        {
            case "John the Hacker":
                criminalPicture = (ImageView)findViewById(R.id.imageViewCriminal);
                criminalPicture.setImageResource(R.mipmap.johncena);
                break;
            case "Wendy Ferarri":
                criminalPicture = (ImageView)findViewById(R.id.imageViewCriminal);
                criminalPicture.setImageResource(R.mipmap.warriorblood);
                break;
            case "James Tyson":
                criminalPicture = (ImageView)findViewById(R.id.imageViewCriminal);
                criminalPicture.setImageResource(R.mipmap.suspect);
                break;
            case "Jack the Flipper":
                criminalPicture = (ImageView)findViewById(R.id.imageViewCriminal);
                criminalPicture.setImageResource(R.mipmap.maxime);
                break;
            case "Hans Pigmans":
                criminalPicture = (ImageView)findViewById(R.id.imageViewCriminal);
                criminalPicture.setImageResource(R.mipmap.drunkenpitcher);
                break;
        }
    }
}
