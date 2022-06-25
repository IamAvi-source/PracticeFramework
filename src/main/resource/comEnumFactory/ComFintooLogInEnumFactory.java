package comEnumFactory;

public enum ComFintooLogInEnumFactory {
	
	LOGIN("//div[@class='col-md-7']//a[@class='color-blue f-bold'][normalize-space()='Login']"),
	USERNAME("//input[@id='emailmobile']"),
	PASSWORD("//input[@id='password']"),
	CAPTCHA("//input[@id='captcha']"),
	REMEMBERME("//input[@id='rememberMe']"),
	LOGINBUTTON("//input[@name='login']");
	
	private String clickWebSiteTabs;
	private ComFintooLogInEnumFactory(String clickWebSiteTabs)
	{
		this.clickWebSiteTabs=clickWebSiteTabs;
	}
	
	public String getValue()
	{
		return this.clickWebSiteTabs;
	}
	
	
	

}
