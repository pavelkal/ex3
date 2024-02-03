package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	//
	@Test
  
	public void equilateralTriangle1(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void test1() {
		int a=5;
		int b=3;
		int c=1;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test2() {
		int a=12;
		int b=5;
		int c=5;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test3() {
		int a=5;
		int b=15;
		int c=5;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test5() {
		int a=3;
		int b=3;
		int c=10;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test9() {
		int a=5;
		int b=7;
		int c=8;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Scalene.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test10() {
		int a=5;
		int b=7;
		int c=7;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test11() {
		int a=3;
		int b=5;
		int c=3;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test13() {
		int a=7;
		int b=7;
		int c=4;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
	@Test
	public void test16() {
		int a=6;
		int b=6;
		int c=6;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.equilateral.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected,result.toString());
	}
}  