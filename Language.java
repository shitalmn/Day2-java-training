
public class Language {
	public static void main(String[] args) {
		
		C cObj = new C("variable");
		cObj.initialize();
		
		CPP cppObj = new CPP("variable","Object oriented programming");
		cppObj.mainFeature();
		
		Java javaObj = new Java("variable","Object oriented programming","Interface");
		javaObj.advancedFeature();
	}
}

class C
{
	private String basicFeature;
	
	
	public C(String basicFeature) {
		super();
		this.basicFeature = basicFeature;
	}


	void initialize()
	{
		System.out.println("basic feature of C is initialize "+basicFeature);
	}

}

class CPP extends C
{
	private String feature;
	
	
	
	public CPP(String basicFeature, String feature) {
		super(basicFeature);
		this.feature = feature;
	}




	void mainFeature()
	{
		System.out.println(" main feature of CPP is it is a  "+feature);
	}

}

class Java extends CPP
{
	private String advfeature;
	

	


	public Java(String basicFeature, String feature, String advfeature) {
		super(basicFeature, feature);
		this.advfeature = advfeature;
	}





	void advancedFeature()
	{
		System.out.println(" Advanced feature of java is  "+advfeature);
	}

}