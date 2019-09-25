# annotation
对于annotation的理解，现在还是暂时的一头雾水，但是自己还是必须硬着头皮去理解。
所欲对于注解的理解就是将元数据附加到代码的方法。要声明注解，请将annotation放在类的前面：
```kotlin
annotation class Fancy
```
注解的附加属性可以通过元注解标注注解类来指定：
* @Target指定可以用该注解标注的元素的可能的类型（类，函数，属性，表达式等）；
* @Retention 指定该注解是否存储在编译后的class文件中，以及在运行中能否通过反射可见（默认是true）；
* @Repeatable 允许在单个元素上多次使用相同的注解；
* @MusBeDocumented 指定改注解是个公有API的一部分，并且应该包含在生成的API文档中显示的类或方法的签名中；
```kotlin
@Target (AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy
```
default annotations:

@JvmOverloads
@JvmField
@JvmStatic
