package Application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException{
		 
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product[]vect = new Product[10];
        System.out.print("Quantos quertos serão alugados? ");
        
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
        	System.out.println();
        	System.out.println("Rent #" + i + ": ");
        	System.out.print("nome: ");
        	sc.nextLine();
        	String name = sc.nextLine();
        	System.out.print("Email: ");
        	String email = sc.nextLine();
        	System.out.print("nuimero do quarto: ");
        	int room = sc.nextInt();
        	vect[room] = new Product(name, email);
        }
        System.out.println();
        System.out.println("ficha de cadastro: ");
        for(int i=0;i<10;i++) {
           if(vect[i] != null) {
        	   System.out.println(i + ":" + vect[i]);
           }
           sc.close();
	   }
	}        
}
