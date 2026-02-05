package in.Abhi.bending;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tick")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ticketId;

	private String pnr;

	private String status;

	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name ="user_id") private User user;
	 */
	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private TrainSchedule schedule;

	@OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
	private List<Passenger> passengers;

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TrainSchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(TrainSchedule schedule) {
		this.schedule = schedule;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

}
