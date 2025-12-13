package DIP;

public class Eagle extends Bird {
    public Eagle(String weight, String Colour, String type, String Size, String BeakType)
    {
        super(weight, Colour, type, Size, BeakType, new Gliding());
    }



}
