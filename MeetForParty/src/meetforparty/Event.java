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
public class Event {
    private String Nom;
    private String Date;
    private String Jeu;

    public Event(String Nom, String Date, String Jeu) {
        this.Nom = Nom;
        this.Date = Date;
        this.Jeu = Jeu;
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
