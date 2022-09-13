package singleton;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();

        System.out.println(instance1 == instance2); //true

        Calendar calendar = Calendar.getInstance(); //날짜정보는 한번만 생성되면 되기 때문에 싱글톤패턴이 적용된 것이다.
    }
}
