package com.LucasVicentee.ProjetoWeb.repositories;

import com.LucasVicentee.ProjetoWeb.entities.Order;
import com.LucasVicentee.ProjetoWeb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
