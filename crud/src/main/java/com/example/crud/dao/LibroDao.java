package com.example.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.entity.LibroEntity;

public interface LibroDao extends JpaRepository<LibroEntity, Long>{

}
