package Library_project;

	import java.util.*;
	import java.util.Iterator;

	public class Library_class 
	{
		
		private int libraryId;
		private String location;
		private Book b;
		
		private ArrayList<Book> book=new ArrayList<Book>();
		
		//add books.......
		public void addBook(Book b)
		{
			book.add(b);
			System.out.println("Book Added Successfully.........");
		}
		
		//DisplayBooks.....
		public void displayBook() 
		{
			if(book.isEmpty()) 
			{
				System.out.println("Books are not added present now......");
			}
			else 
			{
				for(Book b:book) 
				{
					b.display();
				}
			}
		}
		
		//search book based on id
		public void searchBookBasedOnId(int id)
		{
			boolean isAvailable=false;
			if(book.isEmpty()) 
			{
				System.out.println("Books are not added present now......");
			}
			else 
			{
				for(Book b : book) 
				{
					if(b.getId()==id) 
					{
						System.out.println("book is founded......"+b.getId());
						isAvailable=true;
					}
				}
			}
			if(isAvailable==false) 
			{
				IdMatchMissException e=new IdMatchMissException();
				throw e;
			}
		}
		
		//search book based on Author
		public void searchBookBasedOnAuthor(String author)
		{
			boolean isAvailable=false;
			if(book.isEmpty()) 
			{
				System.out.println("Books are not added present now......");
			}
			else
			{
				for(Book b:book) 
				{
					if(b.getAuthor().equals(author))
					{
						System.out.println("Book is found..."+b.getTitle());
						isAvailable=true;
					}
				}
			}
			if(isAvailable==false)
			{
				AuthorMissMatchException e=new AuthorMissMatchException();
				throw e;
			}
			
		}
		
		//update book cost
		public void updateBookBasedonTitle(String title) 
		{
			boolean isAvailable=false;
			if(book.isEmpty()) 
			{
				System.out.println("books are not present now...........");
			}
			else 
			{
				for(Book b:book)
				{
					if(b.getTitle().equals(title)) 
					{
						System.out.println("book cost is updated successfully...........");
						isAvailable=true;
					}
				}
			}
			if(isAvailable==false)
			{
				TitleMissMatchException e2=new TitleMissMatchException();
				throw e2;
			}
		}
		
		//remove book
		
		public void removebook(int id) 
		{
			Iterator<Book> itr=book.iterator();
			boolean isAvailable=false;
			if(book.isEmpty()) 
			{
				System.out.println(" books are not available right now");
			}
			else 
			{
				while(itr.hasNext())
				{
					Book b=itr.next();
					if(b.getId()==id)
					{
						itr.remove();
						System.out.println("book is removed...........");
						isAvailable=true;
					}
				}
			}
			if(isAvailable==false)
			{
				IdMatchMissException e=new IdMatchMissException();
				throw e;
			}
		}

	
}
