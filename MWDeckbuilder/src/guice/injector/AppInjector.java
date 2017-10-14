package guice.injector;

import com.google.inject.AbstractModule;

import guice.services.EmailService;
import guice.services.MessageService;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		//bind the service to implementation class
		//bind(MessageService.class).to(EmailService.class);
		
		//bind MessageService to Facebook Message implementation
		bind(MessageService.class).to(EmailService.class);
		
	}

}
