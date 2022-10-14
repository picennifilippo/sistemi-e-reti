import java.io.*;
//creo la classe principale
class Saluti {
	public static void main (String args[]){
	//dichiaro variabili
	string testo;
		System.out.println("inserisci una parola");
		InputStreamReader input= new
		InputStreamReader (System.in);
		BufferedReader tastiera= new
		BufferedReader (input);
		testo=tastiera.readLine (input);
		System.out.println (testo);
	}	
}
