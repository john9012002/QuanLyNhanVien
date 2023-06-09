import java.util.ArrayList;
import java.util.List;

public class Employee{
    protected int ID;
    protected String FullName;
    protected String BirthDay;
    protected String Phone;
    protected String Email;
    protected int Employee_type;
    protected int Employee_count;
    protected List<Certificate> CertificateList;

    public Employee() {
        CertificateList = new ArrayList<>();
    }

    public void ShowInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Full name: " + FullName);
        System.out.println("Birthday: " + BirthDay);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee type: " + Employee_type);
        System.out.println("Employee count: " + Employee_count);

        for (Certificate cert : CertificateList) {
            System.out.println("Certificate ID: " + cert.CertificatedID);
            System.out.println("Certificate name: " + cert.CertificateName);
            System.out.println("Certificate rank: " + cert.CertificateRank);
            System.out.println("Certificate date: " + cert.CertificatedDate);
        }
    }

    public void AddCertificate(int certID, String certName, String certRank, String certDate) {
        CertificateList.add(new Certificate(certID, certName, certRank, certDate));
    }

    static class Certificate {
        int CertificatedID;
        String CertificateName;
        String CertificateRank;
        String CertificatedDate;

        public Certificate(int id, String name, String rank, String date) {
            CertificatedID = id;
            CertificateName = name;
            CertificateRank = rank;
            CertificatedDate = date;
        }
    }
}