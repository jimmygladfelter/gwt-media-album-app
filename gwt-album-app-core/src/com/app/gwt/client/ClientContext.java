package com.app.gwt.client;

public class ClientContext {

	private static ClientContext instance;

	public ClientContext getInstance() {
		if (instance == null) {
			instance = new ClientContext();
		}
		return instance;
	}

	public void setInstance(ClientContext context) {
		instance = context;
	}

	public ClientContext() {

	}
}
