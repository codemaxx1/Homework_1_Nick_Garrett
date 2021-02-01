package Homework_1_Nick_Garrett;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Vector;

public class javaFXHost extends Application {
private getUserInput ged;
private displayAll da;
private displayDept l;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Department");


        Button button = new Button("Add new Class");
        Button button2 = new Button("display (all)");
        Button exit = new Button("EXIT");
        Button departmentClassList = new Button("display (dep)");

        VBox buttons = new VBox();
        buttons.getChildren().addAll(button, button2, departmentClassList, exit);

        Scene scene = new Scene(buttons, 200, 120);


        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                ged = new getUserInput();
                System.out.println("starting getUserInput class");
                try {
                    ged.start(new Stage());
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                da = new displayAll();
                System.out.println("display all terms in the vector");
                try {
                    da.start(new Stage());
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });



        //departmentClassList
        departmentClassList.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                l = new displayDept();
                System.out.println("display all terms in the vector");
                try {
                    l.start(new Stage());
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });




        //exit
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Platform.exit();

            }
        });

        /*

         */

        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
