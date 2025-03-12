package my.app.task3;

public class Task3 {
    private final HighSalaryChecker highSalaryChecker = new HighSalaryChecker();

    public void execute() {
        highSalaryChecker.check(EmployeeListGenerator.generateList());
    }
}