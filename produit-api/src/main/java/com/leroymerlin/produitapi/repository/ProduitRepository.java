package com.leroymerlin.produitapi.repository;

import com.leroymerlin.produitapi.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Interface pour les opérations de base de données sur les produits elle hérite de JpaRepository
 */
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    /**
     * Récupère tous les produits triés par nom dans l'ordre alphabétique.
     * @return Une liste de produits triés par nom.
     */
    List<Produit> findAllByOrderByNomAsc();
}
