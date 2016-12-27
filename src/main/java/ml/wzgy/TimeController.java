package ml.wzgy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.TimeZone;

@RestController
public class TimeController {
	@RequestMapping("**")
	public DateTime time() {
		return new DateTime(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")));
	}
}