package javafxapplication1;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Say 'Hello World'");
        btn.setOnAction(x->System.out.println("dsadadsad"));
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.TOP_CENTER);
        
        TextField tf = new TextField();
        Label lb = new Label("First NAME");
        
        //events
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, e->System.out.println("\n_" + e.getSource()));
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, e->System.out.println("\n_" + e.getSource()));
        root.add(lb,0,0);
        root.add(tf,1,1);
        root.add(btn,0,1);
        
        //обработчик множественных исключений
//        EventHandler eh = new EventHandler<Event>();
//        {
//            public void handle(Event eev)      
//            {
//            System.out.println("EV__"+eev.getEventType());
//        }
//        }
       // lb.setOnMouseClicked(e);
        //lb.addEventFilter(KeyEvent.ANY,ehh);
        lb.addEventFilter(MouseEvent.MOUSE_CLICKED,e->{System.out.println(e.getSource()+"\n"); e.consume();});  // e.consume() - завершение всплытия события. Оно выше не идет после этой команды. На вызывающем объекте не стоит его вызывать

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(root,300,250));
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
