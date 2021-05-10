package BeanException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionAndDecryptionTest {
    EncryptingAndDecryptingMessage encryptingAndDecryptingMessage;
    @BeforeEach
    void setUp() {
        encryptingAndDecryptingMessage=new EncryptingAndDecryptingMessage();
    }

    @AfterEach
    void tearDown() {
     encryptingAndDecryptingMessage=null;
    }
@Test
    void EncryptingAndDecryptingMethodCanTestForEncryption(){
        assertEquals(1290,encryptingAndDecryptingMessage.encryptingMessage(2345));
        assertEquals(6789,encryptingAndDecryptingMessage.encryptingMessage(1290));
}
    @Test
    void EncryptingAndDecryptingMethodCanTestForDecryption(){
        assertEquals(2345,encryptingAndDecryptingMessage.decryptingMessage(1290));
        assertEquals(1290,encryptingAndDecryptingMessage.decryptingMessage(6789));
    }


}
