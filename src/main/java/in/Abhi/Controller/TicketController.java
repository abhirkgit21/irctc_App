package in.Abhi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Abhi.Service.ticketService;
import in.Abhi.bending.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private ticketService service;

	@PostMapping("/save")
	public Ticket saveticket(@RequestBody Ticket ticket) {
		return service.saveticket(ticket);
	}
}
