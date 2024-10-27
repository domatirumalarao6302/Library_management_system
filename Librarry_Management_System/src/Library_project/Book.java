package Library_project;

public class Book 
{
	private String title;
	private int id;
	private int cost;
	private int noofPages;
	private String author;
	public Book(String title, int id, int cost, int noofPages, String author)
	{
		if(validate1(title)) 
		{
			this.title = title;
		}
		else
		{
			throw new TitleMissMatchException();
		}
		if(validate2(id)) 
		{
			this.id = id;
		}
		else 
		{
			throw new IdMatchMissException();
		}
		if(validate3(cost))
		{
			this.cost = cost;
		}
		else 
		{
			throw new CostMissMatchException();
		}
		if(validate4(noofPages)) 
		{
			this.noofPages = noofPages;
		}
		else 
		{
			throw new NoofPagesMissMatchException();
		}
		if(validate5(author)) 
		{
			this.author = author;
		}
		else 
		{
			throw new AuthorMissMatchException();
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoofPages() {
		return noofPages;
	}
	public void setNoofPages(int noofPages) {
		this.noofPages = noofPages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean validate1(String title) 
	{
		if(title.equalsIgnoreCase("java")||title.equalsIgnoreCase("sql")||title.equalsIgnoreCase("python")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean validate2(int id) 
	{
		if(id%2==0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean validate3(int cost) 
	{
		if(cost>300 && cost<500) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean validate4(int noofpages) 
	{
		if(noofpages>500 && noofpages<3000) 
		{
			return
					true;
		}
		else 
		{
			return false;
		}
	}
	public boolean validate5(String author) 
	{
		if(title.equalsIgnoreCase("james")||title.equalsIgnoreCase("scott")||title.equalsIgnoreCase("alean")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void display() 
	{
		System.out.println("book title:"+getTitle());
		System.out.println("book id:"+getId());
		System.out.println("book cost:"+getCost());
		System.out.println("book noofpages:"+getNoofPages());
		System.out.println("book author:"+getAuthor());
	}
	
	@Override
	public String toString() {
		return "\n title=" + title + "\n id=" + id + "\n cost=" + cost + "\n noofPages=" + noofPages + "\n author="
				+ author + "\n-------------";
	}

}
