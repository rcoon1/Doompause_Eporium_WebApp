/**
 * 
 */
package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.Product;

/**
 * @author danie
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
