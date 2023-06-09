public class EmployeeIntern extends Employee {
    protected String Majors;
    protected int Semester;
    protected String University_name;

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Majors: " + Majors);
        System.out.println("Semester: " + Semester);
        System.out.println("University name: " + University_name);
    }
}
