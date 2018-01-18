package com.demo.app

import com.demo.lib.KtInterfaceImpl

fun main(args: Array<String>) {
    test6()
}

fun test6() {
    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val i: IKtInterface? = null

    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val iInner: IKtInterface.IKtInterfaceInner? = null

    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val implInner: KtInterfaceImpl.IKtInterfaceImplInner? = null
}