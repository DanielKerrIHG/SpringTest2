
package com.ihg;
import java.io.IOException;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;


/**
 *
 * @author kerrda
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")

public class MockitoTest {
    
    @Test 
    public void errorReceiveTest() throws IOException{        
        Connection mockedConnection = mock(Connection.class);
        when(mockedConnection.receive()).thenThrow(new IOException());
        try{
            mockedConnection.send("Test Message");
        }catch(IOException e){
         System.out.println("SENDING IO EXCEPTION!");
        }
        
        try{
            String message = mockedConnection.receive();
            System.out.println(message);
        }catch(IOException i){
            System.out.println("RECEIVING IO EXCEPTION!");
        }
    }
    
    
    
    @Test
    public void receiveTest() throws IOException{
        Connection connection = new Connection();
        String testRec = connection.receive();
        assertThat(testRec, is(equalTo("HELLO")));
    }
        

}
