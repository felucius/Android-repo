package maximedelange.csi_week_1_rebuild;

/**
 * Created by Maxime on 5-4-2016.
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for translating a Criminal to a ListView item in the ListView for criminals.
 */
public class CriminalListAdapter extends ArrayAdapter<Criminal>
{
    private Context context;
    private List<Criminal> criminals;

    public CriminalListAdapter(Context context, List<Criminal> criminals)
    {
        super(context, R.layout.criminallistitem, criminals);

        this.context = context;
        this.criminals = criminals;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Criminal requestedCriminal = criminals.get(position);
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
        tviewBounty.setText(" - bounty: " + requestedCriminal.getBountyInDollars());
        iviewPicture.setImageDrawable(requestedCriminal.mugshot);

        return criminalView;
    }
}
