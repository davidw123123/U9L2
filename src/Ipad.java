public class Ipad extends Device{
    private String ipadType;
    public Ipad(String nameOfOwner, String size, String ipadType)
    {
        super(nameOfOwner,size);
        this.ipadType = ipadType;
    }
    private void playIpadOnlyGames()
    {
        System.out.println(nameOfOwner + "'s Ipad can play Ipad Only Games!");
    }
}
