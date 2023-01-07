package Exercise;

import org.junit.*;

public class exercise_02 {

    // 1. test
    // 2. test
    // 3. test
    // 4. test (gelistirme asamasinda bu yuzden rapora dahil olmasin)
    // Her testimizden once ve sonra calismasi gereken kod bloklarimiz (methodlarimiz) mevcut
    // Tum testlerin oncesinde ve sonrasinda calismasi gereken methodlarimiz mevcut.

    @Test

    public  void test01(){
        System.out.println("1. test yapılıyor ....");
    }
    @Test
    public  void test02(){
        System.out.println("2. test yapılıyor ....");
    }
     @Test
    public  void test03(){
        System.out.println("3. test yapılıyor ....");
    }
    @Test
    @Ignore
    public  void test04(){
        System.out.println("4. test geliştirme aşamasında  ....");
    }
    @Before

    public  void  beforeEach(){

    System.out.println("Method öncesi kod bloğu çalıştı ");
    }
    @After
    public  void afterEach(){
        System.out.println("Method sonrası kod bloğu çalıştı");
    }

    @BeforeClass

    public static void beforeAll(){
        System.out.println("Method öncesindeki kod bloğu çalıştı ");
    }

    @AfterClass
    public static void afterAll(){
        System.out.println("Method sonrasındaki kod bloğu çalıştı");
    }





}

