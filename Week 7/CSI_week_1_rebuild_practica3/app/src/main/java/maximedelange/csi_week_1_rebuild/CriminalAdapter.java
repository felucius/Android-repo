package maximedelange.csi_week_1_rebuild;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Maxime on 7-4-2016.
 */
public class CriminalAdapter extends BaseAdapter implements View.OnClickListener
{
    private Activity activity;
    private ArrayList criminalList;
    private static LayoutInflater inflater = null;
    public Resources resources;
    Criminal criminal = null;

    public CriminalAdapter(Activity activity, ArrayList criminalList, Resources localResources)
    {
        this.activity = activity;
        this.criminalList = criminalList;
        this.resources = localResources;

        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    // Size of the arraylist
    public int getCount()
    {
        return criminalList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = convertView;
        ViewHolder holder;

        if(convertView == null)
        {
            // Inflate criminallist.xml file for each row
            view = inflater.inflate(R.layout.content_criminallist, null);

            // View holder object to contain criminalist.xml file elements
            holder = new ViewHolder();
            holder.crimName = (TextView) view.findViewById(R.id.textViewCriminalName);
            holder.crimGender = (TextView) view.findViewById(R.id.textViewCriminalGender);
            holder.crimAge = (TextView) view.findViewById(R.id.textViewCriminalAge);
            holder.crimBounty = (TextView) view.findViewById(R.id.textViewCriminalBounty);
            holder.crimDescription = (TextView) view.findViewById(R.id.textViewCriminalDescription);
            holder.crimPicture = (ImageView) view.findViewById(R.id.imageViewCriminalPicture); // ID PATH NOG VERANDEREN

            // Set holder with layoutinflater.
            view.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) view.getTag();
        }

        if(criminalList.size() < 0)
        {
            holder.crimName.setText("No data available");
        }
        else
        {
            // Get each model object from the arraylist.
            criminal = null;
            criminal = (Criminal)criminalList.get(position);

            // Set model values in holder elements
            holder.crimName.setText(criminal.getName());
            holder.crimGender.setText(criminal.getGender());
            holder.crimAge.setText(criminal.getAge());
            holder.crimBounty.setText(criminal.getBounty());
            holder.crimDescription.setText(criminal.getDescription());
            holder.crimPicture.setImageResource(resources.getIdentifier("maximedelange.csi_week_1_rebuild:mipmap/" + criminal.getImageLocation()
                    , null, null));

            view.setOnClickListener(new OnItemClickListener(position));
        }

        return view;
    }

    @Override
    public void onClick(View v)
    {
        Log.v("Custom adapter", "Row button clicked...");
    }

    // Creating holder class to contain xml file elements
    public static class ViewHolder
    {
        public TextView crimName;
        public TextView crimGender;
        public TextView crimAge;
        public TextView crimBounty;
        public TextView crimDescription;
        public ImageView crimPicture;
    }

    private class OnItemClickListener implements View.OnClickListener
    {
        private int cPosition;

        OnItemClickListener(int position)
        {
            cPosition = position;
        }

        @Override
        public void onClick(View v)
        {
            MainActivity mainactivity = (MainActivity)activity;

            // Call onItemClick methode inside MainActivity class
            mainactivity.onItemClick(cPosition);
        }
    }
}
