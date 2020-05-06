package base;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Component
public class User {
    private int id;
    @Size(min = 3,max = 20,message = "Your Full Name must between 3 and 20")
    String name;
    @Min(value = 1200,message = "invalid Salary")
    @NotNull
    double salary;
    public String getName() {
        return name;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
