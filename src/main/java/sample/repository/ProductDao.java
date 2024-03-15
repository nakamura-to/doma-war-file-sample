package sample.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import sample.entity.Product;

@Dao
public interface ProductDao {

  @Select
  Product selectById(String id);
}
