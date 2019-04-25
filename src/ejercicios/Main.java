package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Jhon Alexander
 * @author Brallan Serna
 *
 */
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.uno();
		// main.dos();
		  //main.tres();
		 //main.cuatro();

	}
	
	

	private void cuatro() {
					
		 Scanner obj=new Scanner(System.in);
	     System.out.println("Ingrese el ancho del pentagono");
	        
	       int dime=obj.nextInt();
	       double sumador=dime*0.5-1;
	       int aumentar=dime;
	       int aumentar2=dime;
	       int disminuir=dime;
	       int disminuir2=dime;
	       
	       //linea horizontal superior
	       for(int i=0; i<=dime; i++){
	           System.out.print("  ");
	       }
	       for(int k=0; k<dime; k++){
	           System.out.print(" *");
	       }
	        System.out.println("");
	        
	        //lineas diagonales superiores
	        //diagonal izquierda
	        for(int i=0; i<dime+1; i++){
	            disminuir=disminuir-1;
	            for(int k=0; k<=disminuir; k++){
	                System.out.print("  ");
	            }
	            
	            System.out.print(" *");
	            
	         //diagonal derecha
	         aumentar=aumentar+1;
	         if(dime%2==0){
	             for(double k=dime/dime+sumador; k<aumentar-1; k++){
	                 System.out.print("    ");
	             }
	             System.out.print(" *");
	             System.out.println("");
	         }
	         else{
	              for(double k=dime/dime+sumador; k<aumentar-1; k++){
	                 System.out.print("    ");
	             }
	             System.out.print("*");
	             System.out.println("");
	         }
	       }

	        
	        //Infeiores
	        //diagonal izquierda
	        for(int i=0; i<dime+1; i++){
	            aumentar2=aumentar2+1;
	            for(int j=dime/dime+dime; j<=aumentar2; j++){
	                System.out.print("  ");
	            }
	            System.out.print(" *");
	            
	            //diagonal derecha
	            disminuir2=disminuir2-1;
	            for(int k=dime/dime-disminuir2-dime; k<=disminuir2; k++){
	                System.out.print("  ");
	            }
	            System.out.print(" *");
	            System.out.println("");
	        }
	        //Linea horizonal final
	        for(int j=0; j<=dime; j++){
	            System.out.print("  ");
	        }
	        for(int k=0; k<dime; k++){
	            System.out.print(" **");
	        }
	        System.out.println("");
	        
	        
	 }
	    
	        
	        /*
	        
	        //lineas diagonales inferiores
	        //diagonal izquierda
	        for(int i=0; i<dimension; i++){
	            aumentar2=aumentar2+1;
	            for(int j=dimension/dimension+dimension; j<=aumentar2; j++){
	                System.out.print("  ");
	            }
	            System.out.print(" *");
	            
	            //diagonal derecha
	            disminuir2=disminuir2-1;
	            for(int k=dimension/dimension-disminuir2-dimension; k<=disminuir2; k++){
	                System.out.print("  ");
	            }
	            System.out.print(" *");
	            System.out.println("");
	        }
	        
	        //linea horizontal inferior
	        for(int j=0; j<=dimension; j++){
	            System.out.print("  ");
	        }
	        for(int k=0; k<dimension; k++){
	            System.out.print(" *");
	        }
	        System.out.println("");
	        
	        */
	   
	    
		
		/*
		Scanner scanner = new Scanner(System.in);
		int numero1 = 0;
		int b = 0;
		System.out.println("Ingrese el ancho del pentagono");
		
		b = scanner.nextInt();
		for (int i = 0; i <=b; i++) {
			int numero2 = 0;
			while (numero2 <=numero1) {
				System.out.print("*");
				numero2 ++;
				
			}
			
			numero1 ++;
			System.out.println("");
			
		}
		*/
		
	

	public void tres(){
	try{
			
			String contenido = "";
			File file = new File("C:/Users/Estudiantes/Desktop/ejercicio3.csv");
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
		
			
			
	
			String[] v1 = null;
			String[] v2 = null;
			
			while (bufferedReader.ready()) {
				v1 = bufferedReader.readLine().split(",");
				v2 = bufferedReader.readLine().split(",");
				
				break;
			}
			
			
			//Se suman
			int[] resultado = new int[v1.length];
			String result1 = "";
			String result2 = "";
			for (int i = 0; i < v1.length; i++) {
				resultado[i] = Integer.parseInt(v1[i]) + Integer.parseInt(v2[i]);
				contenido += resultado[i] + ",";
				result1 += v1[i] + ",";
				result2 += v2[i] + ",";
			}
			
			//Se imprime
			/*for (int i = 0; i < v1.length; i++) {
				System.out.println("vector 1");
				System.out.println(v1[i]);
				
				System.out.println("vector 2");
				System.out.println(v2[i]);
				
				System.out.println("resultado");
				System.out.println(resultado[i]);
				System.out.println("__________________");
				
				
			}*/
			
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			
			writer.write(result1);
			writer.newLine();
			writer.write(result2);
			writer.newLine();
			writer.write("--------------------------------");
			writer.newLine();
			writer.write(contenido);
			writer.close();

			
		
		
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void dos(){
		try{
			
			String contenido = "";
			
			File file = new File("C:/Users/MI PC.BRAYAN1998.000/Desktop/vectores.txt");
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
		
			
			
	
			String[] v1 = null;
			String[] v2 = null;
			
			while (bufferedReader.ready()) {
				v1 = bufferedReader.readLine().split(";");
				v2 = bufferedReader.readLine().split(";");
				
				break;
			}
			
			
			//Se suman
			int[] resultado = new int[v1.length];
			String result1 = "";
			String result2 = "";
			for (int i = 0; i < v1.length; i++) {
				resultado[i] = Integer.parseInt(v1[i]) + Integer.parseInt(v2[i]);
				contenido += resultado[i] + ";";
				result1 += v1[i] + ";";
				result2 += v2[i] + ";";
			}
			
			//Se imprime
			/*for (int i = 0; i < v1.length; i++) {
				System.out.println("vector 1");
				System.out.println(v1[i]);
				
				System.out.println("vector 2");
				System.out.println(v2[i]);
				
				System.out.println("resultado");
				System.out.println(resultado[i]);
				System.out.println("__________________");
				
				
			}*/
			
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			
			writer.write(result1);
			writer.newLine();
			writer.write(result2);
			writer.newLine();
			writer.write("--------------------------------");
			writer.newLine();
			writer.write(contenido);
			writer.close();

			
		
		
		} catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void uno(){
		
		int[] vector1;
		int[] vector2;
		int[] result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la longitud de los vectores");
		String entrada = scanner.nextLine();
		System.out.println("");
		
		
		vector1 = new int[Integer.parseInt(entrada)];
		vector2 = new int[Integer.parseInt(entrada)];
		result = new int[Integer.parseInt(entrada)];
		
		//Se setea los numeros aleatorios
		Random random = new Random();
		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = random.nextInt(9);
			vector2[i] = random.nextInt(9);
		}
		
		//Se suman
		for (int i = 0; i < vector1.length; i++) {
			result[i] = vector1[i] + vector2[i];
		}
		
		//Se imprime
		for (int i = 0; i < vector1.length; i++) {
			System.out.println("vector 1");
			System.out.println(vector1[i]);
			
			System.out.println("vector 2");
			System.out.println(vector2[i]);
			
			System.out.println("resultado");
			System.out.println(result[i]);
			System.out.println("__________________");
		}
		
		
		
	}

}
