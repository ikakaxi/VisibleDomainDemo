package com.demo.lib;

public class Test7_Java {

	private static void test7() {
		// 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
		IKtInterface i;

		// 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
		IKtInterface.IKtInterfaceInner iInter;

		// 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
		KtInterfaceImpl.IKtInterfaceImplInner iImplInter;
	}

}
