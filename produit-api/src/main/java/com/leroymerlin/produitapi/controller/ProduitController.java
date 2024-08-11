package com.leroymerlin.produitapi.controller;

import com.leroymerlin.produitapi.model.Produit;
import com.leroymerlin.produitapi.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import javax.validation.Valid;

/*
Pour les imports ci-dessus, je les ai mis en commentaire car je n'ai pas trouvé la
bibliothèque pour `javax.validation`. De meme la méthode de Post produit est également
en commentaire, mais elle fonctionne avec la bibliothèque nécessaire.
*/

/**
 * Contrôleur REST pour gérer les opérations sur les produits.
 */
@RestController
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;


    /**
     * Récupère la liste de tous les produits, triée par ordre alphabétique.
     * @return Une réponse HTTP contenant la liste des produits.
     */
    // GET /produits
    @GetMapping
    public List<Produit> getProduits() {
        return produitRepository.findAllByOrderByNomAsc();
    }

    /**
     * Ajoute un nouveau produit.
     * @param produit Le produit à ajouter. Il doit être valide.
     * @return Une réponse HTTP contenant le produit ajouté.
     */
/*
    // POST /produits
    @PostMapping
    public ResponseEntity<Produit> createProduit(@Valid @RequestBody Produit produit) {
        Produit savedProduit = produitRepository.save(produit);
        return new ResponseEntity<>(savedProduit, HttpStatus.CREATED);
    }
*/

}
