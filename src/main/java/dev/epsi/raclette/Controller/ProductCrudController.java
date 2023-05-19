package dev.epsi.raclette.Controller;

import dev.epsi.raclette.Entity.Product;
import dev.epsi.raclette.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Munderstand
 * @created 15/03/2023 - 11:02
 * @project raclette
 */
@Controller
@RequestMapping("/products/crud/")
public class ProductCrudController {

    private  ProductService productService;

    public ProductCrudController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String listShopProducts(Model theModel) {

        //
        List<Product> theProducts = productService.findAll();

        //
        theModel.addAttribute("products", theProducts);

        return "crud/list-products";
    }


    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Product theProduct =new Product();

        theModel.addAttribute("product", theProduct);
        return "crud/product-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("productId") int theId,
                                    Model theModel) {
        Product theProduct=productService.findById(theId);
        theModel.addAttribute("product", theProduct);

        return "crud/product-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("productId") int theId) {
        productService.deleteById(theId);

        return "redirect:/products/crud/list";
    }

    @PostMapping("save")
    public String saveProduct(@ModelAttribute("product") Product theProduct) {
        productService.save(theProduct);
        return "redirect:/products/crud/list";
    }



}
