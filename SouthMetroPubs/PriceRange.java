/**
 * A directory of Brew Pubs in South Metro Area (Tualatin, Tigard, Lake Oswego and Wilsonville)
 * 
 * @author Erik B. Sorensen
 * @version 2016.03.07
 */
public class PriceRange
{
    private String name;  // name of pubs
    private String address;  // address of pubs
    private String city;  // city of pubs
    private int priceRating; //price range of pubs ($ - $$$$)

    /**
    * Constructor for objects of class PriceRange
    */
    public PriceRange(String aName, String aAddress, String aCity)
    {
        name = aName;
        address = aAddress;
        city = aCity;
    }
    
    /**
    * @return the price rating of this pub
    */
    public int getPriceRating()
    {
        return priceRating;
    }
    
    /**
    * @param set the price rating of this pub
    */
    public void setPriceRating(int newPriceRating)
    {
        if (newPriceRating >= 1 && newPriceRating <= 4) {
            priceRating = newPriceRating;
        }
        else {
            System.out.println("Error: Valid range for price rating is 1 to 4 ($ - $$$$)");
        }
    }
    
    /**
    * Print information including ($ - $$$$) price rating on this pub
    */
    public void printPubInfo()
    {
        System.out.println("South Metro Brew Pubs");
        System.out.println("---------------------------------");
        System.out.println(name);
        System.out.println(address);
        System.out.println(city);
        if (priceRating == 0) {
            System.out.println("User Price Rating: (no price rating)");
        }
        else{
        System.out.println("Price Range($ - $$$$): " + priceRating);
        }
        System.out.println("---------------------------------");
    }
}
