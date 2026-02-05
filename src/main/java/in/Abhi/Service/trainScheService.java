package in.Abhi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Abhi.Repo.trainSchedulerepo;
import in.Abhi.bending.TrainSchedule;

@Service
public class trainScheService {

	@Autowired
	private trainSchedulerepo trainSchedulerepo;
	
	public TrainSchedule saveticket(TrainSchedule trainSchedule) {
		return trainSchedulerepo.save(trainSchedule);
	}
}
