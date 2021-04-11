import com.yc.biz.Calculator;
import com.yc.junit.MyAfter;
import com.yc.junit.MyAfterClass;
import com.yc.junit.MyBefore;
import com.yc.junit.MyTest;


public class MyCalculatorTest {
    private Calculator cal; //待测试的单元
    

    @MyBefore
    public static void bc() {
        System.out.println("beforeclass");
    }

    @MyBefore   //执行测试方法前要调用的
    public void setUp() throws Exception {
        System.out.println("before");
        cal = new Calculator();
    }

    @MyAfter  //执行测试方法后要调用的
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @MyAfterClass
    public static void ac() {
        System.out.println("AfterClass");
    }

    @MyTest
    public void add() {
        System.out.println("add测试");
    }

    @MyTest
    public void sub() {
        System.out.println("sub测试");
    }

}
