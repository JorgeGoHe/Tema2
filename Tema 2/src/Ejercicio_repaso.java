import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_repaso {

	public static void main(String[] args) throws IOException {
		int y=0, x=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un caracter: ");
        do{
            x =(char) System.in.read();
            switch(x){
            case 89:
            	y++;
            	break;
            case 121:
            	y++;
            	break;
            }

        }while(x!=35);
        System.out.println("El numero de y es de:" +y);

	}

}
