package com.tutorial.practise.reflection;

/**
 * Reflection concepts using below packages.
 * 
 * - java.lang 
 * - java.lang.reflect
 * - 
 * 
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.tutorial.practise.reflection.Test.TestSub;

public class TestReflection {
	
	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchFieldException {
		
		//creating the object of a class whose property is to be checked
//		Test testObj = new Test();
		
		//Getting a class object for a test class.
		
		// 1st way
//		Class<? extends Test> clazz = testObj.getClass(); 
		
		// 2nd way
		Class<? extends Test> clazz = Test.class;
		
		// 3rd way
//		Class<?> clazz = Class.forName("com.tutorial.practise.reflection.Test");
		Test testObj = (Test) clazz.newInstance();  //example is JDBC APi uses to get the driver name
		
		
		//get constructors of the test object
		Constructor<? extends Test> constructor = (Constructor<? extends Test>) clazz.getConstructor();
		
		System.out.println(constructor.getParameterTypes());
		System.out.println(constructor.getName());
		
		System.out.println("The public methods of class are : "); 
		
		// Getting methods of the class through the object 
        // of the class by using getMethods 
		Method[] methods = clazz.getMethods();
		
		for(Method m: methods) {
			System.out.println(m.getName());
		}
		
		//calling public method at runtime
		Method method1ToInvoke = clazz.getDeclaredMethod("testMethod1", String.class);
		method1ToInvoke.invoke(testObj, "\"\\nhello invoking you\"");
		
		//calling private method at runtime
		Method method2ToInvoke = clazz.getDeclaredMethod("testMethod2", String.class);
		method2ToInvoke.setAccessible(true);
		method2ToInvoke.invoke(testObj, "\"\\nhello invoking you\"");
		
		//calling method using member variable and assigning member var at runtime
		Field fieldToMethodParam = clazz.getDeclaredField("str");
		fieldToMethodParam.setAccessible(true);//override accessibility
		fieldToMethodParam.set(testObj, "\"Invoking using input string param\"");
		Method method3ToInvoke = clazz.getDeclaredMethod("testMethod3");
		method3ToInvoke.invoke(testObj);
		
		
		//TYPE Field for Primitive Type Wrappers
		System.out.println(Void.TYPE.getName());
		Method[] m3 = Void.TYPE.getMethods();
		System.out.println(void.class.getName());
		
		Class[] classD = clazz.getDeclaredClasses();
		for(Class c:classD)
		System.out.println(c.getName());
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field f: fields) {
			System.out.println(f.getName());
		}
		
		
		Class superClass = TestSub.class.getEnclosingClass();
		System.out.println(superClass.getName());
	}

}


