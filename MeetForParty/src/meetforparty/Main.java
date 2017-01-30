/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

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

            choix = new Scanner(System.in).nextInt();
            
            switch(choix){
                case 1:
                    System.out.println("--Nouvel Utilisateur--");
                    System.out.print("Pseudo : ");
                    String pseudo = new Scanner(System.in).nextLine();
                    System.out.print("Date de naissance (yyyy-mm-dd): ");
                    String birthDate = new Scanner(System.in).nextLine();
                    System.out.print("Mot de passe): ");
                    String password = new Scanner(System.in).nextLine();
                    System.out.print("Homme - Femme : ");
                    String sexe = new Scanner(System.in).nextLine();
                    connection.addUser(pseudo, birthDate, password, sexe);
                case 2:
                    
            }  
        } while(choix != 0);
        connection.fermerConnexion();
    }
    
}
