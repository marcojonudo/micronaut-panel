package panel.domains

import grails.gorm.MultiTenant
import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Configuration implements GormEntity<Configuration>, MultiTenant {

	String clave
	String value

	static constraints = {
		clave blank: false, unique: true
		value nullable: true
	}

}
