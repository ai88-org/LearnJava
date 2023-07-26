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