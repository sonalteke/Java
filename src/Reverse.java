import java.util.Scanner;

public class Reverse {
    void stringreverse(String s1) {
        String reverse="";
        int  length=s1.length();
        System.out.println("length of string is:"+length);
        for(int i=length-1;i>=0;i--) {
            reverse = reverse + s1.charAt(i);
        }
            System.out.println("Reverse String is:"+reverse);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Reverse r=new Reverse();
        System.out.println("Enter the string to reverse:");
        String  s2=s.nextLine();
        r.stringreverse(s2);
    }
}
