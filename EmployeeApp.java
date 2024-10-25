import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class EmployeeApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Employee Info");
        TextField nameField = new TextField(), empIDField = new TextField(), designationField = new TextField();
        TextField basicPayField = new TextField(), licField = new TextField();
        TextArea resultArea = new TextArea();
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            Employee emp = new Employee(nameField.getText(), empIDField.getText(), designationField.getText(),
                                         Double.parseDouble(basicPayField.getText()), Double.parseDouble(licField.getText()));
            resultArea.setText(emp.getDetails());
        });
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.addRow(0, new Label("Name:"), nameField);
        grid.addRow(1, new Label("Employee ID:"), empIDField);
        grid.addRow(2, new Label("Designation:"), designationField);
        grid.addRow(3, new Label("Basic Pay:"), basicPayField);
        grid.addRow(4, new Label("LIC:"), licField);
        grid.add(submitButton, 0, 5, 2, 1);
        grid.add(resultArea, 0, 6, 2, 1);
        primaryStage.setScene(new Scene(grid, 400, 400));
        primaryStage.show();
    }
}
/*
public class Employee {
    private String name, empID, designation;
    private double basicPay, DA, HRA, PF, LIC, netSalary;

    public Employee(String name, String empID, String designation, double basicPay, double lic) {
        this.name = name;
        this.empID = empID;
        this.designation = designation;
        this.basicPay = basicPay;
        this.LIC = lic;
        calculateComponents();
    }

    private void calculateComponents() {
        DA = 0.40 * basicPay;
        HRA = 0.15 * basicPay;
        PF = 0.12 * basicPay;
        netSalary = basicPay + DA + HRA - PF - LIC;
    }

    public String getDetails() {
        return String.format("Name: %s\nID: %s\nDesignation: %s\nBasic Pay: %.2f\nDA: %.2f\nHRA: %.2f\nPF: %.2f\nLIC: %.2f\nNet Salary: %.2f",
                             name, empID, designation, basicPay, DA, HRA, PF, LIC, netSalary);
    }
}

 */