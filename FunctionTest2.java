

public class FunctionTest2 {

	public static void main(String args[])
	{
		
		Swym creation = new Swym();
		creation.communityName();
		creation.createPost("Post1");
		String Idea = creation.createIdea("Idea1","Media1.jpg");
		System.out.println("Idea"+Idea);
		int mediaid = creation.createMedia();
		
		System.out.println("mediaid"+mediaid);
		
	}
	
	
	
}


class Swym
{
	void communityName()
	{
		System.out.println("Name of community is Genius");
		System.out.println("--------------------------");
		
	}
	
	void createPost(String postName)
	
	{
		System.out.println("Post name is" + postName);
		
		
	}
	
	String createIdea(String ideaName, String mediaName)
	
	{
		
		System.out.println("createIdea with media is");
	
		
		
		return ideaName+mediaName;
	}
	
    int createMedia()
	
	{
		
		
		
		return 12345;
	}



}