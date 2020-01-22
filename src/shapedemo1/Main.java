/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(200, 200, 150);
        circle.setFill(Color.RED);
        circle.setStroke(Color.WHITE);
        Circle circle1 = new Circle(200, 200, 130);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.WHITE);
        Arc arc = new Arc();
        arc.setCenterX(200.0f);
        arc.setCenterY(200.0f);
        arc.setRadiusX(150.0f);
        arc.setRadiusY(150.0f);
        arc.setStartAngle(0.0f);
        arc.setLength(45.0f);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.WHITE);
        Rectangle rectangle = new Rectangle(200,200,148,20);
        rectangle.setStroke(Color.RED);
        rectangle.setFill(Color.RED);
        
        Pane rootNode = new Pane();
        
        rootNode.getChildren().addAll(circle, circle1 ,arc,rectangle);

        Scene scene = new Scene(rootNode, 800, 600);

        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
