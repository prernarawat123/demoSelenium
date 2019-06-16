package POMDemo.POMDemoProject.helper.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import POMDemo.POMDemoProject.helper.resource.resourceHelper;

public class loggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class cls) {
		if(root)
		{
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(resourceHelper.getResourcePath(""));
		root=true;
		return Logger.getLogger(cls);
	}

	public static void main(String[] args) {
		Logger log = loggerHelper.getLogger(loggerHelper.class);
		log.info("Logger is configures");
		log.info("logger is working");
	}
}
