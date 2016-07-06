package com.ais.qtrf.test.e_service;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

import com.qtrf.core.DriverManager;

public class TestRunner 
{		
	  public static void main(String... args)// throws ClassNotFoundException 
	  {
//	        String[] classAndMethod = args[0].split("#");
//	        Request request = Request.method(Class.forName(classAndMethod[0]),
//	                classAndMethod[1]);

//	        Result result = new JUnitCore().run(request);
	        
//	        Result result = new JUnitCore().run(Test1.class);
//	        System.exit(result.wasSuccessful() ? 0 : 1);
	        
	        JUnitCore core = new JUnitCore(); 
//			core.run(TestLogin.class);
			
			core.run(TestLogin.class);
		  
//		  	System.out.println("Hellooooo");		
	   }
}  	