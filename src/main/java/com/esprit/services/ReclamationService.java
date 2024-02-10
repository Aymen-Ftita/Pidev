package com.esprit.services;

import com.esprit.models.Reclamation;
import com.esprit.models.Status;
import com.esprit.utils.DataSource;

import java.sql.*;
import java.util.*;
public class ReclamationService {

    private Connection connection;

    public ReclamationService() {
        connection = DataSource.getInstance().getConnection();
    }

    public void ajouter(Reclamation reclamation) {
        String req = "INSERT into reclamation(" +
                        "uid, " +
                        "sujet," +
                        "description," +
                        "priorite," +
                        "role) " +
                        "values ('" +
                            reclamation.getUid() + "', '" +
                            reclamation.getSujet()+ "', '" +
                            reclamation.getPriorité()+ "', '" +
                            reclamation.getResponsablle() + "');";
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(req);
            System.out.println("entité ajoutée !");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void modifier(Reclamation reclamation) {
        String req = "UPDATE reclamation set sujet = '" + reclamation.getSujet() + "', priorite = '" + reclamation.getPriorité() + "' where id_reclamation = " + reclamation.getId_reclamation() + ";";
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(req);
            System.out.println("Attribut3 modifiée !");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void supprimer(Reclamation reclamation) {
        String req = "DELETE from reclamation where id_reclamation = " + reclamation.getId_reclamation() + ";";
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(req);
            System.out.println("entité supprmiée !");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public List<Reclamation> afficher() {
        List<Reclamation> entities = new ArrayList<>();

        String req = "SELECT * from reclamation";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                entities.add(new Reclamation(rs.getInt("id_reclamation"), rs.getInt("uid"), rs.getString("date_creation") , rs.getString("sujet") , rs.getString ("description"), rs.getString(
                "status"), rs.getInt("priorité") , rs.getString("role") ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return entities;
    }
}
