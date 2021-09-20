import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String username, password;
        Scanner scaner = new Scanner(System.in);
        System.out.print("Username:");
        username = scaner.nextLine();
        System.out.print("Password:");
        password = scaner.nextLine();
        if(username.equals("HuyHoang") && password.equals("2021"))

	    
	    { System.out.println("Nhap Dung Username va Password");}
	    else 
	    	{System.out.println("Nhap Sai Username or Password");
	    	}
	    
	    
	    
	    
	}
	}

