/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojava;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author felip
 */
public class FXMLDocumentController implements Initializable {
    /* Este primixo FXML se refere a declaraçaõ dos conponentes do programa.
     *Ao declara o Button ele automaticamente sugere o import da biblioteca,
    para esse componente*/
    @FXML
    private Label lblMensagem;
    private Button btnClick;
    /* Esse segunfo FXML se refere a ação do button, que se da atraves de um 
    actin performance*/
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo!");
        //Atraves do setText o label é alterado.
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
