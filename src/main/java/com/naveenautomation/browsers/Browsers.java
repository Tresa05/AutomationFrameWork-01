package com.naveenautomation.browsers;

public enum Browsers {
	CHROME("Google Chrome"), EDGE("MicrosoftvEdge"), FIREFOX("MozillaFireFox");

	public String browserName;

	Browsers(String browser) {
		this.browserName = browser;
	}

	public String getBrowserName() {
		return browserName;
	}
}
