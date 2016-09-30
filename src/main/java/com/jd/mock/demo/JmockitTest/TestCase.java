package com.jd.mock.demo.JmockitTest;

import mockit.Mock;
import mockit.MockUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
    @Test
    public void test_IStudentService(){
        MockUp<IStudentService> proxyStub = new MockUp<IStudentService>(){
            @Mock
            // 需要使用@Mock标记,否则jmockit不会处理;
            // 而且方法的签名必须与接口中方法签名一致，否则jmockit会报错
            public String getName(int id){
                return "00"+id;
            }
            @Mock
            public int getAge(int id){
                return id;
            }
        };
        IStudentService mockInstance = proxyStub.getMockInstance();
        Assert.assertEquals("001", mockInstance.getName(1));
        System.out.println(mockInstance.getName(3));
        Assert.assertEquals(1, mockInstance.getAge(1));
        System.out.println(mockInstance.getAge(10));
    }
}
