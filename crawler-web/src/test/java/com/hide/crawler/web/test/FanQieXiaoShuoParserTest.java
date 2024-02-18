package com.hide.crawler.web.test;

import com.hide.crawler.web.handle.FanQieXiaoShuoParser;
import org.junit.jupiter.api.Test;

public class FanQieXiaoShuoParserTest {


	@Test
	public void doParse() {
		String novel = "";
		FanQieXiaoShuoParser fanQieXiaoShuoParser = new FanQieXiaoShuoParser();
		Object handle = fanQieXiaoShuoParser.handle(novel);
		System.out.println(handle);
	}
}
