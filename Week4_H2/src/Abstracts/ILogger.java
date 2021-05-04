package Abstracts;
import Entities.User;

public interface ILogger {
	
	void registerLog(User user);
	void updateLog(User user);
	void deleteLog(User user);
}
