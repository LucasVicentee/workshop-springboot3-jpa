package com.LucasVicentee.ProjetoWeb.repositories;

import com.LucasVicentee.ProjetoWeb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
