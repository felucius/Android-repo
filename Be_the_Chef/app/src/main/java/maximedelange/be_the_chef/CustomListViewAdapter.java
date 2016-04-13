package maximedelange.be_the_chef;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Maxime on 12-4-2016.
 */
public class CustomListViewAdapter extends BaseAdapter
{

    LayoutInflater inflater;
    List<ListViewItem> items;

    public CustomListViewAdapter(Activity context, List<ListViewItem> items) {
        super();

        this.items = items;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return items.size();
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        ListViewItem item = items.get(position);

        View vi = convertView;

        if (convertView == null)
        {
            vi = inflater.inflate(R.layout.item_row, null);
        }

        ImageView recipePicture = (ImageView)vi.findViewById(R.id.recipeImageText);
        TextView recipeName = (TextView)vi.findViewById(R.id.recipeName);
        TextView recipeAmountOfPersons = (TextView)vi.findViewById(R.id.recipeAmountOfPersons);

        recipePicture.setImageResource(item.photo);
        recipeName.setText(item.RecipeName);
        recipeAmountOfPersons.setText(("" + item.amountOfPersons));

        return vi;
    }
}

