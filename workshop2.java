
import java.util.Scanner;


class Array {
    Scanner in = new Scanner(System.in);
    int n;
    int[] element;
    void input(){
        element = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Please enter element [%d]: ", i);
            element[i] = in.nextInt();
        }
    }
    
    void display(){
         for (int i = 0; i < n; i++){
            System.out.printf("Element [%d]: %d\n",i, element[i]);
        }
    }
    
    void maxElement(){
        int a = element[0];
        for (int i = 0; i < n; i++){
            if (element[i] >= a){
                a = element[i];
            }
        }
        System.out.printf("The max element is: %d\n", a);
    }
    
    void sortElements(){
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
        Array s1 = new Array();
        System.out.print("Please enter n: ");
        s1.n = in.nextInt();
        s1.input();
        System.out.println("Displaying: ");
        s1.display();
        System.out.println("After sorting: ");
        s1.sortElements();
        s1.display();
        
        s1.maxElement();
        // Sort all elements in ascending order
        
        
        
        // Display elements after sorting
     
    
      
        
    }
}
