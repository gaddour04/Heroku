package com.example.demo.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "reference",types = Produit.class)
public interface Produitprojection2 {
	public String getRef();
}
