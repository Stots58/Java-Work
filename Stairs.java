import java.util.Scanner;

public class Stairs
{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        
        System.out.println("Enter a character (!,@,#,$,% Ex).: ");
        String userInputChar = userInput.nextLine();
        
        System.out.println("Enter a number.: ");
        int userInputNumber = userInput.nextInt();
        
        int counter = 1;
        String emt = " ";
        
        for (int i = 0; counter <= userInputNumber; i++){
            System.out.println(emt.repeat(userInputNumber - i) + userInputChar.repeat(counter));
            counter ++;
            
        }
    }
}
