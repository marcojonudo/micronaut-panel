package panel.services

import groovy.transform.CompileStatic
import org.grails.orm.hibernate.HibernateDatastore
import panel.pogos.database.DbConfig

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@CompileStatic
class PanelService {

	private final HibernateDatastore hibernateDatastore

	@Inject
	PanelService(HibernateDatastore hibernateDatastore) {
		this.hibernateDatastore = hibernateDatastore
	}

	void test() {
		List<String> centres = ["39", "40"]
		centres.each {
			DbConfig dbConfig = new DbConfig(it)
			hibernateDatastore.getConnectionSources().addConnectionSource(dbConfig.centre, dbConfig.config)

		}
//		try {
//			hibernateDatastore.getConnectionSources().addConnectionSource(dbConfig.centre, dbConfig.config)
//			hibernateDatastore.getConnectionSources().add
//		} catch (all) {
//			log.info(all.message)
//		}
//		println("CONEXIONES")
		println(hibernateDatastore.connectionSources.size())
		println(hibernateDatastore.connectionSources.getProperties())
		hibernateDatastore.connectionSources.each {
			println(it.name)
		}

	}

}
