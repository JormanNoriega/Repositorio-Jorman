package walett.go.proyectofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.stage.Window;

/**
 * JavaFX App
 *
 * * @author Jorman Noriega, Julio Rios, Andres Contreras, Sergio Arango
 */
public class App extends Application {

    public static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"), 1600, 900);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show(); 
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    static void newStage(String fxml, boolean b) throws IOException {
        Window window = scene.getWindow();
        Stage stage = (Stage) window;

        if (!b) {
            stage.hide();
        }

        Parent newNode = App.loadFXML(fxml);

        /**
         * Para mostrar la ventana prinipal como nueva escene
         */
        scene = new Scene(newNode);
        //stage.setScene(scene);
        //stage.show();

        /**
         * Para mostrar la ventana prinipal como nueva stage
         */
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.setTitle(stage.getTitle());
        newStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
