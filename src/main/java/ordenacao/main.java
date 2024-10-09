/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * 
 */
public class main {
    
        public static List<Candidatos> carregarCSV(String filePath) {
        List<Candidatos> candidatos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                String[] v = line.split(",");
                int id = Integer.parseInt(v[0]);
                String nome = v[1];
                LocalDate dataNasc = LocalDate.parse(v[2], formatter);
                int nota = Integer.parseInt(v[3]);

                candidatos.add(new Candidatos(id, nome, dataNasc, nota));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidatos;
    }
        
  private static void printArray(Candidatos[] array) {
      int i = 0;  
      for (Candidatos candidato : array) {
            
            i++;
     
            
            
            System.out.printf("Colocado %d Nota: %d, Nome: %s, ID: %d %n",i, 
                    candidato.getNota(), candidato.getNome(), candidato.getNota());
        }
    }
    
    
    
   public static void main(String[] args) {
    

        String filePath = "C:\\Users\\36649863858\\Documents\\NetBeansProjects\\ClassficacaoCandidatos/dadosConcurso.csv";
        List<Candidatos> candidatos = carregarCSV(filePath);
        
        InsertionSort iSort = new InsertionSort();
        Candidatos[] vetC = new Candidatos[candidatos.size()];
        vetC = candidatos.toArray(vetC);
         System.out.println("\t Classficado Desordenado\n");
         printArray(vetC);
         
           System.out.println("\n\t Classficado Ordenado\n");
        iSort.insertionSort(vetC);
     
        printArray(vetC);
         
    }
}
