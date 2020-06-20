package org.chrimson.me.messenger.service;
import java.util.Scanner;



 class GetInfo {
	public static String InspectorRoll;

    public static Scanner in = new Scanner(System.in);  //Scanner//

    /////////methode /////////
    void ResponseReq() {
    	System.out.println("\n ========================================\n");
    	
    }
	
	//////////////// Main /////////////////
	public void main(String[] args) {
		Msg();
	  MsgId();
	  Author();
	 
  
	  }
	
 ////////////////////////////////////////
	
	



	
	// Msg Method //
	String Msg () {
		System.out.println("\n ================================================\n");
		System.out.println(" Plaese Enter the Message: ");
		
		String msg = in.nextLine();
		return msg;
	}
	
	// data method //
	long MsgId () {
		System.out.println("\n ================================================\n");
	
		//in.next();
		System.out.println("\n Plaese Enter the ID: ");
        int id = in.nextInt();
        return id;
	}
	
	// status method //
	 String Author () {
		System.out.println("\n ================================================\n");
		System.out.println(" Plaese Enter the user Name: ");
		String author = in.next();
		return author;
	}
	
}

///////////////////////////////////////////////





