package Homework_1_Nick_Garrett;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.InputStream;
import java.util.Collection;
import java.util.Scanner;
import java.util.Vector;

import static javafx.application.Application.launch;

public class getUserInput extends javaFXHost {

    public void end() {
        //System.out.println("exiting");
        //Platform.exit();
    }
    public void save(Course courseData){
        //Course course = courseData;
        vectorClass newVector = new vectorClass();
        System.out.println("newVector.addVector(courseData) : " + courseData);
        newVector.addVector(courseData);
       // newVector.addVector(courseData);

/*
        Vector vector = newVector.getVector();
        Course course = new Course();
        System.out.println("full vecotr: " + vector);
        System.out.println("first element in vector" +vector.get(0));


 */
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Department");

        ComboBox comboBox = new ComboBox();

        // course number, name, number of credits
        comboBox.getItems().addAll("Computer Science","Mathematics","Chemistry","Physics","Botany","Zoology");


        comboBox.setOnAction((event) -> {
            int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
            Object selectedItem = comboBox.getSelectionModel().getSelectedItem();

            System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
            System.out.println("   ComboBox.getValue(): " + comboBox.getValue());


            //Creating a GridPane container
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setVgap(5);
            grid.setHgap(5);
// courseNumber
            final TextField courseNumber = new TextField();
            courseNumber.setPromptText("Course Number:");
            courseNumber.setPrefColumnCount(10);
            courseNumber.getText();
            GridPane.setConstraints(courseNumber, 0, 0);
            grid.getChildren().add(courseNumber);

//course name
            final TextField courseName = new TextField();
            courseName.setPromptText("Course Name:");
            GridPane.setConstraints(courseName, 0, 1);
            grid.getChildren().add(courseName);

//number of credits
            final TextField creditsWorth = new TextField();
            creditsWorth.setPrefColumnCount(15);
            creditsWorth.setPromptText("Number of Credits");
            GridPane.setConstraints(creditsWorth, 0, 2);
            grid.getChildren().add(creditsWorth);

//enter button
            Button enterButton = new Button("Enter");
            GridPane.setConstraints(enterButton, 1, 0);
            grid.getChildren().add(enterButton);


            //When button is pressed
            enterButton.setOnAction(actionEvent ->  {
                String department,courseNameInput = null;
                int courseNumberInput, creditsWorthInput = 0;
                department = comboBox.getValue().toString();
                courseNumberInput = Integer.parseInt(courseNumber.getText());
                courseNameInput = courseName.getText();
                creditsWorthInput = Integer.parseInt(creditsWorth.getText());

                if ((department!=null && courseNumberInput!=0 && courseNameInput!=null && creditsWorthInput != 0) && (department!="" && courseNumberInput!=0 && courseNameInput!="" && creditsWorthInput != 0)) {
                    System.out.println("Department: " + department +
                            "\ncourseNumber: " + courseNumberInput +
                            "\nCourseName: " + courseNameInput +
                            "\ncredits the course is worth: " + creditsWorthInput);
                    Course newPoint = new Course(department, courseNameInput, courseNumberInput, courseNumberInput);
                    save(newPoint);
                    end();

                }
                else {
                    System.out.println("One or more of the entires are empty.");
                }

            });

            Scene scene = new Scene(grid, 400, 200);
            primaryStage.setScene(scene);
            primaryStage.show();

        });



        HBox hbox = new HBox(comboBox);

        Scene scene = new Scene(hbox, 200, 120);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
