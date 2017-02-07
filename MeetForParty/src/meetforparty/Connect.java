/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    
    public ResultSet login(String identifiant, String mdp) throws SQLException{

        Statement statement = connexion.createStatement();
        ResultSet userRequest;
        userRequest = statement.executeQuery("Select * From user where pseudo =\""+identifiant+"\" and password =\""+mdp+"\"");
        return userRequest;
        
    }
    public void reload() throws SQLException{
        Statement statement = connexion.createStatement();
        ResultSet resultat = statement.executeQuery( "SELECT * FROM user;" );
        all.clear();
        while ( resultat.next() ) {
            all.put(resultat.getInt(1), resultat.getString(2+" "+3+" "+4+" "+5)); 
        }      
    }

    void addEvent(String nom, String Date, String heure) throws SQLException {
        Statement statement = connexion.createStatement();
        int ok = statement.executeUpdate( "INSERT INTO event values (null, \""+nom+"\",\""+Date+"\",null , \""+heure+"\") ;" );
        
    }

    void getEvents() throws SQLException {
        Statement statement = connexion.createStatement();
        ResultSet TabEvent;
        TabEvent = statement.executeQuery("SELECT `nom_event`, `date_event`, `jeu_event`, `heure_event` FROM `event` " );
        TabEvent.last();
        int nombreligne;
        nombreligne = TabEvent.getRow();
        TabEvent.beforeFirst();
        System.out.println(nombreligne);
        for (int i = 0; i < nombreligne; i++) {
            TabEvent.next();
            String nom = TabEvent.getString("nom_event");
            String date = TabEvent.getString("date_event");
            String jeu = TabEvent.getString("jeu_event");
            String heure = TabEvent.getString("heure_event");
            Event event = new Event(nom,date,jeu,heure);
            
        }
        
        
        /*ResultSetMetaData metadata = TabEvent.getMetaData();*/
    }
}

