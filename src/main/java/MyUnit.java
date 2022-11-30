
public class MyUnit {
	public String concatenate(String one,String two)
	{
		return one+two;
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int subtract(int d , int e)
	{
		return d-e;
	}
	public int divide(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("DIVIDE BY ZERO");
		}
		else
		{
			return a/b;
		}
	}
	public String getName(String name)
	{
		int counter =0;
		
		if(name!="" && name!=null)
		{
			for(int i = 0;i<name.length();i++)
			{
				if(!((name.charAt(i)>='a' && name.charAt(i)<='z' ) 
						|| (name.charAt(i)>='A' && name.charAt(i)<='Z')))
				{
					counter++;
					break;
				}
			}
		}
		if(counter!=0)
		{
				return "Invalid Name";
		}		
		else
		{
					return name;
		}
	}
	public String getFullName(String fName,String mName,String lName)
	{
		int counter =0;
		String fullName = fName+mName+lName;
		for(int i =0;i<fullName.length();i++)
		{
			if(!((fullName.charAt(i)>='a' && fullName.charAt(i)<='z' ) 
						|| (fullName.charAt(i)>='A' && fullName.charAt(i)<='Z')))
			{
				counter++;
				break;
			}
		}
		if(counter!=0)
		{
			return "INVALID NAME";
		}
		else
		{
			if(fullName.length()==0)
				return "EMPTY NAME";
			else if(fName.length()==0)
				return "FIRST NAME MISSING";
			else
				return fName+" "+mName+" "+lName;
		}
	}		
}