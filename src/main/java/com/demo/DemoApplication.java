package com.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.demo.data.entities.PrepMaterials;
import com.demo.manager.impl.DemoManagerImpl;

@SpringBootApplication
public class DemoApplication {
	private static final Logger LOG = Logger.getLogger(DemoManagerImpl.class);

	private static final String APP_PROPS = "application";
	private static final String MY_CONFIG = "MyConfig";

	public static void main(String[] args) {
		System.setProperty("spring.config.name", APP_PROPS + "," + MY_CONFIG);
		// System.setProperty("spring.application.name", MY_CONFIG);
		SpringApplication.run(DemoApplication.class, args);

		long startTime = System.nanoTime();
		LOG.info("start" + startTime);

		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrlCount = "https://certportal.nhanow.com/data_api/view_prep_materials/count?api_key=C4UjXczRSoxIJbTjsvQ804DyPOArpv23jEbx5Qku7YA";
		ResponseEntity<Long> count = restTemplate.getForEntity(fooResourceUrlCount, Long.class);
		Long c = count.getBody();
		LOG.info("count=" + c);
		long page;
		page = (c / 1000) + 1;
		LOG.info("page=" + page);

		long i = 0;
		long j = 0;
		while (j < page) {
			i = j * 1000;
			String fooResourceUrl = "https://certportal.nhanow.com/data_api/view_prep_materials/?api_key=C4UjXczRSoxIJbTjsvQ804DyPOArpv23jEbx5Qku7YA&sort=student_id&limit=1000&start="
					+ i;
			ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);

			LOG.info("********************************************" + "page number = " + j
					+ "********************************************");
			LOG.info(response.getBody());
			
			//PrepMaterials p= new PrepMaterials();
			
			j++;
		}

		long endTime = System.nanoTime();
		double durationInSeconds = (endTime - startTime) / 1000000000.0;
		LOG.info(durationInSeconds);

	}
}
