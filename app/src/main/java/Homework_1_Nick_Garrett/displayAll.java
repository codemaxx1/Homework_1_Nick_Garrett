package Homework_1_Nick_Garrett;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.util.Vector;

public class displayAll {



    public void start(Stage primaryStage) throws Exception {
        ScrollPane pane = new ScrollPane();
        ListView<String> list = new ListView<String>();

        vectorClass newVector = new vectorClass();
        Vector<Course> vector = newVector.getVector();
        //course.getDepartment(vector);


        ObservableList<String> items = FXCollections.observableArrayList();
        for(int i = 0; i < vector.size(); i++) {
            //items.add("Item 3");
            //    //course number, name, number of credits
            String department = vector.get(i).department;
            String name = vector.get(i).getCourseName();
            int number = vector.get(i).getCourseNumber();
            int credits = vector.get(i).getNumberOfCredits();
            String code = vector.get(i).getDepartmentCode();
            items.add("Department: " + department + "\tDepartment Code: " + code + "\tCourse Name: " + name + "\tCourse Number: " + number + "\tcredits worth: " + credits);
            //System.out.println("Department:" + department);
        }

        list.setItems(items);
        //pane.prefWidthProperty().bind(list.widthProperty());
        //pane.prefHeightProperty().bind(list.heightProperty());
        pane.setPrefWidth(450);
        //pane.setPrefHeight(80);
        pane.setContent(list);
        pane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        Group group = new Group();
        group.getChildren().add(pane);
        Scene scene = new Scene(group, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
