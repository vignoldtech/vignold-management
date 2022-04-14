package de.vignold.vignoldmanagement.controller;

import de.vignold.vignoldmanagement.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/products")
public class ProductController {

    @GetMapping("/all")
    public List<ProductDTO> findAll()
    {
        //insert your logic here and return it
        return null;
    }
}
