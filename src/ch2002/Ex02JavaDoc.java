package ch2002;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * javaDoc Class
 * <Br>
 * Copyright 2022. 이신만 <rnqooqw@gmail.com> All rights reserved.
 *@author rnqooqo
 *@version 1.0
 *@since 2022. 11. 25
 *
 */
public class Ex02JavaDoc {
	private String title;
	private String description;
	
	/**
	 * 
	 * @return 자바 문서 제목 리턴
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 제목 설정
	 * 
	 * @param title 자바 문서 제목
	 * @deprecated 구버전이므로 사용 금지.
	 */
	@Deprecated
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 제목, 설명을 동시에 설정
	 * 
	 * @param title 자바 문서 제목
	 * @param description 자바 문서 설명
	 */
	public void setTitle(String title, String description) {
		this.title = title;
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Ex02JavaDoc [title=" + title + ", description=" + description + "]";
	}
	
	@TestAnnotation("abc")
	public static void printVersion() {
		System.out.println("v1.0");
	}
	
}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestAnnotation {
	String value();
}
