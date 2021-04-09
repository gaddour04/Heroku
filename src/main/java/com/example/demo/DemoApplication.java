package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.entites.Client;
import com.example.demo.entites.Produit;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.ProduitRepository;

@SpringBootApplication
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProduitRepository produitRep,ClientRepository clientRep,RepositoryRestConfiguration restConfiguration) {
		return args ->{
			restConfiguration.exposeIdsFor(Produit.class);
			restConfiguration.exposeIdsFor(Client.class);
			/*
			 * Client c1= clientRep.save(new Client(null,"salah",null)); Client c2=
			 * clientRep.save(new Client(null,"med",null)); Client c3= clientRep.save(new
			 * Client(null,"loulou",null)); Client c4= clientRep.save(new
			 * Client(null,"ali",null)); produitRep.save(new Produit(null,"XF25",77.00,c1));
			 * produitRep.save(new Produit(null,"FX42",25.500,c2)); produitRep.save(new
			 * Produit(null,"XF35",70.00,c3)); produitRep.save(new
			 * Produit(null,"XF25",177.00,c1)); produitRep.save(new
			 * Produit(null,"XL23",37.00,c1)); produitRep.save(new
			 * Produit(null,"XF25",70.500,c2)); produitRep.save(new
			 * Produit(null,"BL72",81.00,c3)); produitRep.save(new
			 * Produit(null,"AF25",30.00,c2));
			 */
			 
			
			
			  produitRep.findAll().forEach(prod->{ System.out.println(prod.getRef()); });
			 
		};
	}

}
