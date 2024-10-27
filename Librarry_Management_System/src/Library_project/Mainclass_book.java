package Library_project;

import java.util.Scanner;

public class Mainclass_book 
{
	public static void main(String[] args) 
	{
		String title;
		int id;
		int cost;
		int noofpages;
		String author;
		Library_class l=new Library_class();
		Scanner scan=new Scanner(System.in);
		boolean isStart=true;
		while(isStart)
		{
			System.out.println("enter the choice"
					+ "\n 1.Addbook"
					+ "\n 2.Display book details.."
					+ "\n 3.Search book based on id"
					+ "\n 4.Search book based on Author"
					+ "\n 5.update book cost based on title"
					+ "\n 6.remove book based on id"
					+ "\n 7.exit");
			int choice=scan.nextInt();
			switch(choice) 
			{
			case 1:
			{
				while(true) 
				{
					try 
					{
						System.out.println("enter the booktitle");
						title=scan.next();
						System.out.println("enter the bookid");
						id=scan.nextInt();
						System.out.println("enter the book cost");
						cost=scan.nextInt();
						System.out.println("enter the book no fo pages");
						noofpages=scan.nextInt();
						System.out.println("enter the book author");
						author=scan.next();
						l.addBook(new Book(title,id,cost,noofpages,author));
					}
					catch(TitleMissMatchException e) 
					{
						System.out.println("please enter valid title name:"+scan.next());
					}
					catch(IdMatchMissException e) 
					{
						System.out.println("please enter valid id name:"+scan.nextInt());
					}
					catch(CostMissMatchException e) 
					{
						System.out.println("please enter valid cost:"+scan.nextInt());
					}
					catch(NoofPagesMissMatchException e) 
					{
						System.out.println("please enter valid cost:"+scan.nextInt());
					}
					catch(AuthorMissMatchException e) 
					{
						System.out.println("please enter valid cost:"+scan.next());
					}
					
				}
			}
			case 2:
			{
				l.displayBook();
			}
			break;
			case 3:
			{
				System.out.println("enter th id to searchbook");
				 id=scan.nextInt();
				l.searchBookBasedOnId(id);
			}
			break;
			case 4:
			{
				System.out.println("enter the author name to searchbook");
				 author=scan.next();
				l.searchBookBasedOnAuthor(author);
			}
			break;
			case 5:
			{
				System.out.println("enter the title  to update book");
				 title=scan.next();
				l.updateBookBasedonTitle(title);
			}
			break;
			case 6:
			{
				System.out.println("enter th id to remove book");
				 id=scan.nextInt();
				l.removebook(id);;
			}
			break;
			case 7:
			{
				isStart=false;
				System.out.println("Thank you vist again......");
			}
			break;
			default:System.out.println("enter the valid choice.....");
		}
	}

}
}

