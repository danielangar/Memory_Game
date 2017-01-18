import java.util.*;
import java.util.*;

public class TwoD{
	
	public static void printfBoard(char [][] b){
		//Printing heading board
		System.out.println();
		String[] p = {"1", "2", "3", "4"};
		System.out.println("               1         2         3         4");
		System.out.println();
		System.out.printf("%6s", " ");
		System.out.printf("%30s","____________________________________________");
		System.out.println();
		
		//Printing board
		for(int i=0; i<4; i++){
			System.out.printf("%5s", p[i]);
			System.out.print("|");
			for(int j=0; j<4; j++){
				System.out.printf("%10c", b[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public static void shuffle(char[][] b, String[] p){
		int i=0, j=0;
		Random r = new Random();
		int k;
		char temp;
		char temp2;
		k = r.nextInt(4);
		
		System.out.println();
		
		temp = b[k][j];
		b[k][j]= b[i][k];
		b[i][k] = temp;
		
		
	}

	public static void main(String[] args) throws Exception{
		
		int i=0, j=0;
		int x,y,c,d;
		String[] p = {"1", "2", "3", "4"};
          
          //Printing board
		char f[][] = {{'*','*','*','*'}, 
			{'*','*','*','*'},
			{'*','*','*','*'},
			{'*','*','*','*'}};
		char b[][] = {{'1','2','3','4'}, 
			{'5','6','7','8'},
			{'1','2','3','4'},
			{'5','6','7','8'}};
		TwoD.printfBoard(f);
		
		TwoD.shuffle(b,p);
		Scanner sc = new Scanner(System.in);
		int count=0;
		do{
			System.out.println("Enter number between 1 and 4 for row: ");
			x = sc.nextInt();
			System.out.println("Enter number between 1 and 4 for column: ");
			y = sc.nextInt();
			if(x<1 && x>4){
				System.out.println("Invalid Number!!");
				System.exit(0);
			}
			else if( y<1 && y>4){
				System.out.println("Invalid Number!!");
				System.exit(0);
			}
			System.out.println();


			System.out.println("               1         2         3         4");
			System.out.println();
			System.out.printf("%6s", " ");
			System.out.printf("%30s","____________________________________________");
			System.out.println();
               // Facing the cards up
			f[x-1][y-1]= b[x-1][y-1];
			for( i=0; i<4; i++){
				System.out.printf("%5s", p[i]);
				System.out.print("|");
				for(j=0; j<4; j++){
					System.out.printf("%10c", f[i][j]);
				}
				System.out.println();
			}


			System.out.println("Enter number between 1 and 4 for row: ");
			c = sc.nextInt();
			System.out.println("Enter number between 1 and 4 for column: ");
			d = sc.nextInt();
			
			if((c<1 && c>4) && ( d<1 && d>4)){
				System.out.println("Invalid Number!!");
				System.exit(0);
			}
			
			System.out.println();


			System.out.println("               1         2         3         4");
			System.out.println();
			System.out.printf("%6s", " ");
			System.out.printf("%30s","____________________________________________");
			System.out.println();
               //Facing the cards up
			f[c-1][d-1]= b[c-1][d-1];
			for( i=0; i<4; i++){
				System.out.printf("%5s", p[i]);
				System.out.print("|");
				for(j=0; j<4; j++){
					System.out.printf("%10c", f[i][j]);
				}
				System.out.println();
			}
               //Checking if the cards match
			if(f[x-1][y-1] == f[c-1][d-1]){
				System.out.println("They match!!!!");
				count++;
				if(count==8){
					System.out.println("CONGRATULATIONS. YOU WON!!!!!!!");
				}
			}
			else{
				System.out.println("I feel so sorry for you. They don't match!!!");
				f[x-1][y-1] ='*';
				f[c-1][d-1] ='*';
			}
		} while(count<8);

		
	}
}
