package Concretes;
import Abstracts.ILogger;
import Entities.User;

public class EDevletLogger implements ILogger{

	@Override
	public void registerLog(User user) {
		System.out.println(user.getFirstName() +" registered to the EDevlet");
	}

	@Override
	public void updateLog(User user) {
		System.out.println(user.getFirstName() +" updated to the EDevlet");
	}

	@Override
	public void deleteLog(User user) {
		System.out.println(user.getFirstName() + " deleted from the EDevlet");
	}
}