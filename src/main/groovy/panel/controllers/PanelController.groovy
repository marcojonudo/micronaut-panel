package panel.controllers

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import panel.domains.Configuration
import panel.services.PanelService
import panel.services.data.ConfigurationDataService

import javax.inject.Inject

@CompileStatic
@Controller("/panel")
class PanelController {

	private final ConfigurationDataService configurationDataService
	private final PanelService panelService

	@Inject
	PanelController(ConfigurationDataService configurationDataService, PanelService panelService) {
		this.configurationDataService = configurationDataService
		this.panelService = panelService
	}

	@Get("/hello")
	Configuration hello() {
//		Configuration configuration = configurationDataService.findByClave("planning.types")
		panelService.test()

		return null
	}

}
