package in.Abhi.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Abhi.bending.otp;

public interface otprepo extends JpaRepository<otp, Long>{
	
	 Optional<otp> findByEmail(String email);

}
