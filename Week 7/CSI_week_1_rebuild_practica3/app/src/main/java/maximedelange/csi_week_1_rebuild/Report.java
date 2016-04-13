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
        startReportIntent();
    }

    public void startReportIntent()
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
        Intent intent = getIntent();
        String newName = intent.getStringExtra("crimName");

        criminalPicture = (ImageView)findViewById(R.id.imageViewCriminal);
        TextView criminalName = (TextView)findViewById(R.id.textViewCriminalName);
        criminalName.setText(newName);

        switch (newName)
        {
            case "Maxime":
                criminalPicture.setBackgroundResource(R.mipmap.maxime);
                newCriminalPicture = criminalPicture.getBackground();
                criminalPicture.setImageDrawable(newCriminalPicture);
                break;
            case "John Cena":
                criminalPicture.setBackgroundResource(R.mipmap.johncena);
                newCriminalPicture = criminalPicture.getBackground();
                criminalPicture.setImageDrawable(newCriminalPicture);
                break;
            case "Warrior blood":
                criminalPicture.setBackgroundResource(R.mipmap.warriorblood);
                newCriminalPicture = criminalPicture.getBackground();
                criminalPicture.setImageDrawable(newCriminalPicture);
                break;
            case "Drunken pitcher":
                criminalPicture.setBackgroundResource(R.mipmap.drunkenpitcher);
                newCriminalPicture = criminalPicture.getBackground();
                criminalPicture.setImageDrawable(newCriminalPicture);
                break;
        }
    }
}
