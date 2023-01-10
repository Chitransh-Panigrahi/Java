package csw;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        String s[] = str.split(" ");//WORDS SPLIT

        for(int i=0;i<s.length;i++){//ADDING WORDS IN ARRAY
            rev = s[i]+" "+rev;
        }

        System.out.println("Reversed sentence: " + rev);
		} 
}
