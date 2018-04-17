/*
FPT UNIVERSITY K13
Name: BiDD
Age: 20
DATE: 17/04/2018
SUBJECT: PRO192
email: luonghung.qb@gmail.com
Workshop 3_1

*/

import java.util.Scanner;

class Molecule { 
    String structure;
    String name;
    double weight;
    
    void display(){
        System.out.println("Structure: " + structure);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }
}

public class workshop3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.print("How many molecules you want to input: "); // Input the number of molecules
        n = in.nextInt();
        
        Molecule[] molecules = new Molecule[n]; // Array of objects
        for (int k = 0; k < molecules.length; k++)
            molecules[k] = new Molecule();
        
        for (int i = 0 ; i < n; i++){ // Input information into objects
            System.out.printf("Molecule %d: \n", i);
            System.out.printf("\tStructure: ");
            molecules[i].structure = in.next();
            System.out.printf("\tName: ");
            molecules[i].name = in.next();
            System.out.printf("\tWeigh: ");
            molecules[i].weight = in.nextDouble();
        }
        
        
        // Display all Molecules
        
        for (int j = 0; j < n; j++ ){
            molecules[j].display();
            System.out.println("");
        }
        
    }
}
