import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter DOB(DD-MM-YYYY): ");
		String dob = sc.nextLine();
		String psw = (name.substring(0,2)).toLowerCase();
		switch(dob.substring(3,5)) {
		case "01": psw = psw+"january";
		break;
		case "02": psw = psw+"february";
		break;
		case "03": psw = psw+"march";
		break;
		case "04": psw = psw+"april";
		break;
		case "05": psw = psw+"may";
		break;
		case "06": psw = psw+"june";
		break;
		case "07": psw = psw+"july";
		break;
		case "08": psw = psw+"august";
		break;
		case "09": psw = psw+"september";
		break;
		case "10": psw = psw+"october";
		break;
		case "11": psw = psw+"november";
		break;
		case "12": psw = psw+"december";
		break;
		}
		System.out.println("Your password is: "+psw);
		sc.close();
	}

}
