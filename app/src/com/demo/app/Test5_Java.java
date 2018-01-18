package com.demo.app;

import com.demo.lib.IKtInterface;
import com.demo.lib.KtInterfaceImpl;

public class Test5_Java {

	public static void main(String[] args) {
		test5();
	}

	private static void test5() {
		// 下面2个虽然显示红色,但是实际是能编译通过的,在IDE的文件列表那里这个类并没有红色波浪线
		// 并且运行也没有错误
		// 说明kotlin的internal模块级私有对java来说就是public的

		IKtInterface i;
		KtInterfaceImpl.IKtInterfaceImplInner iInner;
	}
}
