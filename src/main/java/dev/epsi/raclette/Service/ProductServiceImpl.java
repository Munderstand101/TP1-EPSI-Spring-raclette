package dev.epsi.raclette.Service;

import dev.epsi.raclette.Entity.Product;
import dev.epsi.raclette.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * @author Munderstand
 * @created 15/03/2023 - 11:06
 * @project raclette
 */
@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository theProductRepository) {
        productRepository = theProductRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAllByOrderByNameAsc();
    }

    @Override
    public Product findById(int theId) {
        Optional<Product> result = productRepository.findById(theId);

        Product theProduct = null;

        if (result.isPresent()) {
            theProduct = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find product id - " + theId);
        }
        return theProduct;
    }

    @Override
    public void save(Product theProduct) {
        productRepository.save(theProduct);
    }

    @Override
    public void deleteById(int theId) {
        productRepository.deleteById(theId);
    }
}
