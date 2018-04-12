package co.edu.udea.compumovil.gr09_20181.lab2.Tables;

/**
 * Created by estudiante on 11/04/18.
 */

public class User {

    String photoUri;
    String name;
    String mail;
    String password;

    public User(String photoUri, String name, String mail, String password) {
        this.photoUri = photoUri;
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(String photoUri) {
        this.photoUri = photoUri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
