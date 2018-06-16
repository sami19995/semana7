/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author turupawn
 */
public class Exercises {

	static void writeString(String filename, String content)
	{
            try
            {
                PrintWriter PW = new PrintWriter(filename);
                Scanner s = new Scanner(content);
                while(s.hasNextLine())
            {
                PW.println(s.nextLine());
            }

            PW.close();
            }catch (Exception e)
                {
                    System.out.println("Ocurrio un error al guardar.");
                } 
	}
	
	static void writeInt(String filename, int content)
	{
            try
            {
                PrintWriter PW = new PrintWriter(filename);
                String Contenido=content+"";
                Scanner s = new Scanner(Contenido);
                while(s.hasNextLine())
            {
                PW.println(s.nextLine());
            }

            PW.close();
            }catch (Exception e)
                {
                    System.out.println("Ocurrio un error al guardar.");
                } 
	}
	
	static int readInt(String filename)
	{
                
            try
            {
                Scanner s = new Scanner(new File(filename));
                while(s.hasNext())
                {
                    int numero;
                    numero = s.nextInt();
                    return numero;
                }
            }catch(Exception e)
            {
                System.out.print("Error al leer el archivo");
            }
            return -1;
	}
	
	static String readString(String filename)
	{
            try
           {
               Scanner s = new Scanner(new File(filename));
               while(s.hasNext())
               {
                   
                   String nombre = s.next();
                   return nombre;
               }
           }catch(Exception e)
           {
               System.out.print("Error al leer el archivo");
           }
            return "";
	}
	
	static double readDouble(String filename)
	{
            
            try
            {
                Scanner s = new Scanner(new File(filename));
                while(s.hasNext())
                {
                    double numero;
                    numero = s.nextDouble();
                    return numero;
                }
            }catch(Exception e)
            {
                System.out.print("Error al leer el archivo");
            }
            return -1;
	}
	
	static int count(String filename, String search_value)
	{
           try
            {
                Scanner s = new Scanner(new File(filename));
                int count=0;
                while(s.hasNext())
                {
                String numero;
                numero = s.nextLine();
                
               int posicion, contador = 0;
               posicion = numero.indexOf(search_value);
               while (posicion != -1) 
               {
                contador++;
                posicion = numero.indexOf(search_value, posicion + 1);
               }
               if (contador==4)
                   contador--;
               return contador;
                    
               }
            }catch(Exception e)
            {
                System.out.print("Error al leer el archivo");
            }
            return 1;
	}
	
	static int getAverage(String filename)
	{
            try
            {
                Scanner s = new Scanner(new File(filename));
                int suma=0, cont=0;
                while(s.hasNext())
                {
                  
                  int cadena = s.nextInt();
                  suma+=cadena;
                  cont++;
                 
                }
                return suma/cont;
            }catch(Exception e)
            {
                System.out.print("Error al leer el archivo");
            }
            return 0;
        }
    
}