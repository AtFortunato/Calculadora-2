package new_calc;
3	
4	import java.io.File;
5	import java.io.IOException;
6	import java.util.Scanner;
7	
8	public class Main {
9		public static void main(String[] args) {
10			File arquivo = new File("arquivo.txt");
11			Scanner key = new Scanner(System.in);
12			int op = 0;
13			try {
14				arquivo.createNewFile();
15			} catch (IOException e) {
16				e.printStackTrace();
17			}
18			do{
19			Gerencia.escrever("arquivo.txt");
20			Gerencia.ler("arquivo.txt");
21			System.out.println("deseja continuar 1 = sim / 2 = nao");
22			op = key.nextInt();
23			}while(op != 2);
24		}
25	
26	}
