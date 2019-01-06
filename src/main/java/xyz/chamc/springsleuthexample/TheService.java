package xyz.chamc.springsleuthexample;

import java.time.LocalDateTime;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TheService {

	static final Logger logger = LoggerFactory.getLogger(TheService.class);

	public void aService() {

		long start = System.currentTimeMillis();
		logger.info("START: aService.");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("ERROR !!");
		}

		long end = System.currentTimeMillis();
		logger.info("END: aService. Execute="+ (end - start)  + "ms");
	}
}
