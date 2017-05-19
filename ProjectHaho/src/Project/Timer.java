/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Timestamp;
import java.util.Date;

public class Timer {
    public static Date getDate(){
        Date timeDate = new Date();
      return timeDate;
    }
    public static Timestamp getTimeStamp(){
        Date timedate = new Date();
        Timestamp tm = new Timestamp(timedate.getTime());
        return tm;
    }
   
}
