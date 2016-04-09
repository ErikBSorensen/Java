import java.util.ArrayList;
/**
 * A directory of Brew Pubs in South Metro Area (Tualatin, Tigard, Lake Oswego and Wilsonville)
 * 
 * @author Erik B. Sorensen
 * @version 2016.03.07
 * 
 * Note:  The beers listed in this directory are examples for demonstration 
 *        purposes only
 */
public class PubDirectory
{
    private ArrayList<Pub> pubList;
    private ArrayList<PriceRange> priceRating;
    private ArrayList<Beer> topBeer;
    
    /**
    * A directory South Metro pubs
    */
    public PubDirectory()
    {
        pubList = new ArrayList<Pub>();
        addPub("Birra Pub", "18749 SW Martinazzi Avenue", "Tualatin", 4, 3.5, 0, 3, "Stout");
        addPub("Big Eddy Tap House", "7642 SW Nyberg Street", "Tualatin", 0, 4.5, 0, 3, "IPA"); 
        addPub("Ancestry Brewing", "20585 SW 115th Ave", "Tualatin", 0, 0, 0, 2, "IPA");
        addPub("Two Kilts Brewing Co.", "14841 SW Tualatin-Sherwood Rd #501", "Tualatin", 4.4, 4.5, 0, 2, "Porter"); 
        addPub("McMenamins John Barleycorns", "14610 SW Sequoia Pkwy", "Tigard", 3.8, 3, 0, 2, "Hefewiezen");
        addPub("Max's Fanno Creek Brew Pub", "12562 SW Main St", "Tigard", 3.4, 3, 0, 2, "IPA"); 
        addPub("Maher's Pub", "352 B Ave", "Lake Oswego", 3.6, 0, 3, 1, "Saison Ale");
        addPub("Flyboy Brewing", "15630 Boones Ferry Rd", "Lake Oswego", 4.7, 4.5, 0, 2, "Pilsner"); 
        addPub("Stickmen Brewing Company", "40 N State St", "Lake Oswego", 3.7, 2.5, 0, 2, "Saison Ale"); 
        addPub("McMenamins Wilsonville Old Church & Pub", "30340 SW Boones Ferry Rd", "Wilsonville", 3.7, 3.5, 4, 2, "Stout");
        addPub("Ram Restaurant & Brewhouse", "29800 SW Boones Ferry Rd", "Wilsonville", 3.9, 3, 0, 2, "IPA");
    }
    
    /**
    * Adds new pub with name, address, city, google, yelp and user ratings and price ratings
    */
    public void addPub(String name, String address, String city, double googleRating, double yelpRating, int userRating, int priceRating, String topBeer)
    {
        pubList.add(new Pub(name, address, city, googleRating, yelpRating, userRating, priceRating, topBeer));
    }
    
    /**
    * @returns count of pubs in this directory
    */
    public int getNumPubs()
    {
        return pubList.size();
    }
    
    /**
    * Removes all the pubs in the directory
    */
    public void clearPubDirectory()
    {
        pubList.clear();
    }
    
    /**
    * Print information on this pub
    */
    public void printPub()
    {
        System.out.println("South Metro Brew Pubs");
        System.out.println("#################################");
        if(pubList.size() == 0) {
            System.out.println("No pubs in directory"); // prints message if no pubs are in the library
        }
        else {
            for (Pub p : pubList) { 
                p.printPubInfo();}  // prints pub name and their customer rating
        System.out.println("#################################");
        }
    }
}
