package maximedelange.csi_week_1_rebuild;

/**
 * Created by Maxime on 7-4-2016.
 */
public class Criminal
{
    private String name;
    private String gender;
    private int age;
    private int bounty;
    private String description;
    private String imageLocation;

    public Criminal(String name, String gender, int age, int bounty, String desciption, String imageLocation)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bounty = bounty;
        this.description = desciption;
        this.imageLocation = imageLocation;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }

    public int getBounty()
    {
        return bounty;
    }

    public String getDescription()
    {
        return description;
    }

    public String getImageLocation()
    {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation)
    {
        this.imageLocation = imageLocation;
    }
}
