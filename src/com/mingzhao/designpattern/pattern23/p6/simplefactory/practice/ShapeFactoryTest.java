package com.mingzhao.designpattern.pattern23.p6.simplefactory.practice;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import com.mingzhao.designpattern.util.XMLUtil;

public class ShapeFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

/*	@Test
	public void test() {
		//配置文件配置已有类名
		String type = XMLUtil.getType();
		Shape shape = ShapeFactory.getShape(type);
		assertEquals("Circular", shape.getClass().getName());
		shape.draw();
		shape.erase();
	}*/
	@Test
	public void shapeNotExist(){
		//配置文件配置没有的类名
		String type = XMLUtil.getType();
		Shape shape = ShapeFactory.getShape(type);
		if(shape == null ){
			System.out.println("UnSupportedShapeException");
		}
		assertEquals(null, shape);
	}

}
