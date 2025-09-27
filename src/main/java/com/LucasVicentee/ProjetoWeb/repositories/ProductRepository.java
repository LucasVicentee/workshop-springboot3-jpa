package com.LucasVicentee.ProjetoWeb.repositories;

import com.LucasVicentee.ProjetoWeb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
