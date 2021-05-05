package BeanException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeanExceptionTest {
    BeanException beanException;
    @BeforeEach
    void beforeEach(){
        beanException=new BeanException();
    }
@AfterEach
    void afterEach(){
        beanException=null;
}
@Test
    void beanExceptionClassCanTakeInConstructor(){

}

}
