package test.com.company.math; 

import com.company.math.Tmath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

/** 
* Tmath Tester. 
* 
* @author <Authors name> 
* @since <pre>10月 11, 2019</pre> 
* @version 1.0 
*/ 
public class TmathTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sum(int a, int b) 
* 
*/ 
@Test
public void testSum() throws Exception {
//TODO: Test goes here...
    Tmath tmath = new Tmath();
    int result = tmath.sum(3,5);
    Assert.assertEquals(8,result);
} 

/** 
* 
* Method: subtraction(int a, int b) 
* 
*/ 
@Test
public void testSubtraction() throws Exception { 
//TODO: Test goes here...
    Tmath tmath = new Tmath();
    int result = tmath.subtraction(3,5);
    Assert.assertEquals(8,result);
} 

/** 
* 
* Method: multiply(int a, int b) 
* 
*/ 
@Test
public void testMultiply() throws Exception { 
//TODO: Test goes here...
    Tmath tmath = new Tmath();
    int result = tmath.multiply(3,5);
    Assert.assertEquals(8,result);
} 

/** 
* 
* Method: division(int a, int b) 
* 
*/ 
@Test
public void testDivision() throws Exception { 
//TODO: Test goes here...
    Tmath tmath = new Tmath();
    int result = tmath.division(3,5);
    Assert.assertEquals(8,result);
} 


} 
