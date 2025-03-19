public class Laptop extends Device{
    private String laptopType;
    public Laptop(String nameOfOwner, String size, String laptopType)
    {
        super(nameOfOwner,size);
        {
            this.laptopType = laptopType;
        }
    }
    private void playLaptopOnlyGames()
    {
        System.out.println(nameOfOwner + "'s Laptop can play Laptop Only Games!");
    }
}
