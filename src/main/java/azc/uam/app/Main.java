package azc.uam.app;

import azc.uam.controller.TextController;
import azc.uam.view.ConsoleView;

/**
 * @author Christian Aguilera
 */
public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        TextController controller = new TextController(view);
        controller.start();
    }
}