package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.request.Passenger;

@Controller
public class MakeMyTripController {

	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/bookTicket")
	public String bookTicket(Passenger request)
	{
		System.out.println(request);
		
		return "success";
	}
}
