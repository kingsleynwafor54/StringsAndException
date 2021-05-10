package BeanException;

public class MavenMobilePhone {
    private String imei;
    private PhoneManufacturer make;
    private String model;
    private int storageSpace;
    private Connection counter;
    private static int  simCardSlot;

    public  int getSimCardSlot() {
        return simCardSlot;
    }

    public static void setSimCardSlot(int simCardSlot) {
        MavenMobilePhone.simCardSlot = simCardSlot;
    }

    private static final String INVALID_IMEI="INVALID_IMEI";
    private MavenMobilePhone(){

    }
    public MavenMobilePhone(String imeiNumber){
        if(imeiNumber==" "){
            this.imei="INVALID_IMEI-_NUMBER";
        }
      else
          this.imei=imeiNumber;
    }
public MavenMobilePhone(String imeiNumber,PhoneManufacturer phoneMake){
        this(imeiNumber);
        //make=phoneMake;
}
    public MavenMobilePhone(String imeiNumber, PhoneManufacturer phoneMake, String phoneModel){
        this(imeiNumber,phoneMake);
        make=phoneMake;
    }
    public MavenMobilePhone(String imeiNumber,PhoneManufacturer phoneMake, int storageSpace , String phoneModel){
        this(imeiNumber,phoneMake,phoneModel);
        make=phoneMake;
        model=phoneModel;
    }
    public MavenMobilePhone(String imeiNumber, PhoneManufacturer phoneMake, int storageSpace){
        this(imeiNumber);
        make=phoneMake;

    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public PhoneManufacturer getMake() {
        return make;
    }

    public void setMake(PhoneManufacturer make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }
public Connection makeCall(){
        Connection theCall=new Connection();
        return theCall;
}
}
