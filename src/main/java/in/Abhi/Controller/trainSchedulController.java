package in.Abhi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Abhi.Service.trainScheService;
import in.Abhi.bending.TrainSchedule;

@RestController
@RequestMapping("/trainSche")
public class trainSchedulController {

	@Autowired
	private trainScheService trainScheService;

	@PostMapping("/save")
	public TrainSchedule saveUser(@RequestBody TrainSchedule trainSchedule) {
		return trainScheService.saveticket(trainSchedule);
	}
}
