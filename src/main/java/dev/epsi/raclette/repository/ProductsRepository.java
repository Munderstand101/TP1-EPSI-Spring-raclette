package dev.epsi.raclette.repository;


import dev.epsi.raclette.entity.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products,Long > {
}
