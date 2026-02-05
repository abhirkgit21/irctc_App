package in.Abhi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Abhi.Service.trainService;
import in.Abhi.bending.Train;

@RestController
@RequestMapping("/train")
public class trainController {

	@Autowired
	private trainService trainService;

	@PostMapping("/save")
	public Train saveUser(@RequestBody Train train) {
		return trainService.saveticket(train);
	}
}
