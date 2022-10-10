package com.mProduits.mProduits.Repository;

import com.mProduits.mProduits.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {

    @Query(
            value = "SELECT * FROM produit WHERE titre like ?1 ",
            nativeQuery = true
        )
    Produit findProduitByTitre(String Titre);
}
