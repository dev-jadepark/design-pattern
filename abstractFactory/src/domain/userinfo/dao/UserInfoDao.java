package domain.userinfo.dao;

import domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertProduct(UserInfo userInfo);

    void updateProduct(UserInfo userInfo);

    void deleteProduct(UserInfo userInfo);
}
