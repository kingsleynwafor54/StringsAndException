package BeanException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static BeanException.MavenMobilePhone.getSimCardSlot;
import static BeanException.MavenMobilePhone.setSimCardSlot;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaveMobilePhoneTest {
    MavenMobilePhone mavenMobilePhone;
    MavenMobilePhone henryPhone;
    @BeforeEach
    void setUp() {
mavenMobilePhone=new MavenMobilePhone("Mikemei",PhoneManufacturer.APPLE);
mavenMobilePhone.setModel("iPhone xs max");
mavenMobilePhone.setStorageSpace(512);
mavenMobilePhone.makeCall();

henryPhone=new MavenMobilePhone("henryiPhone" ,PhoneManufacturer.APPLE,512);
henryPhone.setModel("Techno spack 4");



    }

    @AfterEach
    void tearDown() {
mavenMobilePhone=null;
    }

    @Test
    void showSimCardSlot() {
       // System.out.println("Slot count in Mike's phone is "+mavenMobilePhone.makeCall());
        setSimCardSlot(2);
        assertEquals(2,henryPhone.getSimCardSlot());
        assertEquals("Techno spack 4",henryPhone.getModel());
    }
}
