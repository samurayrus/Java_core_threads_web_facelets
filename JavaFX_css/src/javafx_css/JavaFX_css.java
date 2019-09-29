package javafx_css;

import com.sun.javaws.jnl.JavaFXAppDesc;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JavaFX_css extends Application {
    ObservableList<PieChart.Data> pieData;
    public JavaFX_css() 
    {
        pieData = FXCollections.observableArrayList(new PieChart.Data("понедельник", 10), 
	new PieChart.Data("вторник", 30), 
	new PieChart.Data("среда", 15), 
	new PieChart.Data("четверг", 25), 
	new PieChart.Data("пятница", 20));
    }
    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button("PPTX");
        RotateTransition rt = new RotateTransition(Duration.seconds(2),btn);
        rt.setByAngle(66);
        
       // btn.setRotate(53); //поворот кнопки мгновенно
      btn.setCursor(Cursor.WAIT);// при наведении меняет курсор на анимацию ожидания
     btn.setScaleX(1.5f);
     
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
                pieData.add(new PieChart.Data("Срюда",8));
                rt.play();//запуск
            }
        });

        FlowPane root = new FlowPane();
        Label label = new Label("TTTT");
        PieChart chart = new PieChart(pieData);
        root.getChildren().add(chart);
        root.getChildren().add(btn);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 450, 500);
        scene.getStylesheets().add(JavaFX_css.class.getResource("CascadeSS.css").toExternalForm()); //подключение css из папки
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
        
    }
    
}
