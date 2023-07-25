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


