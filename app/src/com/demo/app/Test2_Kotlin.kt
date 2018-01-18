package com.demo.app

import com.demo.lib.JavaInterfaceImpl

fun main(args: Array<String>) {
    test2()
}

fun test2() {
    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val iInner: JavaInterfaceImpl.IInterJavaInterface? = null

    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val implInner: JavaInterfaceImpl.IJavaInterfaceImplInner? = null
}