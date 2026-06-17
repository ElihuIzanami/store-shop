package com.eime.storeshope.service.product;

import com.eime.storeshope.model.Product;
import com.eime.storeshope.request.AddProductRequest;
import com.eime.storeshope.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(ProductUpdateRequest product, Long productId);

    List<Product> getAllProducts();

    List<Product> getAllProductsByCategory(String category);

    List<Product> getAllProductsByBrand(String brand);

    List<Product> getAllProductsByCategoryAndBrand(String category, String brand);

    List<Product> getAllProductsByName(String name);

    List<Product> getAllProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);


}
