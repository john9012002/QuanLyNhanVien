public class EmployeeFresher extends Employee {
    protected String Graduation_date;
    protected String Graduation_rank;
    protected String Education;

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Graduation date: " + Graduation_date);
        System.out.println("Graduation rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }
}
