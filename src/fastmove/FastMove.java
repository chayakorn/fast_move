package fastmove;

import base.Bike;
import base.Person;
import data.ToyData;

public class FastMove {

    private FastBike[] fastBikes;
    private Person[] person;

    ToyData td = new ToyData();

    public static Bike[] getBikes() {
        return td.getBikes();
        
    }
    
    public static void main(String[] args) {
        getBikes();
    }
}
