/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice10thang10;

import java.util.ArrayList;


public class EMP_LIST {
    private ArrayList <EMPLOYEE> employeeist;

    public EMP_LIST(ArrayList<EMPLOYEE> employeeist) {
        this.employeeist = employeeist;
    }
    public EMP_LIST()
    {
        this.employeeist=new ArrayList<>();
    }
    public void addnew(EMPLOYEE emp){
        employeeist.add(emp);
    }
    public void update(String id)
    {
        for(EMPLOYEE emp: employeeist)
        {
            if(emp.getEmpID().equals(id))
            {
                emp.Input();
            }
        }
    }
    public void find(String id)
    {
        for(EMPLOYEE emp:employeeist)
        {
            if(emp.getEmpID().equals(id))
            {
                emp.Output();
            }
        }
    }
    public void delete(String id )
    {
        employeeist.removeIf(Employee->Employee.getEmpID().equals(id));
        System.out.println("Deleted");
    }
}