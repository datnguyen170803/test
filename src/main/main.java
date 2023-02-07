package main;

import java.security.PublicKey;
import java.util.ArrayList;
import entity.codex;
import entity.sinhvien;
import entity.sinhvientunhien;
import entity.sinhvienxahoi;

public class main {
	public static void main (String args [] ) {
//		sinhvientunhien sv1 = new sinhvientunhien("Dat", "khoa 1", 10.0,10.0,10.0);
//		sinhvientunhien sv2 = new sinhvientunhien("nam  ", "khoa 2", 9.0,8.0,10.0);
//		System.out.println(">> truong " + sinhvien.Truong );
//		System.out.println( ">> ten " + sv1.getTen() );
//		sinhvientunhien arr[] = new sinhvientunhien[2];
//		arr [0] =sv1;
//		arr [1] = sv2;
//		sinhvientunhien [] arr2 = {sv1,sv2};
//		ArrayList<sinhvientunhien> arrayListSVKTN = new ArrayList<sinhvientunhien>() ;
//		arrayListSVKTN.add(sv1);
//		arrayListSVKTN.add(sv2);
////		System.out.println(">> " + arrayListSVKTN.size());
//		for (sinhvientunhien e : arrayListSVKTN) {
//			e.output();
//		}
		
		sinhvientunhien sv1=new sinhvientunhien("Nam","Khoa Tu Nhien",9.0,5.0,10.0);
		sinhvientunhien sv2=new sinhvientunhien("Sang","Khoa Tu Nhien",9.0,5.0,10.0);
		sinhvientunhien sv3=new sinhvientunhien("Vinh","Khoa Tu Nhien",1.0,5.0,6.0);
		sinhvienxahoi sv4=new sinhvienxahoi("Thang","Khoa Tu Nhien",9.0,5.0,10.0);
		sinhvienxahoi sv5=new sinhvienxahoi("Dat","Khoa Tu Nhien",6.0,6.0,4.0);
		
		ArrayList<sinhvien> Listsinhvien =new ArrayList<>();
		Listsinhvien.add(sv1);
		Listsinhvien.add(sv2);
		Listsinhvien.add(sv3);
		Listsinhvien.add(sv4);
		Listsinhvien.add(sv5);
		 
		
//		System.out.println(">> ");
//		for (sinhvien e : Listsinhvien) {
//			e.output();  
//		}
		
		
		
//		System.out.println("Khoa Tu Nhien");
//		for(sinhvientunhien e : arrListSVKTN) {
//			e.output();
//		}
//		System.out.println(">>Size: "+arrListSVKTN.size());
//		for(sinhvientunhien tb : arrListSVKTN) {
//			tb.TDiemTB();
//		}
		
//		System.out.println("Khoa Tu Xa Hoi");
//		for(sinhvienxahoi e : Listsinhvien) {
//			e.outputXH();
			
//		}
//		System.out.println(">>Size: "+Listsinhvien.size());	
		System.out.println(">>>>"+codex.soPI.getCode());
		
		}
	
}

