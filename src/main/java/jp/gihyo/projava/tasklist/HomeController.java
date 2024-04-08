package jp.gihyo.projava.tasklist;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping(value="/hello")
	@ResponseBody
	String hello() {
		return """
				<html>
				    <head><title>Hello</title></head>
				    <body>
				        <h1>hello</h1>
				        It works!<br>
				        現在時刻は%sです。
				    </body>
				</html>
				""".formatted(LocalDateTime.now());
	}

}
