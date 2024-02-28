import java.util.Scanner;

public class App {
    public static void drawArt() 
        {
            Scanner scan= new Scanner(System.in);
            System.out.println("Hi would you like to see a dog or cat or a fish");
            String answer=scan.next();


            if (answer.equals("dog")) {
                System.out.println("Dog ACSII Art Here");
                System.out.println("(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
            }

            else if(answer.equals("cat")){
                System.out.println("Cat ACSII Art Here");
                System.out.println(
" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
            }
            else if(answer.equals("fish"))
            {
                System.out.println("Fish ACSII Art Here");
                System.out.println(
"       .\n      \":\"\n    ___:____     |\"\\/\"|\n  ,\'        `.    \\  /\n  |  O        \\___/  |\n~^~^~^~^~^~^~^~^~^~^~^~^~"
);
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
