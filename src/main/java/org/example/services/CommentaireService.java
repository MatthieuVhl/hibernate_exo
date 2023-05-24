package org.example.services;

import org.example.entities.Commentaire;
import org.example.interfaces.Repository;

import java.util.List;

public class CommentaireService extends BaseService implements Repository<Commentaire> {
    @Override
    public boolean create (Commentaire o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update (Commentaire o) {
        return false;
    }

    @Override
    public boolean delete (Commentaire o) {
        return false;
    }

    @Override
    public Commentaire findById (int id) {
        return null;
    }

    @Override
    public List<Commentaire> findAll ( ) {
        return null;
    }
}
