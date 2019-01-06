package panel.domains

class Store {

	int code
	String name
	Language language
	Region region
	Type type

	enum Language {

		es, pt

	}

	enum Region {

		A, B, C, D, E, P

	}

	enum Type {

		AC

	}

	static mapping = {
		name maxSize: 45
		language maxSize: 5
		region maxSize: 1
		type maxSize: 2
	}

}
