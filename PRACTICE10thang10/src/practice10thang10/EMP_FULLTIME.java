
package practice10thang10;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class EMP_FULLTIME extends EMPLOYEE {
    private double coefficients_salary;

    public EMP_FULLTIME() {
    }

    public EMP_FULLTIME(double coefficients_salary) {
        this.coefficients_salary = coefficients_salary;
    }

    public EMP_FULLTIME(double coefficients_salary, String EmpID, String EmpName, Date EmpDateOfBirth, Date StarDate) {
        super(EmpID, EmpName, EmpDateOfBirth, StarDate);
        this.coefficients_salary = coefficients_salary;
    }

    public double getCoefficients_salary() {
        return coefficients_salary;
    }

    public void setCoefficients_salary(double coefficients_salary) {
        this.coefficients_salary = coefficients_salary;
    }

    public void Input(){
        Scanner keyboard = new Scanner(System.in);
         System.out.println("==Enter employee fulltime==");
         System.out.print("Nhap id:");
         String id = keyboard.nextLine();
         setEmpID(id);
         System.out.print("Nhap name:");
         String name = keyboard.nextLine();
         setEmpName(name);
         System.out.print("Nhap date of birth:");
         String dateofbirthstring = keyboard.nextLine();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         try {
            Date dateofbirth = sdf.parse(dateofbirthstring);
             setEmpDateOfBirth(dateofbirth);
        } catch (Exception e) {
             System.out.println("Nhap loi ngay thang dang dd/MM/yyyy");
        }
        System.out.print("Enter date start:");
         String datestartstring = keyboard.nextLine();
         
         try {
            Date datestart = sdf.parse(datestartstring);
             setStartDate(datestart);
        } catch (Exception e) {
             System.out.println("Error");
        }
        System.out.println("Enter coefficients salary:");
        double cf = keyboard.nextDouble();
        setCoefficients_salary(cf);
    }
    public void Output(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Employee "+getEmpID() + " "+ getEmpName());
        System.out.println("Date of birth :"+sdf.format(getEmpDateOfBirth()));
        System.out.println("Date start: "+sdf.format(getStartDate()));
        System.out.println("Coefficients salary:"+getCoefficients_salary());
    }
    @Override
    public double CalculateSalary() {
         return BASIC_SALARY*getCoefficients_salary()+CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        return 0;
    }
    
    
}