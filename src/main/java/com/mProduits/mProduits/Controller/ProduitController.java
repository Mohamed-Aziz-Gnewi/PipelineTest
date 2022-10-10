package com.mProduits.mProduits.Controller;

import com.mProduits.mProduits.Configuration.ApplicationConfiguration;
import com.mProduits.mProduits.Exception.ProductNotFoundException;
import com.mProduits.mProduits.Model.Produit;
import com.mProduits.mProduits.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/mproduits")
public class ProduitController {

    @Autowired
    ProduitService produitService;
    @Autowired
    private Environment environment;

    @Autowired
    ApplicationConfiguration applicationConfiguration;

   // @Operation(summary = "Get all products",description = "get a list of all the products",tags = "Get")
    @GetMapping("/getAll")
    public List<Produit> recupererTous()
    {
        List<Produit> produits = produitService.recupererLesProduits();
        if(produits.isEmpty()) throw new ProductNotFoundException("Aucun produit existe");

        List<Produit> produitsLimite = produits.subList(0,applicationConfiguration.getLimitDesProduits());
        return produitsLimite ;
    }

    @GetMapping("/getProduit/{id}")
    public Produit recupererById(@PathVariable("id") Long id)
    {
        Produit produit = produitService.recupererUnProduit(id);
        //if(!produit.isPresent()) throw new ProductNotFoundException("Le produit d'id"+id+"Not found");
        produit.setDescription(environment.getProperty("local.server.port"));

        return produit ;
    }

}
