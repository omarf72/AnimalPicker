import java.util.Scanner;

public class App {
    public static void drawArt()
        {
            Scanner scan= new Scanner(System.in);
            System.out.println("Hi would you like to see a dog or cat");
            String answer=scan.next();


            if (answer.equals("dog")) {
                System.out.println("Dog ACSII Art Here");
            }

        }
    public static void main(String[] args) throws Exception {

        drawArt();
        

        



    }
}
