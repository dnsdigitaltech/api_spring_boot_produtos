package com.sosapi.crm.sosapi.repository;

import com.sosapi.crm.sosapi.models.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    //trazer um produto pelo id especifico
    Produto findById(long id);
}
