package OOP.Encapsulation.GetterSetterExample;

public class Student {
    private String registrationNumber;
    private String name;
    private String branch;
    private int age;

    public void setRegistrationNumber(String rN, String role) {
        if(role.equalsIgnoreCase("admin")) {
            registrationNumber = rN;
        }
    }

    public String getRegistrationNumber(String role) {
        if(role.equalsIgnoreCase("admin")) {
            return registrationNumber;
        }
        return null;
    }
}
