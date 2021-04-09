package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entites.Produit;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long >{
	@RestResource(path = "/byRef")
	public List<Produit> findByRef(@Param("ref")String reg);

}
