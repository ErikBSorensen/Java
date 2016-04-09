/**
 * A directory of Brew Pubs in South Metro Area (Tualatin, Tigard, Lake Oswego and Wilsonville)
 * 
 * @author Erik B. Sorensen
 * @version 2016.03.07
 * 
 * Note:  The beers listed in the PubDirectory class are examples for demonstration 
 *        purposes only
 */
public class Beer
{
    private String name;  // name of pubs
    private String address;  // address of pubs
    private String city;  // city of pubs
    private String topBeer; //top beers served

     /**
    * Constructor for objects of class PriceRange
    */
    public Beer (String aName, String aAddress, String aCity, String aTopBeer)
    {
        name = aName;
        address = aAddress;
        city = aCity;
        topBeer = aTopBeer;
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
        System.out.println("Top Beer Served: " + topBeer);
        System.out.println("---------------------------------");
    }
}
