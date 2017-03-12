package com.zx;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zx.entity.test2.User2;
import com.zx.service.TestService2;


@RunWith(SpringJUnit4ClassRunner.class)  
@EnableTransactionManagement   //开启事物
@SpringBootTest(classes=Application.class)// 指定spring-boot的启动类   
//@SpringApplicationConfiguration(classes = Application.class)// 1.4.0 前版本 
public class Test02 {
	
	@Autowired  
    private TestService2 test2;  
	
    @Test  
    public void add()  {  
    	User2 u1 = new User2();
    	u1.setNo(100);
    	u1.setName("zx");
    	u1.setMessage("Hello World");
    	
    	test2.insert(u1);
    }  
    
    //@Test  
    public void update()  {  
    	User2 u1 = new User2();
    	u1.setNo(100);
    	u1.setName("zx1");
    	u1.setMessage("Hello World!!!");
    	
    	test2.update(u1);
    }  
    
    //@Test  
    public void del()  {  
    	test2.delete(10);
    }  
    
    @Test  
    public void select()  {  
    	User2 u1 = test2.getOne(100);
    	System.out.println(u1.toString());
    }  
    
    @Test  
    public void selectAll()  {  
    	List<User2> list = test2.getAll();
    	System.out.println(list.toString());
    }  

}
