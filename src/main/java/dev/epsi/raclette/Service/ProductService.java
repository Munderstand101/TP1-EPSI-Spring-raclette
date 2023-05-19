package dev.epsi.raclette.Service;

import dev.epsi.raclette.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Munderstand
 * @created 15/03/2023 - 11:05
 * @project raclette
 */
@Service
public interface ProductService {

    public List<Product> findAll();

    public Product findById(int theId);

    public void save(Product theProduct);

    public void deleteById(int theId);
}
