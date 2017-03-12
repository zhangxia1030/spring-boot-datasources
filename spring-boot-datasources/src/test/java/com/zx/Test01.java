package com.zx;

import java.util.List;

import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.test.context.SpringBootTest;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zx.Application;
import com.zx.entity.test1.User1;
import com.zx.service.TestService1;


@RunWith(SpringJUnit4ClassRunner.class)  
@EnableTransactionManagement   //开启事物
@SpringBootTest(classes=Application.class)// 指定spring-boot的启动类   
//@SpringApplicationConfiguration(classes = Application.class)// 1.4.0 前版本 
public class Test01 {
	
	@Autowired  
    private TestService1 test1;  
	
	//private Druiddatasource source;


    //@Test  
    public void add()  {  
    	User1 u1 = new User1();
    	u1.setNo(101);
    	u1.setName("zx");
    	u1.setMessage("Hello World");
    	
    	test1.insert(u1);
    }  
    
    //@Test  
    public void update()  {  
    	User1 u1 = new User1();
    	u1.setNo(100);
    	u1.setName("zx1");
    	u1.setMessage("Hello World!!!");
    	
    	test1.update(u1);
    }  
    
    //@Test  
    public void del()  {  
    	test1.delete(10);
    }  
    
    @Test  
    public void select()  {  
    	User1 u1 = test1.getOne(100);
    	System.out.println(u1.toString());
    }  
    
    @Test  
    public void selectAll()  {  
    	List<User1> list = test1.getAll();
    	System.out.println(list.toString());
    }  

}
