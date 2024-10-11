 
package practice10thang10;

import java.util.Date;

 
public abstract class EMPLOYEE implements IEMPLOYEE {
    String EmpID;
    String EmpName;
    Date EmpDateOfBirth;
    Date StartDate;

    public EMPLOYEE(String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpDateOfBirth = EmpDateOfBirth;
        this.StartDate = StartDate;
    }

    public EMPLOYEE() {
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date EmpDateOfBirth) {
        this.EmpDateOfBirth = EmpDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }
     public void Input() {

    }

    public void Output() {

    }

    int CalculateSeniority() {
        return 0;
    }
    public abstract double CalculateSalary();
    public abstract double CalculateAllowance();

}
    
    
