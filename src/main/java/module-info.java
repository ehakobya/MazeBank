module com.example.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.ehakobyan.mazebank to javafx.fxml;
    exports com.ehakobyan.mazebank;
    exports com.ehakobyan.mazebank.Controllers;
    exports com.ehakobyan.mazebank.Controllers.Admin;
    exports com.ehakobyan.mazebank.Controllers.Client;
    exports com.ehakobyan.mazebank.Models;
    exports com.ehakobyan.mazebank.Views;
}