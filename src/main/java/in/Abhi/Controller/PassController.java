package in.Abhi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Abhi.Repo.PassengerRepo;
import in.Abhi.bending.Passenger;

@RestController
@RequestMapping("/passenger")
public class PassController {
	
	@Autowired
	private PassengerRepo passengerRepo;

	@PostMapping("/save")
	public Passenger savePass(@RequestBody Passenger passenger) {
		return passengerRepo.save(passenger);
	}
}
