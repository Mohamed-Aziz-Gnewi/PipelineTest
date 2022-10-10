package com.mProduits.mProduits.Service;

import com.mProduits.mProduits.Model.Produit;
import com.mProduits.mProduits.Repository.ProduitRepository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProduitServiceTest {

    @Mock
    private ProduitRepository produitRepository;

    private ProduitService produitService;

    @BeforeEach
     void setUp() {
        
        ProduitService produitService = new ProduitService(produitRepository);
    }

    @Test
    void recupererLesProduits() {
        ProduitService produitService = new ProduitService(produitRepository);

        produitService.recupererLesProduits();
        verify(produitRepository).findAll();
    }

    @Test
    void recupererUnProduit() {
        ProduitService produitService = new ProduitService(produitRepository);
        Produit produit = new Produit(9L,"Testing","descriiiip","", 34.0);
        when(produitRepository.findById(9L)).thenReturn(Optional.of(produit));
        Produit produit1 = produitService.recupererUnProduit(9L);
        assertThat(produit1).isEqualTo(produit);
    }
}