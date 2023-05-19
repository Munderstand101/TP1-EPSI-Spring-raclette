package dev.epsi.raclette.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Munderstand
 * @created 13/03/2023 - 08:45
 * @project raclette
 */
public class HomePageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    //TODO: others pages like about us


}
