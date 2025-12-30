package Design_Patterns.Structural_DP.Readme.Adapter_DP;

public class LoggerAdapter implements Logger {

    private LagacyLogger ll = new LagacyLogger();

    @Override
    public void log(String message) {
        ll.writeLog(message);
    }
}
