public class depurar {

	public static void Dos(int x){
		System.out.println("El valor de x es "+x);
	}
	
	public static void Uno(int k){
		Dos(k+1);
		Dos(k+5);
	}
	
	public static void main(String[] args) {
	
		for (int i=10; i>=0; i-=2){
			Uno(i);
		}
	}

}

