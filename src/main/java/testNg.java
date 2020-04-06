import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNg {
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClase");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

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

    @Test(priority =0,enabled = false)
    public void testcase3(){
        Assert.assertEquals("执行成功","执行成功");
        System.out.println("执行成功----------------------------");
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
