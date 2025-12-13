package DIP;

public class Parrot extends Bird {

    public Parrot(String weight, String Colour, String type, String Size, String BeakType)
    {
        super(weight, Colour, type, Size, BeakType, new Flapping());
    }

}
