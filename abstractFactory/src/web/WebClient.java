package web;

import domain.product.Product;
import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;
import factory.DaoFactory;
import factory.MysqlDaoFactory;
import factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("이순신");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");

        DaoFactory daoFactory = null;

        if(dbType.equals("MYSQL")){
            daoFactory = new MysqlDaoFactory();
        }else if(dbType.equals("ORACLE")){
            daoFactory = new OracleDaoFactory();
        }else {
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();

        userInfoDao.
    }
}
