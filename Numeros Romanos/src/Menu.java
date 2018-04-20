import java.util.Scanner;

public class Menu {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int numero=0,millar=0,centena,decena,unidad;
		System.out.println("Ingrese numero del 1 al 3000");
		try {
			numero=s.nextInt();
			if(numero>3000 || numero <=0) {
				System.out.println("caracter no valido");
				System.exit(0);
			}
		}catch(Exception e) {
			System.out.println("Caracter ingresado no valido");
			System.exit(0);
		}
		millar=numero/1000;
		centena=numero/100%10;
		decena=numero/10%10;
		unidad=numero%10;
		System.out.println(millar+" "+centena+" "+decena+" "+unidad);
		System.out.println(romano(millar,centena,decena,unidad));
	}
	public static String romano(int m,int c,int d,int u) {
		String cadena="";
		for(int i=0;i<m;i++) {
			cadena="M"+cadena;
		}
		////////////Centena
		if(c==9)
			cadena=cadena+"CM";
		else if(c>=5) {
			cadena=cadena+"D";
			for(int i=6;i<=c;i++) {
				cadena=cadena+"C";
			}
		}
		else if(c==4)
			cadena=cadena+"CD";
		else {
			for(int i=0;i<c;i++) {
					cadena=cadena+"C";
			}
		}
		////////////Decena
		if(d==9)
			cadena=cadena+"XC";
		else if(d>=5) {
			cadena=cadena+"L";
			for(int i=6;i<=d;i++) {
				cadena=cadena+"X";
			}
		}
		else if(c==4)
			cadena=cadena+"XL";
		else {
			for(int i=0;i<c;i++) {
					cadena=cadena+"X";
			}
		}
		/////////////////Unidad
		if(u==9)
			cadena=cadena+"IX";
		else if(u>=5) {
			cadena=cadena+"V";
			for(int i=6;i<=u;i++) {
				cadena=cadena+"I";
			}
		}
		else if(u==4)
			cadena=cadena+"IV";
		else {
			for(int i=0;i<u;i++) {
					cadena=cadena+"I";
			}
		}
		return cadena;
	}
}
