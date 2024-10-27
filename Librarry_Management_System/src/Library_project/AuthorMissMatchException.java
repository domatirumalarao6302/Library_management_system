package Library_project;


		public class AuthorMissMatchException extends RuntimeException
		{
			public String toString() {
				return getClass()+" Author should be james|| alean || scott";
			}
			
		}

