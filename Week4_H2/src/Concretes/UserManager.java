package Concretes;
import Abstracts.IInformationCheckService;
import Abstracts.ILogger;
import Abstracts.IUserService;
import Entities.User;

public class UserManager implements IUserService{
	
	private ILogger logger;
	private IInformationCheckService informationCheckService;
	
	public UserManager(ILogger logger, IInformationCheckService informationCheckService) {
		this.logger = logger;
		this.informationCheckService = informationCheckService;
	}

	@Override
	public void register(User user) {
		
		if(informationCheckService.IsInformationsConfirmed(user))
			logger.registerLog(user);
		else
			System.out.println("User did not register by the system...");
	}

	@Override
	public void update(User user) {
		
		if(informationCheckService.IsInformationsConfirmed(user))
			logger.updateLog(user);
		else
			System.out.println("User did not update by the system...");
	}

	@Override
	public void delete(User user) {
		
		if(informationCheckService.IsInformationsConfirmed(user))
			logger.deleteLog(user);
		else
			System.out.println("User did not delete by the system...");
	}
}