package com.mProduits.mProduits.Service;

import com.mProduits.mProduits.Repository.ProduitRepository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

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
        //ProduitService produitService = new ProduitService(produitRepository);

        produitService.recupererLesProduits();
        verify(produitRepository).findAll();
    }

    @Test
    @Disabled
    void recupererUnProduit() {
    }
}