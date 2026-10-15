package Testng_programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Annotations {
//testcase1
	@Test
	public void test1() {
		System.out.println("Testcase 1");
	}//testcaes 2
	@Test
	public void test2() {
		System.out.println("Testcase 2");
	}
	@BeforeMethod
	public void beforemethod(){
	System.out.println("Before Method");	
	}
	@AfterMethod
	public void AfterMethod () {
		System.out.println("Ater Method");
	}
	@BeforeClass
	public void Beforeclass () {
		System.out.println("Before Class");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After Class");
	}
	@BeforeTest
	public void Beforetest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("Ater Test");
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite(){
	System.out.println("After Suite");	
	}
}
