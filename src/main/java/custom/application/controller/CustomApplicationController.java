package custom.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CustomApplicationController {

	
	
	@PostMapping("/triggerevent")
	public String triggerEvent (@RequestBody String data) {
		
		if(data!= null )
			log.info(data);
		return "Created OK ";
	}
	
	@PostMapping("/triggerdemo")
	public String triggerEvent (@RequestBody Object data) {
		if(data!= null ) {
				log.info("data triggered is "  +data.toString());
		 }
		return "Created OK ";
	}
}
