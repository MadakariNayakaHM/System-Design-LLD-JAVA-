package Design_Patterns.Creational_DP.Singleton_DP_Single_thread;

public class Main {
    static void main() {
        DataBaseConnection.getDBCInstance();
        DataBaseConnection.getDBCInstance();
        DataBaseConnection.getDBCInstance();
    }
}
