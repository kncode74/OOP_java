import java.util.*;
class one {
    Random ber = new Random();
    public int input_num;
    public int random_num = ber.nextInt(100);
    
    public void veriable() {
        Scanner something = new Scanner(System.in);
        int numone = something.nextInt();
        input_num = numone;

    }
    public String condition() {
            System.out.print("selent the numbers(0-100) : ");
            veriable();
            if (input_num > random_num) {
                String a = "to more";
                return a;
            } else if (input_num < random_num) {
                String a = "to less";
                return a;
            } else {
                String a = "!!! You are THE WINNER of the game!!!";
                return a;
            }
    }
}
public class finalx {
    public static void main(String[] args) {
        one Myobj = new one();
        for(int i =0 ; i <= 10;i++){
            if(Myobj.input_num == Myobj.random_num){
                break;
            }
            else if(i == 10){
                System.out.println("your lose ans : "+ Myobj.random_num);
            }
            System.out.println(Myobj.condition());
        }
    } 
}
