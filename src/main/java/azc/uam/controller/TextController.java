package azc.uam.controller;

import azc.uam.model.StringUtil;
import azc.uam.view.ConsoleView;

public class TextController {
    private ConsoleView view;

    public TextController(ConsoleView view) {
        this.view = view;
    }

    public int start(){
        boolean endProgram = false;
        while (!endProgram) {
            view.setupConsole();
            int option = view.selectOption();
            switch (option){
                case 1 -> {
                    StringUtil text = new StringUtil(view.inputText());
                    int length = text.getText().length();
                    for (int i = 0; i < length + 4; i++){
                        System.out.print("*");
                    }
                    System.out.println("\n" + "* " + text.getText() + " *");
                    for (int i = 0; i < length + 4; i++){
                        System.out.print("*");
                    }
                    System.out.println("\n\n");
                }
                case 2 -> {
                    StringUtil text = new StringUtil(view.inputText());
                    int length = text.getText().length();
                    for (int i = 0; i < length + 4; i++){
                        System.out.print("-");
                    }
                    System.out.println("\n" + "| " + text.getText() + " |");
                    for (int i = 0; i < length + 4; i++){
                        System.out.print("-");
                    }
                    System.out.println("\n\n");
                }
                case 3 -> {
                    StringUtil text = new StringUtil(view.inputText());
                    int length = text.getText().length();
                    for (int i = 0; i < length + 4; i++){
                        System.out.print("=");
                    }
                    System.out.println("\n" + " " + text.getText() + " ");
                    for (int i = 0; i < length + 4; i++){
                        System.out.print("=");
                    }
                    System.out.println("\n\n");
                }
                case 4 -> {
                    System.out.println("Ten un lindo dia! 👨🏻‍💻👩🏻‍💻");
                    endProgram = true;
                }
                default -> System.out.println("Opcion no valida.");
            }
        }
        return 0;
    }
}
