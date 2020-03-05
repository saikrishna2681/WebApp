package info.java;
 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
 
public class MyServletTest {
 
    @Mock
    HttpServletRequest request;
 
    @Mock
    HttpServletResponse response;
 
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
 
    @Test
    public void testGetConnection() throws SQLException {
     SampleServlet myServlet =new SampleServlet();
       assertEquals(DriverManager.getConnection()!=null);
    }
 
   
}
