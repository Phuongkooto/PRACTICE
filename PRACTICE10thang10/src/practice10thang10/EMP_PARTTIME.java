/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice10thang10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author anhph
 */
public class EMP_PARTTIME extends EMPLOYEE{
    private int number_of_workdays;

    public EMP_PARTTIME() {
    }

    public EMP_PARTTIME(int number_of_workdays) {
        this.number_of_workdays = number_of_workdays;
    }

    public EMP_PARTTIME(int number_of_workdays, String EmpID, String EmpName, Date EmpDateOfBirth, Date StarDate) {
        super(EmpID, EmpName, EmpDateOfBirth, StarDate);
        this.number_of_workdays = number_of_workdays;
    }

    public int getNumber_of_workdays() {
        return number_of_workdays;
    }

    public void setNumber_of_workdays(int number_of_workdays) {
        this.number_of_workdays = number_of_workdays;
    }
    public void Input(){
        Scanner keyboard = new Scanner(System.in);
         System.out.println("==Enter employee parttime==");
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
        System.out.print("Nhap date start:");
         String datestartstring = keyboard.nextLine();
         
         try {
            Date datestart = sdf.parse(datestartstring);
             setStartDate(datestart);
        } catch (Exception e) {
             System.out.println("Error");
        }
        System.out.println("Nhap workdays:");
        int daywork = keyboard.nextInt();
        setNumber_of_workdays(daywork);
    }
    public void Output(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("EMPLOYEE "+getEmpID() + " "+ getEmpName());
        System.out.println("Date of birth :"+sdf.format(getEmpDateOfBirth()));
        System.out.println("Date start: "+sdf.format(getStartDate()));
        System.out.println("Number of workdays:"+getNumber_of_workdays());
    }

    @Override
    public double CalculateSalary() {
        return 0;
    }

    @Override
    public double CalculateAllowance() {
        return 0;
    }
    
    }