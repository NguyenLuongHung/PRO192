
import java.util.InputMismatchException;
import java.util.Scanner;


class Atom {
    Scanner in = new Scanner(System.in);
    int number;
    String symbol;
    String fullName;
    double weight;
    
    int check1,check2,check3,check4 = 0; // check1 for number, check2 for symbol, check3 for fullname and check4 for weight validation
    
    boolean accept(){
        String response ="";
        String response1 ="";
        double checkConvert = 0;
        do {
            
            check1 = 0;
            try{
                System.out.print("Number: ");
                
                response = in.nextLine();
                this.number = Integer.parseInt(response);
                
                
            } catch (NumberFormatException | InputMismatchException e){
                System.out.println("Unvalid Input, please try again");
                check1 = 1;
            }
        } while (check1 == 1);
        
        
        do {
            System.out.print("Symbol: ");
            this.symbol = in.nextLine();
            check2 = 0;     
            try{
                checkConvert = Double.parseDouble(symbol);
                check2 = 1;
            } catch (NumberFormatException e) {
                check2 = 0;
            }
         if (check2 == 1)
                System.out.println("Unvalid Input, please try again");
         
        } while (check2 == 1);
        
        
        do {
           
            System.out.print("Full Name: ");
            this.fullName = in.nextLine();
            check3 = 0;
            try{
                checkConvert = Double.parseDouble(fullName);
                check3 = 1;
            } catch (NumberFormatException e) {
                check3 = 0;
            }
         if (check3 == 1)
                System.out.println("Unvalid Input, please try again");
         
        } while (check3 == 1);
        
        do {
            check4 = 0;
            System.out.print("Weight: ");
            try{
                
                
                response1 = in.nextLine();
                
                this.weight = Float.parseFloat(response1);
                //this.weight = in.nextDouble();
                
            } catch (NumberFormatException |InputMismatchException e){
                
                System.out.println("Unvalid Input, please try again");
                
                check4 = 1;
            }
        } while (check4 == 1);
        
        return true;
    }
    
    void display(){
        System.out.printf("%-10d", this.number);
        System.out.printf("%-10s", this.symbol);
        System.out.printf("%-15s", this.fullName);
        System.out.printf("%-10f", this.weight);
    }
}


    


public class workshop3_2 {
    
    
    public static void main(String[] args) {
        String[] title = {"Number", "Symbol", "Full Name", "Weight"};
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.print("How many atoms you want to store: ");
        n = in.nextInt();
        Atom[] atoms = new Atom[n];
        for (int i = 0; i < atoms.length; i++){
            atoms[i] = new Atom();
            System.out.println("Atomy " + i + " :");
           
            if(atoms[i].accept())
                System.out.println("Input Successfully!!");
        }
        
        //Display in tabular format
        
        
        System.out.printf("%-10s", title[0]);
        System.out.printf("%-10s", title[1]);
        System.out.printf("%-15s", title[2]);
        System.out.printf("%-10s", title[3]);
        System.out.println("");
        for (int j = 0; j < atoms.length; j++){
            atoms[j].display();
            System.out.println("");
        }
            
    }
}
