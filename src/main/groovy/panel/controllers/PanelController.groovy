package panel.controllers

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import panel.domains.Configuration
import panel.services.data.ConfigurationDataService

import javax.inject.Inject

@CompileStatic
@Controller("/panel")
class PanelController {

	private final ConfigurationDataService configurationDataService

	@Inject
	PanelController(ConfigurationDataService configurationDataService) {
		this.configurationDataService = configurationDataService
	}

	@Get("/hello")
	Configuration hello() {
		Configuration configuration = configurationDataService.findByClave("planning.types")

		return configuration
	}

}
