package Design_Patterns.Structural_DP.Readme.Adapter_DP;

public class Client {
    static void main() {
        LoggerAdapter la = new LoggerAdapter();

        la.log("Hi i am logger");
        la.log("Logging my 1at message");
    }
}
