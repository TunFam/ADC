/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doc_ghi_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class nhan_vien extends person implements Serializable  {
    public String phongban;
    public float luong,heso,lcb;
    public int thamnien;

    public nhan_vien(String name, String que, String gioitinh, int namsinh, String phongban, float luong, float heso, float lcb, int thamnien) {
        super(name, gioitinh, que, namsinh);
        this.phongban = phongban;
        this.luong = luong;
        this.heso = heso;
        this.lcb = lcb;
        this.thamnien = thamnien;
    }

    

    public nhan_vien() {
    }
//    private void nhap(){
//        Scanner sc = new Scanner(System.in);
//    
//    
//        System.out.println("ho ten : ");
//        name = sc.nextLine();
//        System.out.println("que : ");
//         que = sc.nextLine();
//        System.out.println("gioi tinh  : "+gioitinh);
//        System.out.println("nam sinh : "+namsinh);
//        System.out.println("phong ban : "+phongban);
//        System.out.println("luong co ban : "+luong);
//        System.out.println("he so luong : "+heso);
//        System.out.println("tham nien : "+lcb);
//        System.out.println("luong thuc linh : "+thamnien);
//    }
    
    private void xuat(){
        System.out.println("ho ten : "+name);
        System.out.println("que : "+que);
        System.out.println("gioi tinh  : "+gioitinh);
        System.out.println("nam sinh : "+namsinh);
        System.out.println("phong ban : "+phongban);
        System.out.println("luong co ban : "+luong);
        System.out.println("he so luong : "+heso);
        System.out.println("tham nien : "+lcb);
        System.out.println("luong thuc linh : "+thamnien);
    }

    public float getHeso() {
        return heso;
    }

    public void setHeso(float heso) {
        this.heso = heso;
    }

    public float getLcb() {
        return lcb;
    }

    public void setLcb(float lcb) {
        this.lcb = lcb;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    @Override
    public String toString() {
        return name+"$"+namsinh+"$"+gioitinh+"$"+que+"$"+lcb+"$"+thamnien+"$"+heso+"$"+luong;
    }

    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        ArrayList<nhan_vien>  arr = new ArrayList<nhan_vien>();
//        int n ;
//        Scanner sc = new Scanner(System.in);          
        nhan_vien nv = null;
//        System.out.println("nhap n:");
//        n = sc.nextInt();
//        for(int i =0; i<n ; i++){
//            nv= new nhan_vien();
//            nv.nhap();
//            arr.add(nv);
//        }
//
//        try {
//            FileWriter fw = new FileWriter("data.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            for(nhan_vien v1:arr){
//                bw.write(v1.toString());
//                bw.newLine();
//                
//            }
//            bw.close();
//            fw.close();
        
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        while(s!=null){
            String [] a = s.split("\\$");
            nv = new nhan_vien(a[0], a[1], a[2], Integer.parseInt(a[3]), a[4], Float.parseFloat(a[5]), Float.parseFloat(a[6]), Float.parseFloat(a[7]), Integer.parseInt(a[8]));
            arr.add(nv);
            s= br.readLine();
        }
        br.close();
        JFrame j = new JFrame("bang dl");
        j.setSize(600, 600);
        JTable table = new JTable();
        String [] colum = {"ho ten","gioi tinh","que","ngay sinh"};
         String[][] data=new String[6][4];
        for(int  i= 0; i<arr.size();i++){
       
        data[i][0]=arr.get(i).name;
        data[i][1]=arr.get(i).gioitinh;
        data[i][2]=arr.get(i).que;
        data[i][3]=arr.get(i).namsinh+"";
        }
        DefaultTableModel de = new DefaultTableModel(data, colum);
        JTable jt = new JTable(de);
        JScrollPane js = new JScrollPane(jt);
        j.add(js);
        j.setVisible(true);
        fr.close();
        for(nhan_vien b: arr){
            b.xuat();
        }
    
//        ArrayList<nhan_vien> arr = new ArrayList<nhan_vien>();
//        int n ;
//        Scanner sc = new Scanner(System.in);          
//        nhan_vien nv = null;
//        System.out.println("nhap n:");
//        n = sc.nextInt();
//        for(int i =0; i<n ; i++){
//            nv= new nhan_vien();
//            nv.nhap();
//            arr.add(nv);
//        }
//
//        try {
//            FileWriter fw = new FileWriter("data.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            for(nhan_vien v1:arr){
//                bw.write(v1.toString());
//                bw.newLine();
//                
//            }
//            bw.close();
//            fw.close();
//            FileReader fr = new FileReader("data.txt");
//            BufferedReader br = new BufferedReader(fr);
//            String [] list = new String[50];
//            
//            for(nhan_vien a : arr){
//                
//            String t = br.readLine();
//           while(t != null){
//               
//                   list=t.split("\\$");   
//           }
//            String name = list[0];
//            int namsinh = Integer.valueOf(list[1]);
//            String gioitinh= list[2];
//            String que = list[3];
//            float luong = Float.parseFloat(list[4]);
//            float thamnien = Float.parseFloat(list[5]);
//            float heso = Float.parseFloat(list[6]);
//            
//            nhan_vien nv1 = new nhan_vien(name, que, namsinh, gioitinh, gioitinh, luong, heso, heso, namsinh);
//             nv1.xuat();
//             br.close();
//             fr.close();
//            }
//        } catch (Exception e) {
//        } 
//    }     
    }
}
