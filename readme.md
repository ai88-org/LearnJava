# JAVA 基础

## 第一章 Hello World

[代码](src/main/java/org/ai88/chapter01/HelloWorld.java)

## 第二章 基础数据类型

### 2.1 整型

| 类型    | 占用字节 | 表示范围               |
|-------|------|--------------------|
| byte  | 1    | -128~127           |
| short | 2    | -2^15~2^15-1       |
| int   | 4    | -2^31~2^31-1(约21亿) |
| long  | 8    | -2^63~2^63-1       |

- long类型变量赋值需要在字面量后面加**l**或者**L**
- 一般开发中，使用int

### 2.2 浮点型
- float 4个字节 字面量定义方式跟float差不多，float f1 = 12.45f
- double 8个字节 开发中一般使用这个

如果需要更高的精度，可以使用`BigDecimal`这个类

[代码](src/main/java/org/ai88/chapter02/TestVariable2.java)

### 2.3 字符型

**char** 
- 占据两个字节
- java中字符都是unicode，unicode都是两个字节，包括中utf8中三个字节表示的汉字，所以char也可以表示汉字
- char类型可以直接计算，是其所对应的unicode编码序号直接参与计算的
- char用''表示，里面必须且只能有一个字符
[代码](src/main/java/org/ai88/chapter02/TestChar.java)

### 2.4 布尔类型

**boolean**
- 只有两个值 `true`和`false`，不能用0,1表示，和其他语言有一些区别
- 一般我们不谈布尔类型占用空间大小。非要谈的话，就是占用4个字节大小

### 2.5 自动类型提升

**可以做运算的基本数据类型有7种，不包含布尔类型**

- 当容量小的变量与容量大的做运算的时候，结果自动转换成容量大的数据类型
- 这里的容量大小指的是表示数的范围大小。例如long(8字节)，float(4字节)，两者做运算，结果自动转换成float类型，因为float类型表示数的范围更大
- 做个现实生活中的类比：搬家的话，从小房子搬到大房子特别好搬。小房子里面的东西怎么都能放得下。但是从大房子搬到小房子，可能就需要舍弃一些物品了
- byte、short、char、int --> long --> float --> double
- byte 、short、char、int类型变量做运算，结果自动转换成int
- 有这样的要求，猜测是byte、short太容易溢出出错了，编译器直接替我们检查了
- 整型常量都会被当作int类型
- 浮点型常量会被当作double类型

[代码](src/main/java/org/ai88/chapter02/AutomaticTypePromotion.java)

### 2.6 强制类型转换

- 容量大的数据类型变量转换成容量小的数据类型变量，需要使用强制类型转换
- 强制类型转换需要使用强转符
- 可能会丢失数据

[代码](src/main/java/org/ai88/chapter02/TypeCasting.java)

### 2.7 String类型

- 引用类型
- 与8种基本数据类型做连接运算，"+"
- 运算的结果是String类型

### 2.8 进制

- 二进制 加上`0b` ob01
- 八进制 加上`0` 071
- 十进制
- 十六进制 加上`0x` 0xff
- 计算机底层数据以二进制补码的方式存储
- 正数的补码、反码、原码都一样
- 负数的原码取反-->反码-->加1-->补码

### 2.9 逻辑运算符

- &、&&、|、||

[代码](src/main/java/org/ai88/chapter02/LogicTest.java)

### 2.10 位运算符

- << >> >>> & | ^ ~
- 都是针对数值类型的变量或者常量
- << : 每向左移动一位，则在原先基础上乘以2

[代码](src/main/java/org/ai88/chapter02/BitTest.java)

### 2.11 条件运算符

- (条件表达式)? "表达式1" : "表达式2"
- 表达式1和表达式2需要相同的类型或者能兼容的类型

## 第三章 流程控制

- 条件控制
  - if...else...
  - switch...case...
- 循环控制
  - for
  - while
  - do...while...

## 项目一 谷粒记账软件

## 第四章 数组(Array)

- 概念：多个相同数据类型，按照一定顺序排列的集合。使用一个名字命名。并通过编号的方式对这些数据进行统一管理。
- 存储在内存中，连续的一块空间
- 引用数据类型
- 有序的
- 一维数组的使用
  - 一维数组的使用和初始化
    - String[] arr = {"a","b"}; 声明且初始化
    - String[] arr = new String[2]; 声明未初始化
  - 调用数组的指定元素
  - 数组的属性，length表示长度
  - 数组的遍历
  - 数组元素的默认初始化值
    - 整型 0
    - 浮点型 0.0
    - 布尔类型 false
    - 引用类型 null
    - 字符型 0 或者 '\u0000' ascii码值

### 4.1 一维数组内存解析
- JVM运行时，将内存划分为5个区域：
  - 堆
  - 程序计数器
  - 虚拟机栈
  - 方法区
  - 本地方法栈
  
- 与目前数组相关的结构 int[] arr = new int[]{1,2,3,4,5}
  - 堆 用于存放数组的实体，比如这里的 1,2,3,4,5
  - 虚拟机栈 用于存放方法中声明的局部变量 arr

### 4.2 数组常见算法
- 数值型数组特征值统计
  - 平均值
  - 最大值
  - 最小值
  - 总和
- 数组元素赋值
- 数组的复制
- 数组的反转

## 第五章 面向对象

### 5.1 对象在内存中分配涉及到的内存结构
- 栈：方法内定义的变量
- 堆：new出来的结构，对象中的属性
- 方法区：存放类的模板

### 5.2 局部变量和属性的默认值
- 属性都有默认初始化值，不显示的初始化也没关系
- 局部变量必须初始化，否则无法通过编译

### 5.3 对象的方法
- 方法中不能再定义方法

### 5.4 方法的重载
- 方法名一样，形参列表一样（参数类型，参数个数），就会被编译器认为是一样的方法。
- 注意，编译器不会管返回值

### 5.5 可变个数形参的方法
- 可变个数形参在调用时，针对可变形参赋的实参个数可为：0个、1个或者多个
- 可变个数形参的方法与同一个类中，同名的多个方法之间可以构成重载
- 特例：可变个数形参的方法与同一个类中方法名相同，且可变参数类型相同的数组，会冲突
- 可变个数的形参必须声明在参数列表的最后，(int ... num ,String a) 就是错误的。(String a,int ... num )

### 5.6 构造器
- 一旦开发人员自己显示声明构造器，则默认提供的无参构造器将失效，如果需要用到无参构造器，需要自己再声明一个

## 接口

>  接口的本质是一种规则，需要所以人去遵守。

- 关键字：`interface`

- 接口内部结构说明：

  - 不可以声明：构造器，静态方法
  - 可以声明：
    - 属性：必须使用public static final修饰
    - 方法：
      - jdk8之前，声明使用public abstract
      - jdk8声明静态方法，默认方法
      - jdk9声明私有方法

- 接口与类的关系：实现关系

- 格式class A extends SuperA implements B,C{}

- 一个类可以实现多个接口

- 一定程度上弥补了单继承的局限性

- 类必须实现接口中所有的抽象方法（重写），否则此类为抽象类。

- 接口与接口的关系：继承关系，且可以多继承？？

- 接口的多态性 接口名 变量名 = new 实现类对象

- 接口与抽象类，都有抽象方法，都不能实例化。但是抽象类一定有构造器，因为抽象类要被继承。

  

  

  

  



