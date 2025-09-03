package lab1;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        String a, b;
        String rev = "";
        int k = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            k++;
        }
        System.out.println("The number of chars are" + k);
        for(int i=a.length()-1;i>=0;i--){
            rev = rev + a.charAt(i);
        }
        System.out.println("reverse is"+rev);
        if(a.equals(rev)) System.out.println("palindrome");

    }
}


