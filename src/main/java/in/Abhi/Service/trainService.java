package in.Abhi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Abhi.Repo.trainRepo;
import in.Abhi.bending.Train;

@Service
public class trainService {

	@Autowired
	private trainRepo trainRepo;

	public Train saveticket(Train train) {
		return trainRepo.save(train);
	}
}
