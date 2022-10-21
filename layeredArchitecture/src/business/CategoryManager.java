package business;

import core.Logger;
import dataAccess.IDatabaseDao;
import entities.Category;
import fakeData.FakeData;

public class CategoryManager {
	private IDatabaseDao databaseDao;
		private Logger [] loggers;
		public CategoryManager(IDatabaseDao databaseDao, Logger[] loggers) {
			super();
			this.databaseDao = databaseDao;
			this.loggers = loggers;
		}
		public void add(Category category)
		{
			try {
				addConditional(category);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public void addConditional(Category category) throws Exception{
				for (Category c : FakeData.categories) {
					if(c.getName()==category.getName())
					{
						throw new Exception("This category name is already in"+category.getName());
					}
					databaseDao.addCategoty(category);
				}
				for (Logger logger : loggers) {
					logger.log(category.getName());
					
				}
		}
	}



