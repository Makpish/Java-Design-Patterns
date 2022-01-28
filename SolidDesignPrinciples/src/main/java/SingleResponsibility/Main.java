package SingleResponsibility;

interface IEmployeeStore {
    Object getEmployeeById(Long id);

    void addEmployee(Object employee);
}

interface IEmailSender {
    void sendEmail(Object employee, IEmailContent content);
}

interface IEmailContent {

}

public class Main {

}

class EmployeeStore implements IEmployeeStore {
    //inject in runtime
    private IEmailSender emailSender;

    @Override
    public Object getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Object employee) {
    }
}

class EmailSender implements IEmailSender {
    @Override
    public void sendEmail(Object employee, IEmailContent content) {
        //logic
    }
}

class EmailContent implements IEmailContent {
    private String type;
    private String content;
}