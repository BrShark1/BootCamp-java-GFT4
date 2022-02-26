import java.util.Scanner;



public class cinema {

public static void main(String[] args) {



Scanner scan = new Scanner(System.in);

double A = scan.nextDouble();

double B = scan.nextDouble();

double C = ((B-A)*100)/A;

System.out.printf("%.2f%%\n",C);


}

}