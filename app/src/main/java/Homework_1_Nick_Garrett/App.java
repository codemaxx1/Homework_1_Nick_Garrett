
package Homework_1_Nick_Garrett;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Vector;

public class App {

    public static void main(String[] args) {
        System.out.println("Program Start");

        //Platform.setImplicitExit(false);

        System.out.println("Launch javaFXHost as \"host\" for the javafx... thing.");
        Application.launch(javaFXHost.class, args);
        //new getUserInput().start(new Stage());

        //System.out.println("print saved vector data.");
        //System.out.println("vector data:" + Course(vectorClass.getVector()) );

    }
}
