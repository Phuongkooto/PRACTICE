/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice10thang10;

import java.util.Scanner;

public class ALO {
    public static void main(String[] args) {
        EMP_LIST emplist = new EMP_LIST();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==Menu==");
            System.out.println("1. Add new fulltime employee ");
            System.out.println("2. Add new parttime employee");
            System.out.println("3. Update employee by id");
            System.out.println("4. Delete employeeby id");
            System.out.println("5. Find employee by id");
     
            
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    EMP_FULLTIME ft= new EMP_FULLTIME() {};
                    ft.Input();
                    emplist.addnew(ft);
                    break;
                case 2:
                    EMP_PARTTIME pt= new EMP_PARTTIME();
                    pt.Input();
                    emplist.addnew(pt);
                    break;
                case 3:
                    
                    System.out.print("Nhap id can update:");
                    String id = sc.nextLine();
                    emplist.update(id);
                    break;
                case 4:
                   
                    System.out.print("Nhap id can xoa:");
                    String iddl = sc.nextLine();
                   
                    emplist.delete(iddl);
                    break;
                case 5:
                   
                    System.out.print("Nhap id can tim:");
                    String idfind = sc.nextLine();
                    emplist.find(idfind);
                    break;
                
                case 0:
                    System.exit(0);
                    break;

            }

        }
    }}