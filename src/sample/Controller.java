package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller{

        @FXML
        private Button idboton;

        @FXML
        private Label mensajeid;

        @FXML
        private Label mostrarcontraseña;

        @FXML
        private Label contraseña;


        @FXML
        public void pulsarboton(){
                idboton.setOnAction(actionEvent -> {
                        mensajeid.setText("Has pulsado el boton!");
                        System.out.println(mensajeid);
                });
       
        }
        @FXML
        public void Mostrarcontraseña(){
                if(!contraseña.getText().isEmpty()){
                        String d = contraseña.getText();
                        System.out.println(d);
                }
        }
}

