package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entites.Client;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long>{

}
