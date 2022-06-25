package comEnumFactory;

public enum comAmazonEnumFactory {
	
	CLICK_MOBILE_CATEGORY_OPTION("//a[normalize-space()='Mobiles']"),
	CLICK_HELP_BUTTON_AT_BOTTOM("//a[normalize-space()='Help']"),
	CLICK_BESTSELLER_BUTTON("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"),
	VERIFY_SEARCHBOX_BOX("//input[@id='twotabsearchtextbox']");
	
	
	
	
	
	private String clickMobileTab;
	private comAmazonEnumFactory(String clickMobileTab)
	{
		this.clickMobileTab=clickMobileTab;
	}
	
	public String getValue()
	{
		return this.clickMobileTab;
	}

}
