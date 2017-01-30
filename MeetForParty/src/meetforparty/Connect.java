/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

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
}
/*private Connection connexion;
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
    public void reload() throws SQLException{
        Statement statement = connexion.createStatement();
        ResultSet resultat = statement.executeQuery( "SELECT id,nom FROM pannes;" );
        listeJeu.clear();
        while ( resultat.next() ) {
            listeJeu.put(resultat.getInt(1), resultat.getString(2)); 
        }      
    }
    @Override
    public String toString() {
        String str ="";
        for(Map.Entry<Integer, String> entry : listeJeu.entrySet()){
            str += entry.getKey()+": "+entry.getValue()+"\n";
        }
        return str ;
    }
    public void fermerConnexion() throws SQLException{
        connexion.close();
    }*/