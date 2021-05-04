package Abstracts;
import Entities.User;

public interface IUserService {
	
	void register(User user);
	void update(User user);
	void delete(User user);
}