package de.gmaier.headless;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.gmaier.headless.jena.TryJena;

public class Application1 implements IApplication {
	
	Logger logger = LoggerFactory.getLogger(Application1.class);

	@Override
	public Object start(IApplicationContext context) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		
		logger.info("Hello Log");
		
		TryJena.run();
		
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
