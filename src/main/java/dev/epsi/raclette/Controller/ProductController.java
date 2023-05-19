package dev.epsi.raclette.controller;

import dev.epsi.raclette.Entity.Product;
import dev.epsi.raclette.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Munderstand
 * @created 15/03/2023 - 11:02
 * @project raclette
 */
@Controller
public class ProductController {

    private  ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "/", "/index" })
    public String listShopProducts(Model theModel) {

        //
        List<Product> theProducts = productService.findAll();

        //
        theModel.addAttribute("products", theProducts);

        return "index";
    }


    @GetMapping("/admin/list")
    public String listAdminProducts(Model theModel) {

        List<Product> theEmployees = productService.findAll();
        theModel.addAttribute("products", theEmployees);
        return "admin/list-products";
    }


}
