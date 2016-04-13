package maximedelange.csi_week_1_rebuild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Maxime on 7-4-2016.
 */
public class CrimeListAdapter extends ArrayAdapter<Crime>
{
    private Context context;
    private ArrayList<Crime> crimes;

    public CrimeListAdapter(Context context, ArrayList<Crime> crimes)
    {
        super(context, R.layout.criminallistitem, crimes);

        this.context = context;
        this.crimes = crimes;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Crime requestedCriminal = crimes.get(position);
        View criminalView;

        if(convertView != null)
        {
            criminalView = convertView;
        }
        else
        {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            criminalView = inflater.inflate(R.layout.criminallistitem, null);

        }

        TextView tviewName = (TextView)criminalView.findViewById(R.id.textViewShowName);
        TextView tviewBounty = (TextView)criminalView.findViewById(R.id.textViewTotalBounty);
        ImageView iviewPicture = (ImageView)criminalView.findViewById(R.id.imageViewMugshot);
        tviewName.setText("" + requestedCriminal.name);
        tviewBounty.setText(" - bounty: " + requestedCriminal.bountyInDollars);
        iviewPicture.setImageDrawable(requestedCriminal.mugshot);

        return criminalView;
    }
}
