package maximedelange.csi_week_1_rebuild;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
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

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnReport;
    private Context context = this;
    CriminalProvider criminalProvider = new CriminalProvider(this);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Getting the position number from the chose criminal.
        int chosenCriminalPosition = getIntent().getIntExtra("chosenCriminalPosition", 0);
        Criminal criminal = CriminalProvider.GetCriminal(chosenCriminalPosition);

        // Making text variables and bind them with an existing text ID.
        TextView tviewName = (TextView)findViewById(R.id.textViewCriminalName);
        TextView tviewGender = (TextView)findViewById(R.id.textViewCriminalGender);
        TextView tviewAge = (TextView)findViewById(R.id.textViewCriminalAge);
        TextView tviewBounty = (TextView)findViewById(R.id.textViewCriminalBounty);
        TextView tviewDescription = (TextView)findViewById(R.id.textViewCriminalDescription);
        ImageView iviewMugshot = (ImageView)findViewById(R.id.imageViewCriminal);

        // Setting the textview elements with new values of the list.
        tviewName.setText(criminal.name);
        tviewGender.setText(criminal.gender);
        tviewAge.setText("" + criminal.age);
        tviewBounty.setText("" + criminal.getBountyInDollars());
        tviewDescription.setText(criminal.description);
        iviewMugshot.setImageDrawable(criminal.mugshot);

        // Passing the context and crimes of the criminal to the crimelist. Bind the listview
        // to the criminal listview and setting that listview do the adapter
        CrimeListAdapter crimeAdapter = new CrimeListAdapter(context, criminal.crimes);
        ListView criminalsCrimes = (ListView)findViewById(R.id.listOfCrimes);
        criminalsCrimes.setAdapter(crimeAdapter);

        startReportIntent();

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
}
