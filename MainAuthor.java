/*
 Nama    : Muhammad Taufiqillah, NIM :2501082017
 */
package pratikum23042026;

public class MainAuthor {

    public static void main(String[] args) {
        Author Rin = new Author ("Rinaldi Munir","rinaldi@gmail.com", 'm');
        System.out.println(Rin);
        
        Rin.setEmail("rinaldi@gmail.com");
        System.out.println("Nama : "+Rin.getNama());
        System.out.println("Gender : "+Rin.getGender());
        System.out.println("Email : "+Rin.getEmail());
    }
}
