package nl.uva.larissa.service;

public enum XapiHeader {
	CONSISTENT_THROUGH("X-Experience-API-Consistent-Through");

	private final String key;

	XapiHeader(String key) {
		this.key = key;
	}

	public String key() {
		return key;
	}
}
