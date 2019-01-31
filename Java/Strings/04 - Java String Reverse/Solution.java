import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reverse = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(Character.toString(A.charAt(i)));
        }

        if (A.equals(reverse)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

    public static void reverseStringOneLine() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
    }

    public static void reverseEfficient() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int i = 0;
        int j = A.length() - 1;

        while (A.charAt(i) == A.charAt(j) && i++ < j--) ;
        System.out.println(i > j ? "Yes" : "No");
    }
}



