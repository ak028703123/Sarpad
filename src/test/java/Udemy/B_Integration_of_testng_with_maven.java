package Udemy;

public class B_Integration_of_testng_with_maven {

	
	//1)trigger TestNG xml files from maven - copy the plugin config from  mvn surefire//using testng//Using Suite XML Files into pom
	//https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html
	
	
	
	/*
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile> // edit the xml file name here.
          </suiteXmlFiles>
        </configuration>
      */
	
	
	//2)running a single test: 
	
	//https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html
	
	//mvn -Dtest=TestCircle test
	//eg: mvn -Dtest=appiumTest test
	
}
