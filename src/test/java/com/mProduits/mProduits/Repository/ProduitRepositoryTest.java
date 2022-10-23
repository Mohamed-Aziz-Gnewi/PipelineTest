package com.mProduits.mProduits.Repository;

import com.mProduits.mProduits.Model.Produit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProduitRepositoryTest {

    @Autowired
    private  ProduitRepository produitRepository;

    @Test
    void findProduitByTitre() {
        ///Given
        Produit produit = new Produit(9L,"Testing","descriiiip","", 34.0);
        String title="Testing";
        produitRepository.save(produit);
        //When
        Produit produitTest= produitRepository.findProduitByTitre(title);
        //Then

        assertThat(produitTest).isNotNull();
    }
    @Test
    void falseTest(){
        assertThat(1).isEqualTo(0);
    }
}