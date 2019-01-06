package panel.pogos.database

import groovy.transform.CompileStatic

@CompileStatic
class DbConfig {

	String centre
	Map<String, Object> config

	DbConfig(String centreCode) {
		centre = centreCode
		config = [
				'username': (Object) 'root',
				'password': 'root',
				'url': "jdbc:mysql://localhost:3306/${centreCode == '39' ? 'cubo' : 'cubo2'}",
				'connectTimeout': '1000',
				'socketTimeout': '1000'
		]
	}

}
