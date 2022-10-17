package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Yapıcı blok calişti");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok calişti");
	}
	
	public static boolean isValid(Product product)
	{
		if(product.price>0 && !product.name.isEmpty())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey()
	{
		
	}
}
