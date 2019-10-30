package moskalevms.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import moskalevms.persistence.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getAllByCategory_Id(Long categoryId);
    List<Product> getMaxByPrice(Float price);
}
