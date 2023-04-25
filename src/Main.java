interface DBConnectionInterface {
    public int connect();
}

class MySqlConnection implements DBConnectionInterface {

    @Override
    public int connect() {
        return 0;
    }
}

class PasswordReminder {
    private int dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection.connect();
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}