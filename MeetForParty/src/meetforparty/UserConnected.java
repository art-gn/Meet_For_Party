/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetforparty;

/**
 *
 * @author Asus
 */
public class UserConnected extends User {
    
    public UserConnected(String pseudo, String birthDate, String password, String Sexe) {
        super(pseudo, birthDate, password, Sexe);
    }

    @Override
    public void setSexe(String Sexe) {
        super.setSexe(Sexe); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSexe() {
        return super.getSexe(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBirthDate(String birthDate) {
        super.setBirthDate(birthDate); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBirthDate() {
        return super.getBirthDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPseudo(String pseudo) {
        super.setPseudo(pseudo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPseudo() {
        return super.getPseudo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addFriend() {
        super.addFriend(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createEvent() {
        super.createEvent(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
