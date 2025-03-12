package my.app.task3;

/**
 * Класс сотрудника
 */
public class Employee {

    private String fullName;
    private Integer age;
    private String department;
    private Double salary;


    public Employee(String fullName, Integer age, String department, Double salary) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Возвращает возраст сотрудника
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Устанавливает возраст сотрудника
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Возвращает имя сотрудника
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Устанавливает имя сотрудника
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Возвращает отдел сотрудника
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Устанавливает отдел сотрудника
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Возвращает зарплату сотрудника
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * Устанавливает зарплату сотрудника
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "fullName= '" + fullName + '\'' +
                ", age= " + age +
                ", department= '" + department + '\'' +
                ", salary= " + salary;
    }
}