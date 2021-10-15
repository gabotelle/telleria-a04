package baseline;
//    Employee:
//        -firstname
//        -lastName
//        -salary
public record Employee(String firstName, String lastName, String salary){

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalary() {
        return salary;
    }

}
