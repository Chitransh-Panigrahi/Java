package csw;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;

        String s[] = str.split(" ");//WORDS SPLIT

        for(int i=0;i<s.length;i++){//COUNTING WORDS IN ARRAY
            count=count+1;
        }

        System.out.println("No. of WordS: " + count);
		
	}

}
