package com.ehakobyan.mazebank.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {
    public TextField fName_field;
    public TextField lName_field;
    public TextField password_field;
    public CheckBox payee_address_cbox;
    public Label payee_address_lbl;
    public CheckBox ch_acc_cbox;
    public TextField ch_acc_balance_field;
    public CheckBox sv_acc_cbox;
    public TextField sv_acc_balance_field;
    public Button create_client_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
