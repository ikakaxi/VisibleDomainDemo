package com.demo.lib;

public class Test3_Java {

	private static void test3() {
		// 编译通过,说明java的可见域不严谨,很容易暴露包级私有类的可见范围
		// 只需要让自己的类所在的包名和lib类库里包级私有类所在的包名一致即可访问
		IJavaInterface.IJavaInterfaceInner iInter;

		// 编译通过,说明java的可见域不严谨,很容易暴露包级私有类的可见范围
		// 只需要让自己的类所在的包名和lib类库里包级私有类所在的包名一致即可访问
		JavaInterfaceImpl.IJavaInterfaceImplInner implInter;
	}

}
