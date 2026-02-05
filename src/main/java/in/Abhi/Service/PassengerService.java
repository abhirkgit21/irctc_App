package in.Abhi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Abhi.Repo.PassengerRepo;
import in.Abhi.bending.Passenger;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepo passengerRepo;

	public Passenger savePassenger(Passenger passenger) {
		return passengerRepo.save(passenger);
	}
	
}
