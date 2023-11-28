
import java.util.*;

public class Author {
	String authorName;
	int age;
	String place;
	void author(String name,int age,String place)
	{
		this.authorName=name;
		this.age=age;
		this.place=place;
		
		
	}
    String getAuthorName() {
		return authorName;
	}
	public int getage() {
		return age;
	}
	public String getplace() {
		return place;
	}

}
class Book
{
	String name;
	int price;
	Author auth;
	Book(String n,int p,Author at){
		this.name=n;



        
		this.price=p;
		this.auth=at;
	}
	public void ShowDetail() {
		System.out.println("Book is"+name);
		System.out.println("price"+price);
		System.out.println("Author is"+authget.AuthorName());
	}
}
public class Test
{
	public static void main(String args[]) {
		Author auth=new Author("John",22,"india");
		Bookn b=new Book("Java",550,auth);
		b.showDetail();
	}
}


 
