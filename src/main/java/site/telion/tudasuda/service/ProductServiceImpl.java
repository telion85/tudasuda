package site.telion.tudasuda.service;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String addProduct(String productName) {
        return productName;
    }
}
