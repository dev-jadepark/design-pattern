package domain.userinfo.dao.mysql;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {

    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {

    }

    @Override
    public void insertProduct(UserInfo userInfo) {
        System.out.println("insert into MySQL DB userInfoId = " + userInfo.getUserId());
    }

    @Override
    public void updateProduct(UserInfo userInfo) {
        System.out.println("update MySQL DB userInfoId = " + userInfo.getUserId());
    }

    @Override
    public void deleteProduct(UserInfo userInfo) {
        System.out.println("delete from MySQL DB userInfoId = " + userInfo.getUserId());
    }
}
