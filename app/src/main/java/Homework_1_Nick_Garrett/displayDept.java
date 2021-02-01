package Homework_1_Nick_Garrett;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Vector;

public class displayDept {

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

            ScrollPane pane = new ScrollPane();
            ListView<String> list = new ListView<String>();

            vectorClass newVector = new vectorClass();
            Vector<Course> vector = newVector.getVector();
            //course.getDepartment(vector);


            ObservableList<String> items = FXCollections.observableArrayList();
            for (int i = 0; i < vector.size(); i++) {
                //items.add("Item 3");
                //    //course number, name, number of credits
                String department = vector.get(i).department;
                String name = vector.get(i).getCourseName();
                int number = vector.get(i).getCourseNumber();
                int credits = vector.get(i).getNumberOfCredits();
                String code = vector.get(i).getDepartmentCode();
                if (department == comboBox.getValue()) {
                    items.add("Department: " + department + "\tDepartment Code: " + code + "\tCourse Name: " + name + "\tCourse Number: " + number + "\tcredits worth: " + credits);
                }
                //System.out.println("Department:" + department);
            }


            list.setItems(items);
            //pane.prefWidthProperty().bind(list.widthProperty());
            //pane.prefHeightProperty().bind(list.heightProperty());
            pane.setPrefWidth(450);
            //pane.setPrefHeight(80);
            pane.setContent(list);
            HBox hbox = new HBox(comboBox);

            pane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
            Group group = new Group();
            group.getChildren().add(pane);
            group.getChildren().add(hbox);

            Scene scene = new Scene(group, 500, 400);
            primaryStage.setScene(scene);
            primaryStage.show();


        });
    }

}

