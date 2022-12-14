// User.java

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public User() {
        this.name = "default";
        this.dob = LocalDate.now();
    }

    public User(String n, int y, int m, int d) {
        this.name = n;
        this.dob = LocalDate.of(y, m, d);
    }

    public LocalDate birth(){
        return this.dob;
    }

    public void doSomething() {
        System.out.println("Hello "+this.name+" who was born on "+this.dob+"!");
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public void setDob(int y, int m, int d){
        this.dob = LocalDate.of(y, m, d);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }
}
