package xyz.chamc.springsleuthexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/api")
public class TheController {

	private static Logger logger = LoggerFactory.getLogger(TheController.class);

	@Autowired
	TheService theService;
	
	@RequestMapping("/call")
	public String call() {
		logger.info("START: call().");

		theService.aService();
		
		logger.info("END: call().");
		return "You call API !";
	}
}
