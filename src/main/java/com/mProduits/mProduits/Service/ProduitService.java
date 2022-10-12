package com.mProduits.mProduits.Service;


import com.mProduits.mProduits.Exception.ProductNotFoundException;
import com.mProduits.mProduits.Model.Produit;
import com.mProduits.mProduits.Repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {


    private final ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> recupererLesProduits()
    {

        return produitRepository.findAll();
    }

    public Produit recupererUnProduit(Long id)
    {
        return produitRepository.findById(id)
                .orElseThrow(() ->new ProductNotFoundException("Product with id ="+id+" not found"));
    }






}
