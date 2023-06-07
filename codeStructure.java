import java.util.Scanner;
import java.util.Random;
public class pack {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = new Random().nextInt(100);
        int count = 0;
        do{
            System.out.print("Input your num (0-100):");
            int n = num.nextInt();
            if (n == number){
                System.out.println("Win");

            }
            if (n >= number) {
                System.out.println("Too much ");
                count++;
                
            } else {
                System.out.println("Too little ");  
                count++;
            }
            if(count==10){
                System.out.println("you have lose ans : "+number);
            }
        }while(count!=10);


    System.out.println("Khuannapa Thaijuntuk 63022889");
    }
    
}
