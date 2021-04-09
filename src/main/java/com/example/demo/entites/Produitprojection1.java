package com.example.demo.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "prix",types = Produit.class)
public interface Produitprojection1 {
	public Double getPrix();
}
