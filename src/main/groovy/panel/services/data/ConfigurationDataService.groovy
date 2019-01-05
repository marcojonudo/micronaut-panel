package panel.services.data

import grails.gorm.services.Service
import panel.domains.Configuration
import javax.inject.Singleton

@Singleton
@Service(Configuration)
interface ConfigurationDataService {

	Configuration findByClave(String clave)

}
