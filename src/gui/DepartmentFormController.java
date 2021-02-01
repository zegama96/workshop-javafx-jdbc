package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable{
	
	private Department entity;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;

	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	public void obBtSaveAction() {
		System.out.println("obBtSaveAction");
	}
	
	@FXML
	public void obBtCancelAction() {
		System.out.println("obBtCancelAction");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		initializeNodes();
	}
	
	public void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	public void updateFormData() {
		if(entity ==null) {
			throw new IllegalStateException("Entity was null");
		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(String.valueOf(entity.getName()));
	}
}
