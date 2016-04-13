package maximedelange.csi_week_1_rebuild;

/**
 * Created by Maxime on 5-4-2016.
 */

import android.graphics.drawable.Drawable;
import android.location.Location;

import java.util.ArrayList;

/**
 * Class for storing details of the criminal. An object of a Criminal refers to a list of crimes.
 */
public class Criminal
{
    public String name;
    public String gender;
    public String description;
    public int age;

    public ArrayList<Crime> crimes;

    public Drawable mugshot;
    public Location lastKnownLocation;

    public int getBountyInDollars() {
        int bounty = 0;
        for(Crime crime : crimes) {
            bounty += crime.bountyInDollars;
        }

        return bounty;
    }
}
