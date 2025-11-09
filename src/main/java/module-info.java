module co.edu.uniquindio.gimnasiouq.gimnasiouq {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gimnasiouq.gimnasiouq to javafx.fxml;
    exports co.edu.uniquindio.gimnasiouq.gimnasiouq;
}