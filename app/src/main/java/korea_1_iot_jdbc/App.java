/*
 * This source file was generated by the Gradle 'init' task
 */
package korea_1_iot_jdbc;

import korea_1_iot_jdbc.main.UserManager;

public class App {
    public static void main(String[] args) {
       UserManager userManager = new UserManager();
       try {
          userManager.run();
       }catch(Exception e) {
          e.printStackTrace();
       }
    }

}