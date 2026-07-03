/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package pratikum23042026;

public class Author {
    private final String nama;
    private String email;
    private final char gender;
    
    public Author(String nama, String email, char gender){
        this.nama = nama;
        this.email = email;
        this.gender = gender;
    }
    
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public char getGender(){
        return gender;
    }
    public String toString() {
    return "Author[nama=" + nama + ", email=" + email + ", gender=" + gender + "]";
    }
}
