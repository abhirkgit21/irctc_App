package in.Abhi.bending;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "train")
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer trainId;
	private String trainNumber;
	private String source;
	private String destination;

	@OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Ticket> tickets;

	@OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<TrainSchedule> schedules;

	public Integer getTrainId() {
		return trainId;
	}

	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public List<TrainSchedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<TrainSchedule> schedules) {
		this.schedules = schedules;
	}

}
