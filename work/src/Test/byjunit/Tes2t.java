package Test.byjunit;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.junit.Test;

import Calculator.implement.Calculator;


public class Tes2t {
@Test
public void testmainprogramming(){
	JFrame calculator =new Calculator();
	calculator.setVisible(true);
	
}
@Test
public void testscreenrequest(){
	JFrame calculator =new Calculator();
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();//获取屏幕分辨率
	calculator.setLocation(screenSize.width/4,screenSize.height/9);
	
}
@Test
public void test33(){
	JFrame calculator =new Calculator();
	calculator.setTitle("计算器");
	
}




}
