package NestedLoopsLab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


         int n = Integer.parseInt(scanner.nextLine());

         int result = 0;
         int counter = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {

                    result = i + j + k;

                    if (result == n) {
                        counter++;

                    }
                    
                }
                
            }
            
        }
        System.out.println(counter);
    }

}