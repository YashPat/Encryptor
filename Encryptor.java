import javax.swing.JOptionPane;					
import java.util.Scanner;								
import java.util.Random;
import java.awt.*;								
import java.applet.*;								
import java.awt.event.*;								
import java.io.*;   //for files						
import java.net.*;
import javax.sound.midi.*;
import java.util.Vector;
//import jmidi.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.String.*;
import java.util.InputMismatchException;
import java.text.*;
import java.util.Date;

public class Encryptor
{
	static boolean again = true;
	static Scanner scan = new Scanner(in);
	static String a = "z0";
	static String b = "k";
	static String c = "eI";
	static int d = 1;
	static String e = "r";
	static String f = "w";
	static int g = 3;
	static int h = 6;
	static int i = 4;
	static String period = "Q";
	static String j = "n";
	static String k = "xB";
	static String l = "b";
	static String m = "y";
	static String n = "p";
	static int o = 7;
	static String p = "v";
	static String q = "t";
    static String r = "sA";
    static int s = 5;
    static String t = "n";
    static String u = "q";
    static int v = 8;
    static String w = "lP";
    static String x = "n";
    static String space = "Io";
    static int y = 9;
    static int z = 2;
    static String message;
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null,"Welcome to Encryption","Encryption",JOptionPane.INFORMATION_MESSAGE);
		out.print("Enter the message you would like to encrypt: ");
        String message = getMessage();
        out.println(message);
		int length = message.length();
		for (int x = 0; x<length; x++)
		{
	    char s = message.charAt(x);
	    if (s == 'a')
	    {
	    	out.print(a);
	    	if (x != length-1)
	    		out.print("-");
	    }
	    if (s == '.')
	    {
	    	out.print(period);
	    	if (x != length-1)
	    		out.print("-");
	    }
	    if (s == 'b')
	    {
	    	out.print(b);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'c')
	    {
	    	out.print(c);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'd')
	    {
	    	out.print(d);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'e')
	    {
	    	out.print(e);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'f')
	    {
	    	out.print(f);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'g')
	    {
	    	out.print(g);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'h')
	    {
	    	out.print(h);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'i')
	    {
	    	out.print(i);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'j')
	    {
	    	out.print(j);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'k')
	    {
	    	out.print(k);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == ' ')
	    {
	    	out.print(space);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'l')
	    {
	    	out.print(l);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'm')
	    {
	    	out.print(m);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'n')
	    {
	    	out.print(n);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'o')
	    {
	    	out.print(o);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'p')
	    {
	    	out.print(p);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'q')
	    {
	    	out.print(q);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'r')
	    {
	    	out.print(r);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 's')
	    {
	    	out.print(s);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 't')
	    {
	    	out.print(t);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'u')
	    {
	    	out.print(u);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'v')
	    {
	    	out.print(v);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'w')
	    {
	    	out.print(w);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'x')
	    {
	    	out.print(x);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'y')
	    {
	    	out.print(y);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'z')
	    {
	    	out.print(z);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'A')
	    {
	    	out.print(a);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'B')
	    {
	    	out.print(b);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'C')
	    {
	    	out.print(c);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'D')
	    {
	    	out.print(d);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'E')
	    {
	    	out.print(e);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'F')
	    {
	    	out.print(f);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'G')
	    {
	    	out.print(g);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'H')
	    {
	    	out.print(h);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'I')
	    {
	    	out.print(i);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'J')
	    {
	    	out.print(j);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'K')
	    {
	    	out.print(k);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'L')
	    {
	    	out.print(l);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'M')
	    {
	    	out.print(m);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'N')
	    {
	    	out.print(n);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'O')
	    {
	    	out.print(o);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'P')
	    {
	    	out.print(p);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'Q')
	    {
	    	out.print(q);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'R')
	    {
	    	out.print(r);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'S')
	    {
	    	out.print(s);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'T')
	    {
	    	out.print(t);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'U')
	    {
	    	out.print(u);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'V')
	    {
	    	out.print(v);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'W')
	    {
	    	out.print(w);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'X')
	    {
	    	out.print(x);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'Y')
	    {
	    	out.print(y);
	    	if (x != length-1)
	    	out.print("-");
	    }
	    if (s == 'Z')
	    {
	    	out.print(z);
	    	if (x != length-1)
	    	out.print("-");
	    }

	    	
	 }

	 out.println();
}
	 public static String getMessage()
	 {
	 	out.print("Enter the message you would like to encrypt: ");
	 	do
	 	{
	 	try
	 	{
	 		return scan.nextLine();
	 	}
	 	catch (InputMismatchException e)
	 	{
	 		String k = "Error: No integers allowed";
	 		return k;
	 	}
		} while (again == true);
	}	
	
}		