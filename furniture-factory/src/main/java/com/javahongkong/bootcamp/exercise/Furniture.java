package com.javahongkong.bootcamp.exercise;

/**
 * FURNITURE_TYPE("Furniture Name", floating-point cost)
 */

public enum Furniture {
	CHAIR("Chair", 100.0f),
	TABLE("Table", 250.0f),
	COUCH("Couch", 500.0f);

	private final String label;
	private final float cost;

	/**
	 * @param label The plain text name of the furniture
	 * @param cost  The furniture's cost
	 */
	private Furniture(String label, float cost) {
    	this.label = label;
    	this.cost = cost;
  }

	/**
	 * @return The plain text name of the furniture
	 */
	public String label() {
    // TODO: Complete the method
	
	switch(label) {
		case CHAIR:
			return "Chair";
			break;
		case TABLE :
			return "Table";
			break;
		case COUCH:
			return "Couch";
			break;
		}
	}

	/**
	 * @return The furniture's cost
	 */
	public float cost() {
    // TODO: Complete the method
	switch(type) {
		case CHAIR:
			return 100.0f;
			break;
		case TABLE:
			return 250.0f;
			break;
		case(COUCH):
			return 500.0f;
			break;
		}
	}
}
