/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ordenacao;

import java.util.Random;

/**
 *
 
 */
public class InsertionSort {

   public void insertionSort(Comparable<Candidatos>[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            Comparable<Candidatos> currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j].compareTo((Candidatos) currentValue) < 0) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }
}
