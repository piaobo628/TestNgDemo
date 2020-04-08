import org.testng.Assert;
import org.testng.annotations.*;


public class testNg {

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClase");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    //测试执行的优先级priority，0>1>2>3
    @Test(priority =1)
    public void testcase1(){
        Assert.assertEquals(1,1);
        System.out.println("test01");
    }

    @Test(priority =0)
    public void testcase2(){
        Assert.assertTrue(true);
        System.out.println("test02");
    }

    //测试脚本跳过配置enabled,false代表跳过，true代表不跳过
    @Test(priority =0,enabled = true)
    public void testcase3(){
        Assert.assertEquals("执行成功","执行成功");
        System.out.println("执行成功----------------------------");
    }

    // @Parameters必须写在@Test前面
    @Parameters({"parameter1","parameter2"})
    @Test
    /**
     * 也可以用@Test(parameter={"parameter1","parameter2"})
     *
     * **/
    public void testcase4(String parameter1,String parameter2){
        Assert.assertEquals("1","1");
        System.out.println("第一个参数是："+parameter1+",第二个参数是："+parameter2);
    }

    @DataProvider(name="user")
    public Object[][] getStr(){
        return new Object[][]{
                {"","","账户不能为空"},
                {"admin","","密码不能为空"},
                {"admin","123","密码错误"}
        };
    }

    @Test(dataProvider = "user")
    private void sout(String uname,String pword,String msg){
        System.out.println(uname+"->"+pword+"->"+msg);
    }
}
