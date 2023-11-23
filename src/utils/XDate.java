/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class XDate 
{
    static SimpleDateFormat fomater = new SimpleDateFormat();
    public static Date toDate(String date, String pattern)
    {
        try 
        {
            fomater.applyPattern(pattern);
            return fomater.parse(date);
        } 
        catch (ParseException pe) 
        {
            throw new RuntimeException(pe);
        }
    }
            
    public static String toString(String date, String pattern)
    {
        fomater.applyPattern(pattern);
        return fomater.format(date);
    }
    
    public static Date addDays(Date date, long days)
    {
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}
