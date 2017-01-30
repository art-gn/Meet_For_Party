/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class User {
    private String pseudo;
    private String birthDate;
    private String password;
    private String Sexe;
    private ArrayList<User> listFriend = new ArrayList<User>();
    

    public User(String pseudo, String birthDate, String password, String Sexe) {
        this.pseudo = pseudo;
        this.birthDate = birthDate;
        this.password = password;
        this.Sexe = Sexe;
    }
    
    public void createEvent(){
    
    }
    
    public void addFriend(){
    }
    

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    @Override
    public String toString() {
        return "User{" + pseudo +" ,"+ birthDate+" ," +  password +" ,"+  Sexe + ", Ami(s) :" + listFriend + '}';
    }
    
    
    
}
