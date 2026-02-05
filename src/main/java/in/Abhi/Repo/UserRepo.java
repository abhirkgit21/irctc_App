package in.Abhi.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Abhi.bending.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	 Optional<User> findByEmail(String email);

}
