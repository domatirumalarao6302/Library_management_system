package Library_project;


	public class CostMissMatchException extends RuntimeException
	{
		public String toString() 
		{
			return getClass()+"cost should be between 500-3000";
		}
		
	}


