package Concretes;

import Abstracts.IInformationCheckService;
import Entities.User;

public class InformationCheckManager implements IInformationCheckService {

	@Override
	public boolean IsInformationsConfirmed(User user) {
		return user.getFirstName() != null || user.getFirstName() != "" && user.getLastName() != null || user.getLastName() != "" && user.getId() != 0 ? true : false;
	}
}