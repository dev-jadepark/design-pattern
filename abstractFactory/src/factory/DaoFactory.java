package factory;

import domain.product.dao.ProductDao;
import domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {

    public UserInfoDao createUserInfoDao();
    public ProductDao createProductDao();
}
