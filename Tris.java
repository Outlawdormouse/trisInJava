package tris;
import java.util.*;

public class Tris {
	
	Scanner s1 = new Scanner(System.in);
	
	
	public void cambia() {
		char vettore[][];
		vettore = new char [3][3];
		boolean giocatore = true;
		boolean c = false;
		int crescente = 0;
		do {
			System.out.println(vettore[0][0] + "|" + vettore[0][1] + "|" + vettore[0][2]);
			System.out.println("-----");
			System.out.println(vettore[1][0] + "|" + vettore[1][1] + "|" + vettore[1][2]);
			System.out.println("-----");
			System.out.println(vettore[2][0] + "|" + vettore[2][1] + "|" + vettore[2][2]);
			int x,y;
			do {
			do {
			System.out.println("inserire la x: ");
			x = s1.nextInt();
			}while(x > 2 || x < 0);
			do {
			System.out.println("inserire la y: ");	
			y = s1.nextInt();
			}while (y > 2 || x < 0);
			}while(vettore[x][y] == 'X' || vettore[x][y] == 'O');
				if (giocatore == true) {
					vettore[x][y] = 'X';
					
				}
				else {
					vettore[x][y] = 'O';
					
				}

				
				if (vettore[0][0] == 'X' && vettore[0][1] == 'X' && vettore[0][2] == 'X' || vettore[1][0] == 'X' && vettore[1][1] == 'X' && vettore[1][2] == 'X' || vettore[2][0] == 'X' && vettore[2][1] == 'X' && vettore[2][2] == 'X' || vettore[0][0] == 'X' && vettore[1][0] == 'X' && vettore[2][0] == 'X' || vettore[1][0] == 'X' && vettore[1][1] == 'X' && vettore[1][2] == 'X' || vettore[2][0] == 'X' && vettore[2][1] == 'X' && vettore[2][2] == 'X' || vettore[0][0] == 'X' && vettore[1][1] == 'X' && vettore[2][2] == 'X' || vettore[0][2] == 'X' && vettore[1][1] == 'X' && vettore[2][0] == 'X') {
					c=true;
					System.out.println("giocatore 1 ha vinto");
				}
				else if(vettore[0][0] == 'O' && vettore[0][1] == 'O' && vettore[0][2] == 'O' || vettore[1][0] == 'O' && vettore[1][1] == 'O' && vettore[1][2] == 'O' || vettore[2][0] == 'O' && vettore[2][1] == 'O' && vettore[2][2] == 'O' || vettore[0][0] == 'O' && vettore[1][0] == 'O' && vettore[0][2] == 'O' || vettore[0][1] == 'O' && vettore[1][1] == 'O' && vettore[1][2] == 'O' || vettore[2][0] == 'O' && vettore[2][0] == 'O' && vettore[2][2] == 'O' || vettore[0][0] == 'O' && vettore[1][1] == 'O' && vettore[2][2] == 'O' || vettore[0][2] == 'O' && vettore[1][1] == 'O' && vettore[2][0] == 'O') {
					c=true;
					System.out.println("giocatore 2 ha vinto");
				}
			else {
				crescente += 1;
				if (crescente == 9) {
					System.out.println("hahahaha sfigati avete pareggiato, fate più schifo del gioco di pitti");
				}
			}
			if (giocatore == true) {
				giocatore = false;
			}
			else {
				giocatore = true;
			}
		}while(c==false || crescente == 9);
	}	
}
