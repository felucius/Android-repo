package maximedelange.csi_week_1_rebuild;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import static android.widget.AdapterView.*;

public class criminallist extends AppCompatActivity {

    private Context context = this;
    private Button btnReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminallist);

        CriminalProvider criminalprovider = new CriminalProvider(context);

        CriminalListAdapter criminallistadapter = new CriminalListAdapter(this, criminalprovider.GetCriminals());

        ListView listview = (ListView) findViewById(R.id.criminalListView);
        listview.setAdapter(criminallistadapter);


        listview.setOnItemClickListener(new OnItemClickListener() {
            //@TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(parent.getContext(), MainActivity.class);
                intent.putExtra("chosenCriminalPosition", position);
                //System.out.println(intent.toString());
                startActivity(intent);
            }
        });
    }

    public void startReportIntent()
    {
        btnReport = (Button)findViewById(R.id.Report);
        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
