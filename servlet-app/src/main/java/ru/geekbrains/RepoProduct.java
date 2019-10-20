package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class RepoProduct {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }

}
