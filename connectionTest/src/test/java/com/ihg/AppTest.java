package com.ihg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")

public class AppTest 
   
{
   @Test
   public void connectionManagerObjectTypeTest(){
       ApplicationContext context = 
             new ClassPathXmlApplicationContext("beans.xml");
       ConnectionManager cManager = (ConnectionManager) context.getBean("connectBean");
       assertThat(cManager, is(instanceOf(ConnectionManager.class)));
   }
   
   
}
