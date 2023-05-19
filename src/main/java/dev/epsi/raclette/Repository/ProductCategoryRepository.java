package dev.epsi.raclette.Repository;


import dev.epsi.raclette.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Munderstand
 * @created 15/03/2023 - 10:52
 * @project raclette
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

    public List<ProductCategory> findAllByOrderByNameAsc();
}
