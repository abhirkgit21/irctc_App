package in.Abhi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Abhi.Repo.UserRepo;
import in.Abhi.bending.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userrepo;

	public User saveUser(User user) {
		return userrepo.save(user);
	}
}
