测试前提:
 lib类库里的Java类有默认可见域的接口(包级私有)和public可见域的接口实现类

测试内容:
 测试lib类库里的java类
 假设lib类库里包级私有接口名为IA,里面有包级私有的内部接口IAInter
 假设IA的public可见域的实现类名为AImpl,里面有包级私有的内部接口AImplInter

 1.app类中的Java类能否引用lib类库里AImpl继承下来的IAInter和AImpl自己的AImplInter
 2.app类中的Kotlin类能否引用lib类库里AImpl继承下来的IAInter和AImpl自己的AImplInter
 3.app类中的Java类能否改变lib类库里IA和IAInter的可见域和AImpl自己的AImplInter可见域
 4.app类中的Kotlin类能否改变lib类库里IA和IAInter的可见域和AImpl自己的AImplInter可见域

 测试lib类库里的kotlin类
 假设lib类库里模块级私有接口名为IA,里面有模块级私有的内部接口IAInter
 假设IA的public可见域(kotlin默认)的实现类名为AImpl,里面有模块级私有的内部接口AImplInter

 5.app类中的Java类能否引用lib类库里的IA和IAInter和AImpl自己的AImplInter
 6.app类中的Kotlin类能否引用lib类库里AImpl继承下来的IAInter和AImpl自己的AImplInter
 7.app类中的Java类能否改变lib类库里IA和IAInter的可见域和AImpl自己的AImplInter可见域
 8.app类中的Kotlin类能否改变lib类库里IA和IAInter的可见域和AImpl自己的AImplInter可见域

测试总结:
 1.java的app调用java的lib类库,即使java的lib类库有类(或者接口)有内部类(或者有内部接口)为包级私有,只要这些类(或者接口)有子类(或者实现类),
   并且这些子类(或者实现类)是public的,那么这些子类(或者实现类)是能暴露父类(或者父接口)的包级私有内部类(或者包级私有内部接口)的可见性的(这是错误的,不应该暴露)
 2.java的app调用java的lib类库,即使java的lib类库有类(或者接口)有内部类(或者有内部接口)为包级私有,只要在app层创建这些包级私有类(或者接口)
   的同包名类(或者接口),就可以访问lib类库里的这些包级私有类(或者接口)
 3.java的app调用kotlin的lib类库,即使kotlin的lib类库有类(或接口)为internal模块级私有权限,但是对java来说就和public一样可见
 4.kotlin的app调用java的lib类库,会严格遵守可见性,不会因为继承(或者实现)了父类(或父接口)而把父类(或者副接口)的
   内部包级私有类(或者内部包级私有接口)暴露,所以也不会像java的app那样能调用父类(或副接口)的内部包级私有类(或内部包级私有接口)
 5.kotlin的app调用kotlin的lib类库,如果kotlin的lib类库有类(或接口)为internal模块级私有权限,那么kotlin是无法调用的