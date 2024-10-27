package Library_project;

	 public class TitleMissMatchException extends RuntimeException
		{
			public String toString() 
			{
				return getClass()+"title should be java || sql || python";
			}
		}


