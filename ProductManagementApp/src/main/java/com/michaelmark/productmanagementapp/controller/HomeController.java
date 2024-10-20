package com.michaelmark.productmanagementapp.controller;

import com.michaelmark.productmanagementapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.michaelmark.productmanagementapp.service.ProductService;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @RequestMapping("/addProduct")
    public String showAddProductPage() {
        return "addProduct";
    }
    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product){
        service.saveProduct(product);
        return "redirect:/";
    }
    @RequestMapping("/searchProduct")
    public String showSearchProductPage() {
        return "searchProduct";
    }
    @PostMapping ("/searchProduct")
    public String search(@RequestParam(value="pid", required=false) Integer pid, @RequestParam(value="pname", required=false) String pname, @RequestParam(value="location", required=false) String location, @RequestParam(value="quantity", required=false) Integer quantity, Model model){
        // Call service to search for products based on criteria
        List<Product> products = service.searchProducts(pid, pname, location, quantity);
        model.addAttribute("products", products);
        for(Product p : products)
            System.out.println(p);
        return "productDetails";
    }
}
