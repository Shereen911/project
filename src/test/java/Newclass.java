import APPauth.Login;
import APPauth.Logout;
import clientManagement.Addclient;
import clientManagement.Clientaction;
import clientManagement.Searchclient;
import org.openqa.selenium.By;

import org.testng.annotations.*;


import static APPauth.Login.driver;

public class Newclass {

         @BeforeMethod
                 public static void login()
         {

               Login.loginApp();
}


  @Test (priority = 1)
          public static void entervaliddata1()

  {
      Addclient.addClient("Tarek");
      Searchclient.searchClient();
      Clientaction.clientAction( "shereen");
      Searchclient.searchClient();
  }
  @Test (priority = 2 )
    public static void entervaliddata2()
  {
      Addclient.addClient("Mohammed");
      Searchclient.searchClient();
      Clientaction.clientAction( "Nada");
      Searchclient.searchClient();
  }
  @DataProvider
  public String[][]  test_data()
  {
      return new String [][] // return table
              {
                  //username password
                      { "Tarek"," Shereen"}

  }
           @AfterMethod
     public static void Logout()
           {
               Logout.logoutApp();
           }

}
