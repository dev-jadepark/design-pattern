package domain.product.dao.mysql;

import domain.product.Product;
import domain.product.dao.ProductDao;

public class ProductMysqlDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MySQL DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update MySQL DB productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete from MySQL DB productId = " + product.getProductId());
    }
}
