
package example;

import org.apache.commons.lang.WordUtils;
import java.util.*;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Arrays;

import java.util.regex.Pattern;
import java.util.regex.Matcher;





public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() + " : " + WordUtils.capitalizeFully(message));
        int monmax = 0;
        String nb;
        int temp;
        try {
        	CSVReader reader = new CSVReader(new FileReader("data.csv"));
	        List<String[]> myEntries = reader.readAll();
	        String[] test;
	       	//parcourt
	       	for (int i  = 0; i<myEntries.size(); i++)
	       	{
	       		test=myEntries.get(i);
	       		nb=test[0];
	       		temp=Integer.parseInt(nb);
	       		System.out.println("Nombre lu :" + temp) ;
	       		if (temp>monmax)
	       		{
	       			monmax=temp;
	       		}
	       	}
	       	System.out.println("Max :" + monmax);
	     } catch(IOException e) {
        	e.printStackTrace();
        }
    }
}
        