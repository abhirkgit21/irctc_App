package in.Abhi.bending;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Train_Sche")
public class TrainSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long scheduleId;

	private LocalDate journeyDate;
	private int availableSeats;

	@ManyToOne
	@JoinColumn(name = "train_id")
	@JsonIgnore
	private Train train;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "schedule_id") private TrainSchedule trainschedules;
	 */

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public LocalDate getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

}
