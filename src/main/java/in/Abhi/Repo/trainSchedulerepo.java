package in.Abhi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Abhi.bending.TrainSchedule;
@Repository
public interface trainSchedulerepo extends JpaRepository<TrainSchedule, Long> {

	//Optional<TrainSchedule> findbyId(Long scheduleId);
	
}
