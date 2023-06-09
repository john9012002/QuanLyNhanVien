public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new EmployeeExperience();
        e1.ID = 1;
        e1.FullName = "John Smith";
        e1.BirthDay = "1980-01-01";
        e1.Phone = "0123456789";
        e1.Email = "john.smith@example.com";
        e1.Employee_type = 0;
        e1.Employee_count = 1;
        ((EmployeeExperience) e1).ExpInYear = 5;
        ((EmployeeExperience) e1).ProSkill = "Java";

        Employee e2 = new EmployeeFresher();
        e2.ID = 2;
        e2.FullName = "Jane Doe";
        e2.BirthDay = "1990-02-02";
        e2.Phone = "0987654321";
        e2.Email = "jane.doe@example.com";
        e2.Employee_type = 1;
        e2.Employee_count = 2;
        ((EmployeeFresher) e2).Graduation_date = "2020-06-30";
        ((EmployeeFresher) e2).Graduation_rank = "Excellent";
        ((EmployeeFresher) e2).Education = "University of California";

        Employee e3 = new EmployeeIntern();
        e3.ID = 3;
        e3.FullName = "Peter Parker";
        e3.BirthDay = "2000-03-03";
        e3.Phone = "0123456789";
        e3.Email = "peter.parker@example.com";
        e3.Employee_type = 2;
        e3.Employee_count = 3;
        ((EmployeeIntern) e3).Majors = "Computer science";
        ((EmployeeIntern) e3).Semester = 6;
        ((EmployeeIntern) e3).University_name = "Harvard University";

        e1.AddCertificate(1, "Java SE 8", "Oracle Certified Professional", "2019-01-01");
        e2.AddCertificate(2, "CCNA", "Cisco Certified Network Associate", "2020-01-01");
        e3.AddCertificate(3, "Android", "Google Certified Developer", "2021-01-01");

        e1.ShowInfo();
        e2.ShowInfo();
        e3.ShowInfo();
    }
}
