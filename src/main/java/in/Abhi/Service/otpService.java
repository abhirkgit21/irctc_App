package in.Abhi.Service;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.stereotype.Service;

import in.Abhi.Repo.otprepo;
import in.Abhi.bending.otp;

@Service
public class otpService {

	private final otprepo otpRepo;

	public otpService(otprepo otpRepo) {
		this.otpRepo = otpRepo;
	}

	public String generateOtp(String email) {
		String otp = String.valueOf(new Random().nextInt(900000) + 100000);

		otp otpEntity = new otp();
		otpEntity.setEmail(email);
		otpEntity.setOtp(otp);
		otpEntity.setExpirytime(LocalDateTime.now().plusMinutes(5));

		otpRepo.save(otpEntity);
		return otp;
	}

	public boolean verifyOtp(String email, String otp) {
		otp record = otpRepo.findByEmail(email).orElseThrow();
		return record.getOtp().equals(otp) && record.getExpirytime().isAfter(LocalDateTime.now());
	}
}
