package oopWithNLayerdApp.business;



import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.dataAccess.jdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}



	public void add(Product product) throws Exception { //bu metodu cagirdiginda hata firlatabilir demek  
		//is kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");  //hata fırlat demis olduk
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) { //[db,file]
			logger.log(product.getName());
			
		}
		
	}

}
