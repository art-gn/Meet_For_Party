/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class Connect {
    private Connection connexion ;
    private HashMap<Integer,String> all = new HashMap<Integer, String>();

    String url = "jdbc:mysql://localhost:3306/meet_for_party";
    String utilisateur = "root";
    String motDePasse = "root";
    
     public Connect() throws Exception{

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

    }
}
