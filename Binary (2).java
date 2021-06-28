import java.util.*;
class Binary
{
	static String decimalToBinary(int decimalValue)
	{
		if(decimalValue==0)
		  return "";
		return decimalToBinary(decimalValue/2)+decimalValue%2;
	}

	public static void main(String args[])
	{
		String binaryValue="0";
		try
		{
			System.out.print("\nDecimal Value is ");
			int decimalValue=(new Scanner(System.in)).nextInt();
			if(decimalValue<0) throw(new RuntimeException());
			if(decimalValue>0) binaryValue=decimalToBinary(decimalValue);
			System.out.println("\nBinary Value is "+binaryValue);
		}
		catch(RuntimeException i)
		{
			System.out.println("error: only positive integers are accepted");
		}
	}
}