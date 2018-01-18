package com.demo.lib

fun test8() {
    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val i: IKtInterface? = null

    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val iInter: IKtInterface.IKtInterfaceInner? = null

    // 这里显示红色,编译不通过,说明Kotlin对可见域的判断是严谨的
    val iImplInter: KtInterfaceImpl.IKtInterfaceImplInner? = null
}