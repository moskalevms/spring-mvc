package moskalevms.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import moskalevms. persistence.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
