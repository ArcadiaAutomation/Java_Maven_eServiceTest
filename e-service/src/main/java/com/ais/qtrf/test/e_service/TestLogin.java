package com.ais.qtrf.test.e_service;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.qtrf.core.Config;
import com.qtrf.core.Environment;
import com.qtrf.core.Executor;
import com.qtrf.core.LogManager;
import com.qtrf.core.TestCase;

public class TestLogin {
	
	@Before
	public void setUp() {
		
		LogManager.generateLog("xx","yy","zz");
		
		//Environment.setValue("testCasePath","D:\\TestCase.xlsx");
		Environment.setValue("configPath","D:\\Config.xlsx");
		Environment.setValue("testCaseSheet","InputData");
		Environment.setValue("configSheet","InputData");
		Environment.setValue("iterationSheet","Iteration");
		Environment.setValue("appiumDir","C:\\Program Files (x86)\\Appium\\node_modules");
		Environment.setValue("LogDir","D:\\ReportLog.html");
		
		//TestCase.readTestCase(Environment.getValue("testCasePath"),Environment.getValue("testCaseSheet"));
//		Config.readConfig(Environment.getValue("configPath"),Environment.getValue("configSheet"));
//		
//		if (Iteration.isIteration(Environment.getValue("testCasePath"),Environment.getValue("iterationSheet")))
//		{
//			Iteration.readIteration(Environment.getValue("testCasePath"),Environment.getValue("iterationSheet"));
//		}	
					
	}
	
	@Test
	public void test_S01_001_success()
	{
		// override test case path
		Environment.setValue("testCasePath","D:\\eServiceWeb\\Login\\S01_001-TestCase.xlsx");
		TestCase.readTestCase(Environment.getValue("testCasePath"),Environment.getValue("testCaseSheet"));
		Config.readConfig(Environment.getValue("configPath"),Environment.getValue("configSheet"));
		
		Executor.run();
	}
	
	@Test
	public void test_S01_002_success()
	{
		// override test case path
		Environment.setValue("testCasePath","D:\\eServiceWeb\\Login\\S01-002-Login.xlsx");
		TestCase.readTestCase(Environment.getValue("testCasePath"),Environment.getValue("testCaseSheet"));
		Config.readConfig(Environment.getValue("configPath"),Environment.getValue("configSheet"));
		
		Executor.run();
	}
	
	
	@AfterClass
	public static void report()
	{
		LogManager.closeLog();
		LogManager.generateHTML();	
		try {
			Runtime.getRuntime().exec("cmd.exe /c "+Environment.getValue("LogDir"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
