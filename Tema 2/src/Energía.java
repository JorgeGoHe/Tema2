import java.io.IOException;
import java.util.Scanner;

public class Energía {

	public static void main(String[] args) throws IOException {
		int a = 0,b = 0,c = 0,x=0,visitas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el valor energetico de las casas A, B, C o sin valor energetico D y salir #");
        
        do{
            x =(char) System.in.read();
            switch(x){
            case 65:
            	a++;
            	visitas++;
            	System.out.println("Esto es A");
            	break;
            case 66:
            	b++;
            	visitas++;
            	System.out.println("Esto es B");
            	break;
            case 67:
            	c++;
            	visitas++;
            	System.out.println("Esto es C");
            	break;
            case 68:
            	x++;
            	visitas++;
            	System.out.println("Esto es D");
            	break;
            }

        }while(x!=35);
        double total;
        total=visitas;
        double D;
        D=visitas-a-b-c;
        System.out.println("El total de casas visitadas es de: " +total);
        System.out.println("De las cuales:");
        System.out.println("El numero de casas con eficiencia A es de:" +a);
        System.out.println("El numero de casas con eficiencia B es de:" +b);
        System.out.println("El numero de casas con eficiencia C es de:" +c);
        System.out.println("El numero de casas sin estudio de eficiencia es de:" +D);
        
        double mediaA;
        double mediaB;
        double mediaC;
        double mediaD;
        
        mediaA=(a*100)/visitas;
        mediaB=(b*100)/visitas;
        mediaC=(c*100)/visitas;
        mediaD=100-mediaA-mediaB-mediaC;
        
        System.out.println("El porcentaje eficiencia energetica de tipo A es de: " +mediaA  );
        System.out.println("El porcentaje eficiencia energetica de tipo B es de: " +mediaB  );
        System.out.println("El porcentaje eficiencia energetica de tipo C es de: " +mediaC );
        System.out.println("El porcentaje de casas en las que no hay estudio energético: " +mediaD );
        
       
        }
	}

	


