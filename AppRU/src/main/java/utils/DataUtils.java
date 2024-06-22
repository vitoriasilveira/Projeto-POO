/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author elisa
 */
public class DataUtils {

    private DataUtils() {
    }
    
    public static String dataFormat(Date data){
        String sdata;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdata = df.format(data);
        return sdata;
    }
    
}
