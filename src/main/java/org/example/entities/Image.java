package org.example.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "produit_id")
   private  Produit produit;



    public Image () {

    }

    public Image (String url ) {
        this.url = url;

    }

    public int getId ( ) {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getUrl ( ) {
        return url;
    }

    public void setUrl (String url) {
        this.url = url;
    }

    public Produit getProduits(Produit produit){
        return produit;
    }

    public Produit getProduit ( ) {
        return produit;
    }

    public void setProduit (Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString ( ) {
        return "Image{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
