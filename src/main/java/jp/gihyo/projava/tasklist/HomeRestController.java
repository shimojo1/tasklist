package jp.gihyo.projava.tasklist;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	@RequestMapping(value="/resthello")
	String hello() {
		return """
				Hello.
				It works!
				現在時刻は%sです。
				""".formatted(LocalDateTime.now());
	}

}
