package com.gj.web.other;

import org.eh.core.util.IOUtil;
import org.junit.Test;

/**
 *
 * @author guojing
 * @date 2014-3-6
 */
public class UtilTest {

	@Test
	public void testReadImg() {
		byte[] bytes = IOUtil
				.readFileByBytes("E:/mywork/test-httpserver/target/classes/static/pic/C_3.png");
		System.out.println(bytes.length);
	}
}
