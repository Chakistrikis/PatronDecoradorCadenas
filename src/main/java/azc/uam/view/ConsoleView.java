package azc.uam.view;

import azc.uam.controller.TextController;
import java.util.Scanner;

public class ConsoleView {
    public void setupConsole(){
        System.out.println("==================MENU==================");
        System.out.println(" 1 - Decorador *");
        System.out.println(" 2 - Decorador -");
        System.out.println(" 3 - Decorador =");
        System.out.println(" 4 - Finalizar");
    }

    public int selectOption(){
        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            return option;
        }
        catch(Exception e){
            System.out.println("Opcion no valida.");
            TextController controller = new TextController(this);
            return controller.start();
        }
    }

    public String inputText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta una cadena: ");
        String text = scanner.nextLine();
        if(!text.isEmpty()){
            return text;
        }
        else {
            return inputText();
        }
    }
}
