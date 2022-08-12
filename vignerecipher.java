import java.util.Scanner;

public class vignerecipher{
    
    public static String encryptText = "";
    public static String decryptText = "";
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // Ceasar Cipher
        int k = 3;
        
        System.out.println("Enter A String: ");
        String firstName = scan.nextLine();
        
        System.out.println("Text: " + firstName);
        System.out.println("Cipher: " + k);
        String encryptText = encryption(firstName, k);
        System.out.println("Encrypted Text: " + encryptText);
        String decryptText = decryption(encryptText, k);
        System.out.println("Decrypted Text: " + decryptText);
        scan.close();
    }
    
    static String encryption(String firstName, int k) {
        Scanner scan = new Scanner(System.in);
    
        for(int count = 0; count < firstName.length(); count++){
            if (Character.isUpperCase(firstName.charAt(count))) {
                encryptText += (char)((((int)firstName.charAt(count)+k-65)%26)+65);
            } else {
                encryptText += (char)((((int)firstName.charAt(count)+k-97)%26)+97);
            }
        }
        scan.close();
        return encryptText;
    }
    
    static String decryption(String encryptText, int k) {

        for (int count = 0; count < encryptText.length(); count++){
            if (Character.isUpperCase(encryptText.charAt(count))){
                decryptText += (char)(((((int)encryptText.charAt(count)+k-65)%26)+65));
            } else {
                decryptText += (char)(((((int)encryptText.charAt(count)+k-65)%26)+65));
            }
        }

        return decryptText;
    }
}
