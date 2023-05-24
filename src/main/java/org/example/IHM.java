package org.example;

import org.example.entities.Commentaire;
import org.example.entities.Image;
import org.example.entities.Produit;
import org.example.services.CommentaireService;
import org.example.services.ImageService;
import org.example.services.ProduitService;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.NativeQuery;
import java.util.List;
import java.util.Scanner;

public class IHM {
    private CommentaireService commentaireService;
    private ImageService imageService;
    private ProduitService produitService;
    private Scanner scanner;
    public IHM() {
        commentaireService = new CommentaireService();
        imageService = new ImageService();
        produitService = new ProduitService();
        scanner = new Scanner(System.in);



}
    public  void start() {
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
//                    valeurParMarque();
                    break;
                case "2":
//                    moyenne();
                    break;
                case "3":
//                    produitsMarques();
                    break;
                case "4":
//                    deleteParMarque();
                    break;
                case "5":
//                    addProduit();
                    break;
                case "6":
//                    produitById();
                    break;
                case "7":
//                    deleteProduit();
                    break;
                case "8":
//                    updateProduit();
                    break;
                case "9":
//                    afficheAllProduit();
                    break;
                case "10":
//                    produitPriceMin();
                    break;
                case "11":
//                    produitByDate();
                    break;
                case "12":
//                    produitStockMin();
                    break;
                case "13":
                   addImage();
                    break;
                case "14":
                    addCommentaire();
                    break;

            }
        }while(!choice.equals("0"));
        produitService.end();
    }
    private void menu() {
        System.out.println("########  Menu  #########");
        System.out.println("1 -- afficher la valeur du stock par marque");
        System.out.println("2 -- prix moyen des produits");
        System.out.println("3 -- produits de plusieurs marques");
        System.out.println("4 -- supprimer produit par marque");
        System.out.println("5 -- ajouter un produit");
        System.out.println("6 -- afficher un produit par id");
        System.out.println("7 -- supprimer un produit par id");
        System.out.println("8 -- mofifier un produit par id");
        System.out.println("9 -- afficher tous les produits");
        System.out.println("10 -- afficher les produits avec un prix supérieur à");
        System.out.println("11 -- afficher les produits achetés entre deux dates");
        System.out.println("12 -- afficher les produits avec un stock dessous d'un valeur");
        System.out.println("13 -- ajouter une image");
        System.out.println("13 -- ajouter un commentaire");
        System.out.println("0 -- Quitter ");





    }

    private void addImage(){
        System.out.println("Merci de saisir l'url");
        String url = scanner.nextLine();
        try{
            Image image = new Image(url);
           imageService.create(image);
        }catch (Exception e){
            System.out.println(e.getMessage());
    }
    }

    private void addCommentaire(){
        System.out.println("merci de saisir un commentaire");
        String contenu = scanner.nextLine();
        try {
            Commentaire commentaire = new Commentaire();
            commentaire.setContenu(contenu);
            commentaireService.create(commentaire);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
