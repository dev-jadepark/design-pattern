package singleton;

public class ConnectionPool {

    private static ConnectionPool instance = new ConnectionPool();

    private ConnectionPool() {} //외부에서 생성할 수 없도록 private 생성자 선언

    public static ConnectionPool getInstance() {
        if(instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

}
