/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author Asus
 */
public class Connect {
    private Connection connexion ;
    private HashMap<Integer,String> all = new HashMap<Integer, String>();
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/meet_for_party";
    String utilisateur = "root";
    String motDePasse = "root";
    
     public Connect() throws Exception{

        Class.forName(driver).newInstance();
        connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

    }
     
    public void addUser(String pseudo,String birthDate,String password, String sexe) throws SQLException{
        
        Statement statement = connexion.createStatement();
        int ok = statement.executeUpdate( "INSERT INTO user values (null, \""+pseudo+"\", \""+birthDate+"\", \""+password+"\", \""+sexe+"\",\"\" ) ;" );
    }

    public void fermerConnexion() throws SQLException{
        connexion.close();
    }

    public void reload() throws SQLException{
        Statement statement = connexion.createStatement();
        ResultSet resultat = statement.executeQuery( "SELECT * FROM user;" );
        all.clear();
        while ( resultat.next() ) {
            all.put(resultat.getInt(1), resultat.getString(2+" "+3+" "+4+" "+5)); 
        }      
    }
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
