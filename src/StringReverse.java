import java.util.Scanner;

public class StringReverse {
    public static String reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans=ans+str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.nextLine();
        String ans=reverse(str);
        System.out.println("the answer is :"+ans);
    }
}