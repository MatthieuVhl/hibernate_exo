package org.example.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="commentaire")
public class Commentaire{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String contenu;

    @Temporal(TemporalType.DATE)
    private Date date;
    private String note;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produit_id")
    private Produit produit;


    public Commentaire (String contenu, Date date, String note) {
        this.contenu = contenu;
        this.date = date;
        this.note = note;
    }

    public Commentaire ( ) {

    }

    public int getId ( ) {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getContenu ( ) {
        return contenu;
    }

    public void setContenu (String contenu) {
        this.contenu = contenu;
    }

    public Date getDate ( ) {
        return date;
    }

    public void setDate (Date date) {
        this.date = date;
    }

    public String getNote ( ) {
        return note;
    }

    public void setNote (String note) {
        this.note = note;
    }



    public Commentaire (int id, String contenu, Date date, String note) {
        this.id = id;
        this.contenu = contenu;
        this.date = date;
        this.note = note;
    }
    public Produit getProduits(Produit produit){
        return produit;
    }


    @Override
    public String toString ( ) {
        return "Commentaire{" +
                "id=" + id +
                ", contenu='" + contenu + '\'' +
                ", date=" + date +
                ", note='" + note + '\'' +
                '}';
    }
}
