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
    private String Pseudo;
    private String birthDate;
    private String Password;
    private String Sexe;
    private ArrayList<User> listFriend = new ArrayList<User>();
    

    public User(String Pseudo, String birthDate, String Password, String Sexe) {
        this.Pseudo = Pseudo;
        this.birthDate = birthDate;
        this.Password = Password;
        this.Sexe = Sexe;
    }
    
    public void createEvent(){
    
    }
    
    public void addFriend(){
    }
    

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    @Override
    public String toString() {
        return "User{" + Pseudo +" ,"+ birthDate+" ," +  Password +" ,"+  Sexe + ", Ami(s) :" + listFriend + '}';
    }
    
    
    
}
