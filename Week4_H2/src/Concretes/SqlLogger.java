package Concretes;
import Abstracts.ILogger;
import Entities.User;

public class SqlLogger implements ILogger{

	@Override
	public void registerLog(User user) {
		System.out.println(user.getFirstName() +" registered to the SQL");
	}

	@Override
	public void updateLog(User user) {
		System.out.println(user.getFirstName() +" updated to the SQL");
	}

	@Override
	public void deleteLog(User user) {
		System.out.println(user.getFirstName() +" from SQL");
	}
}
