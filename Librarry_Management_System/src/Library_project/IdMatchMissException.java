package Library_project;

	public class IdMatchMissException extends RuntimeException
	{
		public String toString() 
		{
			return getClass()+"id should be even number";
		}
	}

