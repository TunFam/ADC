/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

package lab_8_1;

import java.util.Scanner;

/**
 *
 * @author Bui Nhu
 */
public class Nguoi {
    String name, job;
    int age, year;
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        name=sc.nextLine();
        System.out.println("Nhap tuoi:");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam sinh:");
        year=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap cong viec:");
        job=sc.nextLine();
    }
    public void output(){
        System.out.println("Name:"+ name+"\nAge:"+ age+"\nYear:"+ year+"\nJob:"+ job);
    }

}
