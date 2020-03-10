package HW;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {//ссылка на окно
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));//подгрузить все что прописали
        primaryStage.setTitle("Hello World");//заголовок
        primaryStage.setScene(new Scene(root, 450, 350));//размеры
        primaryStage.show();//показать окно
    }


    public static void main(String[] args) {
        launch(args);
    }
}
