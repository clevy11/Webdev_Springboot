package com.auca.innovation.crm.controller;



import com.auca.innovation.crm.core.product.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final IProductService productService;

    @GetMapping({"","/","/home"})
    public String productHomePage(Model model) {
        model.addAttribute("products",productService.findAllProduct());
        return "product/productList";

    }
}
