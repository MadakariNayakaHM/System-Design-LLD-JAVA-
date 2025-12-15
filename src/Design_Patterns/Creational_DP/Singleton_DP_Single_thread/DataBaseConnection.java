package Design_Patterns.Creational_DP.Singleton_DP_Single_thread;

public class DataBaseConnection {

    private DataBaseConnection()
    {
        System.out.println("DBC connection initiated");
    }

    private static DataBaseConnection db;

    static DataBaseConnection getDBCInstance() {

        if(db == null)
        {
            System.out.println("Creating DBC 1st time");
            return db = new DataBaseConnection();
        }

            System.out.println("Returning already existing dcn instance");
            return db;

    }
}
