package Practies;

public class Split {
	

	public static void main(String[] args) {
		
		String s = "java,maven,selenium,git";
		String arr[] = s.split(",");
		for(int i=0;i<s.length();i++)
		{
			System.out.println(arr[i]);
		}
	}
}
