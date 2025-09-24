package com.LucasVicentee.ProjetoWeb.repositories;

import com.LucasVicentee.ProjetoWeb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
