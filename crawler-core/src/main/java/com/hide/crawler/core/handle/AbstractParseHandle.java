package com.hide.crawler.core.handle;

public abstract class AbstractParseHandle {


	protected void check() throws IllegalArgumentException {

	}

	public Object handle(Object param) {
		return parse(param);
	}

	protected abstract Object parse(Object param);

}
