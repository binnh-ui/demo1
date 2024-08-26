package com.example.demo.Controllers;


import com.example.demo.models.product;
import com.example.demo.services.ProductsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/website")
public class HomeWebController {
    @Autowired
    private ProductsRespository repo;

    @GetMapping({"", "/"})
    public String showProductList(Model model) {
        List<product> products = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("products",products);
        return "website/home";
    }
}
