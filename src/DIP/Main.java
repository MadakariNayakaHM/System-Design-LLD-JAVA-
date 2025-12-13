package DIP;

public class Main {

    static void main() {
        Bird parrot = new Parrot("1","green", "parrot", "4", "normal");
        Bird eagle = new Eagle("2", "brown", "eagle", "8", "normal");

        eagle.performFly();
        parrot.performFly();

    }
}
