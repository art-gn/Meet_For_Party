/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        listUser Membres = new listUser();
        User test = new User("Lutin","1991-09-09","zob","homme");
        //System.out.println(test);
        int choix;
        
        Connect connection = new Connect();
        do{
            System.out.println("\n\n---MENU---");
            System.out.println("0. Quitter");
            System.out.println("1. Inscription");
            System.out.println("2. Connexion");
            System.out.println("3.Création Event");
            System.out.println("4.Afficher Event dispo");
            
            choix = new Scanner(System.in).nextInt();
            
            switch(choix){
                case 1:
                    System.out.println("--Nouvel Utilisateur--");
                    System.out.print("Pseudo : ");
                    String pseudo = new Scanner(System.in).nextLine();
                    System.out.print("Date de naissance (yyyy-mm-dd): ");
                    String birthDate = new Scanner(System.in).nextLine();
                    System.out.print("Mot de passe : ");
                    String password = new Scanner(System.in).nextLine();
                    System.out.print("Homme - Femme : ");
                    String sexe = new Scanner(System.in).nextLine();
                    connection.addUser(pseudo, birthDate, password, sexe);
                    break;
                case 2:
                    String pseudoConnected;
                    String sexeConnected;
                    String anniversaryConnected;
                    String passwordConnected;
                    System.out.print("Pseudo : ");
                    String identifiant = new Scanner(System.in).nextLine();
                    System.out.print("Mot de passe : ");
                    String mdp = new Scanner(System.in).nextLine();
                    ResultSet userRequest = connection.login(identifiant,mdp);
                    userRequest.next();
                    pseudoConnected =userRequest.getString("pseudo");
                    sexeConnected=userRequest.getString("sexe");
                    anniversaryConnected= userRequest.getString("birthDate");
                    passwordConnected= userRequest.getString("password");
                    UserConnected UserC;
                    UserC = new UserConnected(pseudoConnected,anniversaryConnected,passwordConnected,sexeConnected);
//                    System.out.println(UserC);
                    
                    break;
                case 3:
                    System.out.println("__NEW EVENT__");
                    System.out.println("Nom: ");
                    String nom= new Scanner(System.in).nextLine();
                    System.out.println("Date de la Partie");
                    String Date= new Scanner(System.in).nextLine();
                    System.out.println("Heure de la partie");
                    String heure= new Scanner(System.in).nextLine();
                    connection.addEvent(nom,Date,heure);
                    break;
                case 4:
                    listEvent g = new listEvent();
                    System.out.println("___EVENT DISPO___");
                    ResultSet TabEvent = connection.getEvents();
                    while(TabEvent.next()){
                        String nom_event = TabEvent.getString("nom_event");
                        String date = TabEvent.getString("date_event");
                        String jeu = TabEvent.getString("jeu_event");
                        String heure_event = TabEvent.getString("heure_event");
                    g.add(new Event( nom_event, date, jeu, heure_event));
                    }
                    System.out.println(g);
                    break;
                    
            }
        } while(choix != 0);
        connection.fermerConnexion();
    }
    
}
/*
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
            return E;
            
        }
*/
