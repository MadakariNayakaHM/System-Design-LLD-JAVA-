package LSP.Voilation;

public class Main {
    static void main() throws Exception {
        Bird crow = new Crow("1","black", "crow", "x", "normal");
        Bird penguine = new Penguine("1","black", "penguine", "x", "normal");

        crow.fly();
        penguine.fly();
    }
}
