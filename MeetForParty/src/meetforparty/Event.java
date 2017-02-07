/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;


/**
 *
 * @author pc
 */
public class Event extends listEvent{
    private String Nom;
    private String Date;
    private String Jeu;
    private String Heure;



    Event(String Nom, String Date, String Jeu,String Heure) {
        this.Nom = Nom;
        this.Date = Date;
        this.Jeu = Jeu;
        this.Heure = Heure;
    }

 

    public String getHeure() {
        return Heure;
    }

    public void setHeure(String Heure) {
        this.Heure = Heure;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getJeu() {
        return Jeu;
    }

    public void setJeu(String Jeu) {
        this.Jeu = Jeu;
    }
    
}
