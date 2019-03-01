package edu.lu.uni.serval.dataprepare;

public interface ClassFilter {
	boolean acceptClass(Class<?> clazz);

	boolean acceptClassName(String className);

	boolean acceptInnerClass();

	boolean searchInJars();
}
