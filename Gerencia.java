package new_calc;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Gerencia {
	public static void escrever(String patch) {

		double n1, n2, result = 0;
		String opera;
		Scanner key = new Scanner(System.in);

		try {
			FileWriter fw = new FileWriter(patch);
			BufferedWriter bw = new BufferedWriter(fw);

			System.out.println("digite o 1° numero");
			n1 = key.nextDouble();
			System.out.println("digite o operador");
			opera = key.next();
			System.out.println("digite o 2° numero");
			n2 = key.nextDouble();

			switch (opera) {

			case "+":
				result = Calculadora.soma(n1, n2);
				break;
			case "-":
				result = Calculadora.subtracao(n1, n2);
				break;
			case "*":
				result = Calculadora.multiplicacao(n1, n2);
				break;
			case "/":
				result = Calculadora.divisao(n1, n2);
				break;
			}
			bw.append(n1 + " " + opera + " " + n2 + " " + "=" + " " + result);
			bw.newLine();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void ler(String patch) {
		
		try {
			FileReader fr = new FileReader(patch);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {
				System.out.println(br.readLine());
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
