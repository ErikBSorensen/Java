/**
 * A directory of Brew Pubs in South Metro Area (Tualatin, Tigard, Lake Oswego and Wilsonville)
 * 
 * @author Erik B. Sorensen
 * @version 2016.03.07
 * 
 */
public class Pub
{
    private String name; // name of pubs
    private String address;  // address of pubs
    private String city;  // city of pubs
    private double googleRating; // google customer rating from 1 to 5 stars (0 = not rated yet)
    private double yelpRating; // yelp customer rating from 1.0 to 5.0 stars (0 = not rated yet)
    private int userRating;  // user rating from 1 -5 stars (0 = not rated yet)
    private int priceRating; // price range of pubs ($ - $$$$)(0 = not rated yet)
    private String topBeer; // top beer served at each pub (information is just for testing)

    /**
    * Create a pub with the title, address, city, Google rating, Yelp rating, user rating, price rating, and top beer
    * @param aName name of the pub
    * @param aAddress address of the pub
    * @param aCity city of the pub
    * @param aGoogleRating rating of a value from 1 to 5 inclusive
    * @param aYelpRating rating of a value from 1 to 5 inclusive
    * @param aUserRating rating of a value from 1 to 5 inclusive
    * @param aPriceRating rating of a a value from 1 to 4 ($ - $$$$)inclusive
    * @param aTopBeer top beer served at the pub
    */
    public Pub(String aName, String aAddress, String aCity, double aGoogleRating, 
    double aYelpRating, int aUserRating, int aPriceRating, String aTopBeer)
    {
        name = aName;
        address = aAddress;
        city = aCity;
        googleRating = aGoogleRating;
        yelpRating = aYelpRating;
        userRating = aUserRating;
        priceRating = aPriceRating;
        topBeer = aTopBeer;
    }

    /**
    * Create a pub with the title and user rating
    * @param aName name of the pub
    * @param aUserRating rating of a value from 1 to 5 inclusive
    */
    public Pub(String aName, int aUserRating)
    {
        name = aName;
        userRating = 0;
    }

    /**
    * @return the title of the pub
    */
    public String getName()
    {
        return name;
    }
    
    /**
    * @return the user rating of the pub
    */
    public int getUserRating()
    {
        return userRating;
    }
    
    /**
    * @return the Yelp rating of the pub
    */
    public double getYelpRating()
    {
        return yelpRating;
    }
    
    /**
    * @return the Google rating of the pub
    */
    public double getGoogleRating()
    {
        return googleRating;
    }
    
    /**
    * @param set the Google rating of the pub to the value given
    */
    public void setGoogleRating(double newGoogleRating)
    {
        if (newGoogleRating >= 1 && newGoogleRating <= 5) {
            googleRating = newGoogleRating;
        }
        else {
            System.out.println("Error: Valid range for star rating is 1 to 5");
        }
    }
    
    /**
    * @param set the Yelp rating of the pub to the value given
    */
    public void setYelpRating(double newYelpRating)
    {
        if (newYelpRating >= 1 && newYelpRating <= 5) {
            yelpRating = newYelpRating;
        }
        else {
            System.out.println("Error: Valid range for star rating is 1 to 5");
        }
    }
    
    /**
    * @param set the user rating of the pub to the value given
    */
    public void setUserRating(int newRating)
    {
        if (newRating >= 1 && newRating <= 5) {
            userRating = newRating;
        }
        else {
            System.out.println("Error: Valid range for star rating is 1 to 4");
        }
    }

    /**
    * Reset the user rating to 0 which mean not rated
    */
    public void resetUserRating()
    {
        userRating = 0;
    }
    
    /**
    * Increase the user rating of the pub by 1
    */
    public void increaseUserRating()
    {
        if (userRating < 5) {
            userRating = userRating + 1;
        }
    }

    /**
    * Decrease the user rating of the pub by 1
    */
    public void decreaseUserRating()
    {
        if (userRating > 1) {
            userRating = userRating - 1;
        }
    }

    /**
    * Print information on this pub
    */
    public void printPubInfo()
    {
        System.out.println("---------------------------------");
        System.out.println(name);
        System.out.println(address);
        System.out.println(city);
        System.out.println("Google Rating: " + googleRating);
        System.out.println("Yelp Rating: " + yelpRating);
        System.out.println("Top Beer Served: " + topBeer);
        System.out.println("Price Range($ - $$$$): " + priceRating);
        if (userRating == 0) {
            System.out.println("User Rating: (no rating)");
        }
        else{
        System.out.println("User Rating: " + userRating + " stars");
        }
        System.out.println("---------------------------------");
    }
}
