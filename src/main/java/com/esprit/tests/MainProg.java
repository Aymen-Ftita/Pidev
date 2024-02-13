package com.esprit.tests;

import com.esprit.models.Reclamation;
//import com.esprit.services.EntityService;
import com.esprit.services.EntityService2;
import com.esprit.services.ReclamationService;

import java.sql.SQLException;

public class MainProg {

    public static void main(String[] args) throws SQLException {
//
        ReclamationService rs = new ReclamationService();
        //Reclamation r = new Reclamation(1,"01/01/2024","testSujet","testDescription","testStatut",1,"testResponsable");
        //Reclamation r = new Reclamation(2,"01/01/2024","testSujet2","testDescription2","testStatut2",1,"testResponsable2");
        //rs.ajouter(r);


        rs.afficher();
    }
}
