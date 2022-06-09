

//this is controller layer
//controller is a interface between Model and View.
//it receive request from view and preocess them and send itback to view.

public class StudentController {
    private Student model;
    private StudentView view;
    
    
    public StudentController( Student model, StudentView view ) {
        this.model = model;
        this.view = view;
    }

    StudentController() {

    }
    
    public void setStudentName( String name ) {
        model.name = name;      
    }
    
    public String getStudentName() {
        return model.name;
    }
    
    public void updateView() {
        System.out.println( model.getName() );
    }

}