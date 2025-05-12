package com.scaler.productservicejan31capstone.repositories;
import com.scaler.productservicejan31capstone.models.Category;
import com.scaler.productservicejan31capstone.models.Product;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface  ProductRepository extends JpaRepository<Product, Long>
{
    Product save(Product product);

    List<Product>findAll();

    Optional<Product> findById(long id);

    List<Product> findByCategory(Category category );

    //declarative query
    List<Product> findByCategory_Name(String categoryName);

    //Hibernate query
    @Query("select p from Product p where p.category.name=:categoryName")
    List<Product> getProductByCategoryName(@Param("categoryName") String categoryName);


    @Query(value = CustomQuery.GET_PRODUCTS_FROM_CATEGORY_NAME,nativeQuery = true)
    List<Product> getProductsByCategoryNameNative(@Param("categoryName")String categoryName);

    Page<Product> findByNameContaining(String query, Pageable pageable);
}
