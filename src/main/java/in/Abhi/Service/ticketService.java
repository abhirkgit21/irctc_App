package in.Abhi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Abhi.Repo.ticketRepo;
import in.Abhi.Repo.trainRepo;
import in.Abhi.Repo.trainSchedulerepo;
import in.Abhi.bending.Ticket;

@Service
public class ticketService {

	@Autowired
	private ticketRepo ticketRepo;
	@Autowired
	private trainSchedulerepo scheduleRepo;

	@Autowired
	private trainRepo trainRepo;

	public Ticket saveticket(Ticket ticket) {
		if (ticket.getTrain() != null && ticket.getTrain().getTrainId() != null) {
			ticket.setTrain(trainRepo.findById(ticket.getTrain().getTrainId())
					.orElseThrow(() -> new RuntimeException("Train not found")));

		}
		if (ticket.getSchedule() != null && ticket.getSchedule().getScheduleId() != null) {
			ticket.setSchedule(scheduleRepo.findById(ticket.getSchedule().getScheduleId())
					.orElseThrow(() -> new RuntimeException("Schedule not found")));
		}

		// 🔹 Link passengers to ticket
		if (ticket.getPassengers() != null) {
			ticket.getPassengers().forEach(p -> p.setTicket(ticket));
		}

		return ticketRepo.save(ticket);
	}

}
