/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Format;

import java.text.DecimalFormat;

/**
 *
 * @author mochr
 */
public class DecimalFormatDemoLengkap{
   static public void customFormat(String pattern, double value ) {
	DecimalFormat myFormatter = new DecimalFormat(pattern);
	String output = myFormatter.format(value);
	System.out.println(value + " " + pattern + " " + output); 
   }

   static public void main(String[] args) {
	customFormat("###,###.###", 123456.789);
	customFormat("###.##", 123456.789);
	customFormat("000000.000", 123.78);
	customFormat("$###,###.###", 12345.67); 
   }
} 

