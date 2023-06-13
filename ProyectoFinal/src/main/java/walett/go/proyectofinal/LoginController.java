package walett.go.proyectofinal;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import logic.logica;
import model.Usuario;
import persistencia.fileObjetos;

/**
 * * @author Jorman Noriega, Julio Rios, Andres Contreras, Sergio Arango
 */
public class LoginController implements Initializable {

    @FXML
    private Hyperlink hvRegistrar;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField password;

    @FXML
    private Button btnRegistrar;

    @FXML
    private StackPane stackPaneLogin;

    private fileObjetos fileObjetos;

    @FXML
    public void clickRegistrar(ActionEvent a) throws IOException {
        App.setRoot("register");
    }

    public void clickIniciarSesion(ActionEvent e) throws IOException {
        String correo = txtUsuario.getText();
        String contraseña = password.getText();

        try {
            Usuario usuario = this.fileObjetos.buscarUsuario(correo);
            if (usuario != null && usuario.getContraseña().equals(contraseña)) {

                Alert alertas = new Alert(Alert.AlertType.CONFIRMATION);
                alertas.setTitle("Login exitoso");
                alertas.setContentText("Ingresó correctamente");
                alertas.showAndWait();

                Parent a = FXMLLoader.load(getClass().getResource("menu.fxml"));
                Scene scene = new Scene(a);
                Stage newStage = new Stage();
                newStage.setScene(scene);
                newStage.show();
                
            } else {
                Alert alertas = new Alert(Alert.AlertType.ERROR);
                alertas.setTitle("Login Error");
                alertas.setContentText("Usuario incorrecto o no existe");
                alertas.showAndWait();
            }
        } catch (IOException ioe) {
            Alert alertas = new Alert(Alert.AlertType.ERROR);
            alertas.setTitle("Login Error");
            alertas.setContentText("Error al leer el archivo");
            alertas.showAndWait();
        }
    }

    /*
    public void newLoginUser() throws IOException {

        String userName = this.txtUsuario.getText();
        String password = this.password.getText();
        try {
            Usuario userLogin = this.userModel.getUser(userName);
            if (userLogin.getPassword().equals(password)) {

                SingletonSesionUsuario.setUsuarioActivo(userLogin);
                App.newStage("Principal", false);

            } else {
                JOptionPane.showMessageDialog(null, "Password incorrecto", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                this.password.requestFocus();
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e, "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            throw ioe;
        }
    }
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fileObjetos = new fileObjetos();
    }

}
