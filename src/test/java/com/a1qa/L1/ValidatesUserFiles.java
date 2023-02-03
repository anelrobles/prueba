package com.a1qa.L1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;


public class ValidatesUserFiles {
	
  @BeforeClass
  public void beforeClass() {
	  
  }
	 
  @DataProvider 
	  /*public Object[][] jsonAdmin(){
	  JSONParser parser = new JSONParser();
	  JSONObject jsonObject = null;
	  
	  try {
		  Object obj = parser.parse(new FileReader(fileName "/a1qa/Files/Json/admin_users.json"));
		  jsonObject = (JSONObject) obj;
	  } catch (IDException | ParseException exception) {
		  
	  }
	  
		  
  }*/
	  
	  
  @Test
  public void f() {
  }
  

  @AfterClass
  public void afterClass() {
  }

 

}
