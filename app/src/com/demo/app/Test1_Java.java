package com.demo.app;

import com.demo.lib.JavaInterfaceImpl;

public class Test1_Java {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		// 编译通过,这说明java对可见域的判断是不严谨的,
		// 这应该属于bug,因为IJavaInterface接口的内部接口IInterJavaInterface可见域为包级私有
		// 而public的IJavaInterface接口实现类JavaInterfaceImpl却暴露了IInterJavaInterface的可见范围
		JavaInterfaceImpl.IJavaInterfaceInner iInner;

		// 这里显示红色,编译不通过,说明java的接口实现类(public可见域)能暴露接口(包级私有)的内部接口(包级私有)
		// 却不会暴露自己的内部接口(包级私有)
		JavaInterfaceImpl.IJavaInterfaceImplInner implInner;
	}
}
