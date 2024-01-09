package vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int temperaturas[] = new int[10];
		
		temperaturas[4] = 2;
		temperaturas[0] = 20;
		temperaturas[1] = 4;
		temperaturas[2] = 23;
		
		System.out.println(temperaturas.length);
		System.out.println(Arrays.toString(temperaturas));
		
		
		char frase[] = new char[10];
		
		frase[0] = 'E';
		frase[1] = 'l';
		frase[2] = 'd';
		frase[3] = 'e';
		frase[4] = 'n';
		frase[5] = ' ';
		frase[6] = 'R';
		frase[7] = 'i';
		frase[8] = 'n';
		frase[9] = 'g';
		
		String fraseString = Arrays.toString(frase);
		System.out.println(fraseString);
		
		for(int i=0;i<=(frase.length-1);i++) {
			System.out.print(frase[i]);
		}
		System.out.println();
		
		for(int i=(frase.length-1);i>=0;i--) {
			System.out.print(frase[i]);
		}
		System.out.println();
		
		for(char letra:frase) {
			System.out.print(letra);
		}
		System.out.println();
		
		
	}

}
