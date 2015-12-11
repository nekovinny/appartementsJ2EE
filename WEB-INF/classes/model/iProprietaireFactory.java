package model;

public abstract class iProprietaireFactory {

	static iProprietaireFactory getFactory (String type) throws noTypeException { 

		switch (type) {
		case "proprietaire":
			return new ProprietaireFactory();
		default:
			throw new noTypeException();
		}

	}
}