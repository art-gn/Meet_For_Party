/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

import java.sql.*;
import java.util.HashMap;

/**
 *
 * @author pc
 */
public class Event {
    private Connection connexion;
    private HashMap<Integer,String> listeJeu = new HashMap<Integer, String>();
    String url = "jdbc:mysql://localhost:3306/meet_for_party";
    String utilisateur = "root";
    String motDePasse = "root";
    
    public Event() throws Exception{

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

    }
    
    
    public void insert(String nom) throws SQLException{
        
        Statement statement = connexion.createStatement();
        int ok = statement.executeUpdate( "INSERT INTO pannes values (null, \""+nom+"\") ;" );
    }
}
