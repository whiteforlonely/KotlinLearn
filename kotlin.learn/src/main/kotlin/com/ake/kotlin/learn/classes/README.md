# Classes and Inheritance
## Classes
Classes in kotlin are declared using the keyword *class:*

```kotlin
class Invoice { ... }
```
The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructors etc.) and the class body, surrounded by curly braces. Both the header and the body are optional; if the class has o body, curly braces can be omitted.

```kotlin
class Empty
```
### Constructors
A class in Kotlin can have a primary constructor and one or more secondary constructors. the primary constructor is part of the class header: it goes after the class name( and optional type parameters).
```kotlin
class Person constructor(firstName: String){ ... }
```
if the primary constructor does not have any anonotations or visibility modifiers, the constructor keyword can be omitted:

```kotlin
class Person(firstName: String) { ... }
```
The primary constructor cannot contain any code. Initialization code and be placed in initializer blocks. which are prefixed with *init* keyword.

During an instance initialization, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers.

```kotlin
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}
```
Note that parameters of the primary constructor can be used in the initializer blocks. They can also be used in property initializers declared in the class body:

```Kotlin
class Customer(name: String) {
    val customerKey = name.toUpperCase()
}
```
In fact, for declaring properties and initializing them from the primary constructor, Kotlin has a concise syntax:

```Kotlin
class Person(val firstName: String, val lastName: String, var age: Int) { ... }
```
Much the same way as regular properties, the properties declared in the primary constructor can be mutable (var) or read-only (val).
if the constructor has annotations or visibility modifiers, the constructor keywork is required, and the modifiers go before it:

```
class Customer public @Inject constructor(name: String) { ... }
```
### Secondary Constructor
The class can also declare secondary constructors, which are prefiexed with constructor:

```Kotlin
class Person {
    constructor(parent: Person) {
        parent.children.add(this)
    }
}
```
Note that code in initializer blocks effectively becomes part of the primary cosntructor. Delegation to the primary constructor happens as the first statement of a secondary constructor, so the code in all initializer blockds is executed before the secondary constructor body. Even if the class has no primary constructor, the delegation still happens implicitly , and the initializer blocks are still executed:

```Kotlin
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}
```
If a non-abstract class does not declare any constructors (primary or secondary), it will have a generated primary constructor with no arguments. The visibility of the constructor will be public. If you do not want your class to have a public constructor, you need to declare an empty primary constructor with non-default visibility:
```Kotlin
class DontCreateMe private constructor () { ... }
```
> **NOTE**: On the JVM, if all of the parameters of the primary constructor have default values, the compiler will generate an additional parameterless constructor which will use the default values. This makes it easier to use Kotlin with libraries such as Jackson or JPA that create class instances through parameterless constructors.

```Kotlin
class Customer(val customerName: String = "")
```
### Creating instance of classes
To create an instance of a class, we call the constructor as if it were a regular function:

```Kotlin
val invoice = Invoice()
val customer = Customer("Joe Smith")
```
note that Kotlin does not have a *new* keyword.
## Inheritance
All classes in Kotlini have a common superclass Any, that is the default superclass for a class with no supertypes declared:

```Kotlin
class Example // Implicitly inherits from Any
```
> Note: Any is not java.lang.Object; in particular, it does not have any members other than equals(), hashCode() and toString(). Please consult the java interoperability. section for more details.

To declare an explicit supertype, we place the type after a colon in the class header:

```Kotlin
open class Base(p: Int)
class Derived(p: Int): Base(p)
```
If the derived class has a primary constructor, the base class can (and must) be initialized right there, using the parameters of the primary constructor.

If the class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword, or to delegate to another constructor which does that. Note that in this case different secondary constructors can call different constructors of the base type:

```Kotlin
class MyView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}
```
### Overriding Methods
As we mentioned before, we stick to making things explicit in Kotlin. And unlike Java, Kotlin requires explicit modifiers for overridable members (we call them open) and for overrides:

```Kotlin
open class Base {
    open fun v() { ... }
    fun nv() { ... }
}
class Derived() : Base() {
    override fun v() { ... }
}
```
The override modifier is required for Derived.v(). If it were missing, the compiler would complain. If there is no open modifier on a function, like Base.nv(), declaring a method with the same signature in a subclass is illegal, either with override or without it. The open modifier has no effect when added on members of a final class (i.e.. a class with no open modifier).

A member marked override is itself open, i.e. it may be overridden in subclasses. If you want to prohibit re-overriding, use final:

```Kotlin
open class AnotherDerived() : Base() {
    final override fun v() { ... }
}
```
### Overriding Properties
Overriding properties works in a similar way to overriding methods; properties declared on a superclass that are then redeclared on a derived class must be prefaced with override, and they must have a compatible type. Each declared property can be overridden by a property with an initializer or by a property with a getter method.

```Kotlin
open class Foo {
    open val x: Int get() { ... }
}

class Bar1 : Foo() {
    override val x: Int = ...
}
```
You can also override a val property with a var property, but not vice versa. This is allowed because a val property essentially declares a getter method, and overriding it as a var additionally declares a setter method in the derived class.

Note that you can use the override keyword as part of the property declaration in a primary constructor.

```Kotlin
interface Foo {
    val count: Int
}

class Bar1(override val count: Int) : Foo

class Bar2 : Foo {
    override var count: Int = 0
}
```
### Derived class initialization order
During construction of a new instance of a derived class, thebase class initialization is done as the first step (preceded only by evaluation of the arguments for the base class constructor) and thus happens before the initialization logic of the derived class in run.

```Kotlin
open class Base(val name: String) {

    init { println("Initializing Base") }

    open val size: Int =
        name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
    name: String,
    val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}
```
It means that, by the time of the base class constructor execution, the properties declared or overridden in the derived class are not yet initialized. If any of those properties are used in the base class initialization logic (either directly or indirectly, through another overridden open member implementation), it may lead to incorrect behavior or a runtime failure. When designing a base class, you should therefore avoid using open members in the constructors, property initializers, and init blocks.
### Calling the superclass implementation
Code in a derived class can call its superclass functions and property accessors implementtations using the super keyword:

```Kotlin
open class Foo {
    open fun f() { println("Foo.f()") }
    open val x: Int get() = 1
}

class Bar : Foo() {
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override val x: Int get() = super.x + 1
}
```
### Overiding Rules
In Kotlin, implementation inheritance is regulated by the following rule: if a class inherits many implementations of the same member from its immediate superclasses, it must override this member and provide its own implementation (perhaps, using one of the inherited ones). To denote the supertype from which the inherited implementation is taken, we use super qualified by the supertype name in angle brackets, e.g. super<Base>:

```Kotlin
open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // interface members are 'open' by default
    fun b() { print("b") }
}

class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}
```
It's fine to inherit from both A and B, and we have no problems with a() and b() since C inherits only one implementation of each of these functions. But for f() we have two implementations inherited by C, and thus we have to override f() in C and provide our own implementation that eliminates the ambiguity.
### Abstract Classes
A class and some of its members may be declared abstract. An abstract member does not have an implementation in its class. Note that we do not need to annotate an abstract class or function with open – it goes without saying.
We can override a non-abstract open member with an abstract one

```Kotlin
open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    override abstract fun f()
}
```
### Companion Objects
In Kotlin, unlike Java or C#, classes do not have static methods. In most cases, it's recommended to simply use package-level functions instead.

If you need to write a function that can be called without having a class instance but needs access to the internals of a class (for example, a factory method), you can write it as a member of an object declaration inside that class.

Even more specifically, if you declare a companion object inside your class, you'll be able to call its members with the same syntax as calling static methods in Java/C#, using only the class name as a qualifier.

