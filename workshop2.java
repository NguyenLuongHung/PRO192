/*
FPT UNIVERSITY K13
Name: BiDD
Age: 20
DATE: 17/04/2018
SUBJECT: PRO192
email: luonghung.qb@gmail.com
Workshop 2
*/




import java.util.Scanner;
class Array {
    Scanner in = new Scanner(System.in);
    int n;
    int[] element;
    void input(){ // Input elements
        element = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Please enter element [%d]: ", i);
            element[i] = in.nextInt();
        }
    }
    
    void display(){ // Display elements
         for (int i = 0; i < n; i++){
            System.out.printf("Element [%d]: %d\n",i, element[i]);
        }
    }
    
    void maxElement(){ // method used to find the max value
        int a = element[0];
        for (int i = 0; i < n; i++){
            if (element[i] >= a){
                a = element[i];
            }
        }
        System.out.printf("The max element is: %d\n", a);
    }
    
    void sortElements(){ // method used to sort elements ascending
        int b = 0;
        for (int k = n-1; k > 0; k--){
            for (int q = 0; q < k; q++){
                if (element[q] > element[q+1]){
                    b = element[q];
                    element[q] = element[q+1];
                    element[q+1] = b;
                }
            }
        }
    }
}


public class workshop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Array s1 = new Array(); // Declare array
        
        System.out.print("Please enter n: "); // Input n
        s1.n = in.nextInt();
        
        s1.input(); // Call method input() from obejct s1 of class Array
        System.out.println("Displaying: ");
        
        s1.display(); // Call method display() from object s1 of class Array
        System.out.println("After sorting: ");
        
        s1.sortElements(); // Call method sortElements() form object s1 of class Array
        
        s1.display(); // Display it again
        
        s1.maxElement();// Display the max element after calling the method maxElement()
   
        
        
        
      
     
    
      
        
    }
}
