package panel.services.data

import grails.gorm.multitenancy.CurrentTenant
import grails.gorm.services.Service
import panel.domains.Configuration

@CurrentTenant
@Service(Configuration)
interface ConfigurationDataService {

	Configuration findByClave(String clave)

}
