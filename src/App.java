import java.util.Scanner;

public class App {
    public static void drawArt() throws Exception
        {
            Scanner scan= new Scanner(System.in);
            System.out.println("Hi would you like to see a dog or cat");
            String answer=scan.next();


            if (answer.equals("dog")) {
                System.out.println("Dog ACSII Art Here");
            }

            else if(answer.equals("cat")){
                System.out.println("Cat ACSII Art Here");
            }

            else {
               System.out.println("Invalid Input");
                drawArt(); 
            }

            

        }
    public static void main(String[] args) throws Exception {

        drawArt();
        

        



    }
}
