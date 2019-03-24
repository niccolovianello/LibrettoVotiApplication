package it.polito.tdp.libretto.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.libretto.model.Libretto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LibrettoController {
	
	Libretto model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNewEsame;

    @FXML
    private TextField txtNewVoto;

    @FXML
    private TextField txtNewData;

    @FXML
    private Button btnInsert;

    @FXML
    private TextField txtCfr;

    @FXML
    private TextField txtVotoSrc;

    @FXML
    private TextField txtEsameSrc;

    @FXML
    private TextField txtDataSrc;

    @FXML
    private Button btnCerca;

    @FXML
    private Button btnMigliora;

    @FXML
    private Button btnCancella;

    @FXML
    private TextField txtPuntiPiu;

    @FXML
    private TextField txtPuntiCancella;

    @FXML
    void doCancella(ActionEvent event) {

    }

    @FXML
    void doCercaVoto(ActionEvent event) {

    }

    @FXML
    void doInsert(ActionEvent event) {

    }

    @FXML
    void doMigliora(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtNewEsame != null : "fx:id=\"txtNewEsame\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtNewVoto != null : "fx:id=\"txtNewVoto\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtNewData != null : "fx:id=\"txtNewData\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnInsert != null : "fx:id=\"btnInsert\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtCfr != null : "fx:id=\"txtCfr\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtVotoSrc != null : "fx:id=\"txtVotoSrc\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtEsameSrc != null : "fx:id=\"txtEsameSrc\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtDataSrc != null : "fx:id=\"txtDataSrc\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnMigliora != null : "fx:id=\"btnMigliora\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtPuntiPiu != null : "fx:id=\"txtPuntiPiu\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtPuntiCancella != null : "fx:id=\"txtPuntiCancella\" was not injected: check your FXML file 'Libretto.fxml'.";

    }

	public void setModel(Libretto model) {
		this.model = model;
	}
}
