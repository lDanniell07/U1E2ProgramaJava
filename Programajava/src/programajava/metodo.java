/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programajava;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Daniel
 */
public class metodo {
    
String texto = "";
    String[] ordenado = {"Yo", "soy", "groot..."};
    String desordenado[];

    public void leer() {
        
       //Realiza lectua del archivo txt y guarda en un arreglo
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Daniel\\Desktop\\programacion logica y funcional\\Programajava\\frase.txt"));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
                texto = temp;
                desordenado = texto.split(" ");

            }
            System.out.println("--------------Frase desordenada----------------");
            for (int i = 0; i < desordenado.length; i++) {
                System.out.println(desordenado[i]);
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }

        //ordena arreglo-algorito burbuja 
        for (int i = 0; i < ordenado.length - 1; i++) {
        for (int j = 0; j < ordenado.length - 1; j++) {
        if ((ordenado[j].equalsIgnoreCase(desordenado[j])) != true) {
                    String aux = desordenado[j];
                    desordenado[j] = desordenado[j + 1];
                    desordenado[j + 1] = aux;

                }
            }

        }
        
        
        //imprime frase ordenada 
        System.out.println("\n--------------frase ordenada-------------------");
        for (int i = 0; i < desordenado.length; i++) {
            System.out.print(desordenado[i]+" ");
        }
    }
}

