package com.mycompany.pl15;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Button btn;
    @FXML
    private Label contaCliques;
    private int contador = 0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void TrataEvento(ActionEvent event) {
        contador++;
        System.out.println("Clicaste com sucesso!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        contaCliques.setText("Numero de cliques: " + contador);
    }
}
