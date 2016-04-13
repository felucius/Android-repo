package maximedelange.csi_week_1_rebuild;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnReport;
    private Drawable newCriminalPicture;
    private ImageView criminalPicture;

    public ArrayList<Criminal> criminalList = new ArrayList<>();
    public MainActivity mainactivity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.criminallist2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        changeCriminalInformation();
        startReportIntent();

        Resources res = getResources();
        mainactivity = this;
    }

    public void startReportIntent()
    {
        btnReport = (Button)findViewById(R.id.Report);
        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Report.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Method to set the information for each criminal to the intent.
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void changeCriminalInformation()
    {
        Intent intent = getIntent();
        String newName = intent.getStringExtra("crimName");
        String newGender = intent.getStringExtra("crimGender");
        String newAge = intent.getStringExtra("crimAge");
        String newBounty = intent.getStringExtra("crimBounty");
        String newDescription = intent.getStringExtra("crimDescription");

        TextView criminalName = (TextView)findViewById(R.id.textViewCriminalName);
        TextView criminalGender = (TextView)findViewById(R.id.textViewCriminalGender);
        TextView criminalAge = (TextView)findViewById(R.id.textViewCriminalAge);
        TextView criminalBounty = (TextView)findViewById(R.id.textViewCriminalBounty);
        TextView criminalDescription = (TextView)findViewById(R.id.textViewCriminalDescription);
        criminalPicture = (ImageView)findViewById(R.id.imageViewCriminal);

        criminalName.setText(newName);
        criminalGender.setText(newGender);
        criminalAge.setText(newAge);
        criminalBounty.setText(newBounty);
        criminalDescription.setText(newDescription);

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

    public void onItemClick(int cPosition)
    {
        Criminal criminal = (Criminal)criminalList.get(cPosition);

        // show alert
        //Toast.makeText(criminalList, " testing:: " + criminal.getName() + criminal.getGender() + criminal.getDescription(), Toast.LENGTH_LONG).show();
    }
}
