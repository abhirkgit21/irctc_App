package in.Abhi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Abhi.bending.Ticket;

public interface ticketRepo extends JpaRepository<Ticket, Long>{

}
