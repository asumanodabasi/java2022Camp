package business;

import core.Logger;
import dataAccess.IDatabaseDao;
import entities.Instructor;
import fakeData.FakeData;

public class InstructorManager {

		private IDatabaseDao dao;
		private Logger [] loggers;
		public InstructorManager(IDatabaseDao dao, Logger[] loggers) {
			super();
			this.dao = dao;
			this.loggers = loggers;
		}
		
		public void add(Instructor instructor) {
			try {
				dao.addInstructor(instructor);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public void addConditional(Instructor instructor) throws Exception{
			for (Instructor ins : FakeData.instructors) {
				if(ins.getName()==instructor.getName())
				{
					System.out.println("This instructors already exists");
				}
				dao.addInstructor(instructor);
			}
			for (Logger logger : loggers) {
				logger.log(instructor.getName());
			}
		}

	}



