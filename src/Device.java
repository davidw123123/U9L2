public class Device {
    public String size;
    public String nameOfOwner;
    public Device(String nameOfOwner, String size)
    {
        this.nameOfOwner = nameOfOwner;
        this.size = size;
    }
    public void isRunning(){
        System.out.println(nameOfOwner + "'s device is running!");
    }
}
