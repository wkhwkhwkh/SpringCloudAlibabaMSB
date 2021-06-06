package com.utan;

import java.lang.annotation.*;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 注解声明时@interface
 */

@Retention(RetentionPolicy.SOURCE) //生命周期 编译后不会保留在源文件中
//@Retention(RetentionPolicy.RUNTIME) 运行时有效
//@Retention(RetentionPolicy.CLASS) //字节码文件有效  默认就是该状态
@Target(ElementType.TYPE) //只能在类上面修饰  //声明该注解可以在注在什么地方  类  属性 方法 构造器等
@Inherited //具有继承性
public @interface MyAnnotation {
    String [] value();//有参数称为元数据
}
