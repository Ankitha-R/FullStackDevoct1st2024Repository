package withconstructor;


class article{
	String title;
	String author;
	String content;
	String publicationdate;
	String category;
	
	
	
	article()
	{
        title="JAVA";
        author="willium";
        content="programming";
        publicationdate="12/01/2024";
        category="technology";
		System.out.println(title);
		System.out.println(author);
		System.out.println(content);
		System.out.println(publicationdate);
		System.out.println(category);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
	}
}


class comments{
	String author;
	String content;
	String timestamp;
	String articleld;
	String parentcommentID;
	
	
	
	
	comments()
	{
		author="ankitha";
		content="programming";
		timestamp="12/11/2024";
		articleld="12";
		parentcommentID="20";
		System.out.println(author);
		System.out.println(content);
		System.out.println(timestamp);
		System.out.println(articleld);
		System.out.println(parentcommentID);
	}
}
public class demo5 {

	public static void main(String[] args) {
		article art=new article();
		comments com=new comments();
	}

}
