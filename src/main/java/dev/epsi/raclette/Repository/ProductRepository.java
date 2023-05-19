package dev.epsi.raclette.Repository;

import dev.epsi.raclette.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Munderstand
 * @created 15/03/2023 - 10:47
 * @project raclette
 */
public interface ProductRepository extends JpaRepository<Product, Integer>  {

    public List<Product> findAllByOrderByNameAsc();
}
