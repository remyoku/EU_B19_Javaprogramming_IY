package day49_Interface_Enum_DataClass.Enumaration;

public enum C07_Device {

    Redmi_8("3kl35lk","12","Xiaomi8","Android"),
    NokiaLumia("452563","14","Nokia_Lum","Windows");

    private String udid;
    private String version;
    private String deviceName;
    private String platformName;

    C07_Device (String udid,String version,String deviceName,String platformName){
        this.udid=udid;
        this.deviceName=deviceName;
        this.version=version;
        this.platformName=platformName;
    }

    public String getUdid() {
        return udid;
    }

    public String getVersion() {
        return version;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getPlatformName() {
        return platformName;
    }
}
