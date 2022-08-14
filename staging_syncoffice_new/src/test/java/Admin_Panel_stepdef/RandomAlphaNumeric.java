package Admin_Panel_stepdef;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class RandomAlphaNumeric
{
	protected static String profile;
	public WebDriver driver;

	private final static String LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private final static char[] alphanumeric = (LETTERS+LETTERS.toUpperCase()+"0123456789").toCharArray();

	public static String generateRandam(int length)
	{
		StringBuilder s = new StringBuilder();
		for(int i =0; i<length;i++)
		{
			s.append(alphanumeric[new Random().nextInt(alphanumeric.length)]);
		}
		return s.toString();
	}

	private final static char[] numeric = ("0123456789").toCharArray();
	public static String numeric(int length)
	{
		StringBuilder s = new StringBuilder();
		for(int i =0; i<length;i++)
		{
			s.append(numeric[new Random().nextInt(numeric.length)]);
		}
		return s.toString();
	}

	private final static String alphabets = "abcdefghijklmnopqrstuvwxyz";
	private final static char[] alpha = alphabets.toUpperCase().toCharArray();

	public static String alpha(int length)
	{
		StringBuilder s = new StringBuilder();
		for(int i =0; i<length;i++)
		{
			s.append(alpha[new Random().nextInt(alpha.length)]);
		}
		return s.toString();}
}

