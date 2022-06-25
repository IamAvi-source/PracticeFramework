package comEnumFactory;

public enum FacebookLoginVariableEnum {

	
	
	  XPATH_USERNAME_FIELD("//input[@id='email']");
	  
	  
	  private String loginPageVariables;
	
	private FacebookLoginVariableEnum(String loginPageVariables)
	{
		this.loginPageVariables=loginPageVariables;
	}
	
	public String getValue()
	{
		return this.loginPageVariables;
	}
	
	
}
