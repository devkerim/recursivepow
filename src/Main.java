import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int a,b;
	System.out.println("Taban değerini giriniz: ");
	a = intscanner.nextInt();
	System.out.println("Üs değerini giriniz: ");
	b = intscanner.nextInt();
	int result = pow(a,b);
	System.out.println("Sonuç: "+result);
    }
    static int pow(int a,int b){
        if(a==0){return 0;}
        else if(a!=0&&b==0){return 1;}
        else{
        return a*pow(a,b-1);}

    }
}
