### day_05 数组
数组的定义，数组的遍历
数组作为方法的参数和返回值

### day_06 类与对象、封装、构造方法
面向对象编程的三大特性
* 封装
* 继承
* 多态
#### 一、面向对象思想
类是对象的模板，对象是类的实体。

类中定义的方法缺少static修饰符，static修饰符的作用

#### 二、封装
        封装是一个保护屏障，防止该类的代码和数据被随意访问，只有通过指定方式才可以访问，增强了代码的安全性。
封装的步骤：
- 使用 private 关键字来修饰成员变量；
- 对需要访问的成员变量，提供对应的一对 getXxx 方法 、 setXxx 方法。

封装优化1：this关键字

    记住 :方法被哪个对象调用，方法中的this就代表那个对象。即谁在调用，this就代表谁。

封装优化2：构造方法

    无论你与否自定义构造方法，所有的类都有构造方法，因为Java自动提供了一个无参数构造方法， 一旦自己定义了构造方法，Java自动提供的默认无参数构造方法就会失效。
#### 标准代码
    JavaBean 是 Java语言编写类的一种标准规范。符合 JavaBean 的类，要求类必须是具体的和公共的，并且具有无 参数的构造方法，提供用来操作成员变量的 set 和 get 方法。
    
### day_07 Scanner类、Random类和ArrayList类

#### 一、API
API(Application Programming Interface)，应用程序编程接口。

#### 二、Random类
查看类
- java.util.Random :该类需要 import导入使后使用。

查看构造方法
- public Random() :创建一个新的随机数生成器。

查看成员方法
- public int nextInt(int n) :返回一个伪随机数，范围在 0 (包括)和 指定值 n (不包括)之间的
int 值。

#### 三、ArrayList
ArrayList是大小可变的数组的实现，存储在内的数据称为元素

### day_08 String类、static关键字、Arrays类、 Math类

#### 第一章 String类
public int length () :返回此字符串的长度。
public String concat (String str) :将指定的字符串连接到该字符串的末尾。
public char charAt (int index) :返回指定索引处的 char值。
public int indexOf (String str) :返回指定子字符串第一次出现在该字符串内的索引。
public String substring (int beginIndex) :返回一个子字符串，从beginIndex开始截取字符串到字符
串结尾。
public String substring (int beginIndex, int endIndex) :返回一个子字符串，从beginIndex到
endIndex截取字符串。含beginIndex，不含endIndex。

#### 第二章 static关键字
static 关键字，可以修饰变量、方法和代码块。在使用的过程中，其主要目的还是想在不创建对象的情况
下，去调用方法。下面将介绍两个工具类，来体现static 方法的便利。










