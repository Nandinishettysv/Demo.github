package logs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log1 {
	@Test
	public void test1()
	{
		//step1
		BasicConfigurator.configure();
		//step2
		Logger log = Logger.getLogger(this.getClass().getName());
		//step3
		log.warn("warn");
		log.info("info");
		log.error("error");
	}

}
