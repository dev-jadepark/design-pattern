package domain.userinfo.dao.oracle;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into oracle DB userInfoId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update oracle DB userInfoId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from oracle DB userInfoId = " + userInfo.getUserId());
    }

    @Override
    public void insertProduct(UserInfo userInfo) {

    }

    @Override
    public void updateProduct(UserInfo userInfo) {

    }

    @Override
    public void deleteProduct(UserInfo userInfo) {

    }
}
