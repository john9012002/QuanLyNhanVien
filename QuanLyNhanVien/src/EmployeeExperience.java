public class EmployeeExperience extends Employee {
    protected int ExpInYear;
    protected String ProSkill;

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Experience in year: " + ExpInYear);
        System.out.println("Professional skill: " + ProSkill);
    }
}
