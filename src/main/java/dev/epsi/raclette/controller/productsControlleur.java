package dev.epsi.raclette.controller;

import dev.epsi.raclette.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class productsControlleur {

    @Autowired
    ProductsRepository productsRepository;


}
