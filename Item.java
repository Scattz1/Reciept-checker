public class Item {

    private int ID;
    private float price;
    private int qty = 1;
    private boolean VAT;
    private String name;
    private float weight; //Assuming to be measured in KG
    private float totalprice;


    Item(int ID, float price, boolean VAT, String name, float weight)
    {
        this.ID = ID;
        this.price = price;
        this.VAT = VAT;
        this.name = name;
        this.weight = weight;
        this.totalprice = this.qty * this.price;
    }

    Item(int ID, float price, boolean VAT, String name, float weight, int qty)
    {
        this.ID = ID;
        this.price = price;
        this.VAT = VAT;
        this.name = name;
        this.weight = weight;
        this.totalprice = this.qty * this.price;
        this.qty = qty;
    }

    private void calctotal()
    {
        this.totalprice = this.qty * this.price;
    }

    public int getID()
    {
        return this.ID;
    }
    public float getPrice()
    {
        return this.price;
    }
    public int getQuantity()
    {
        return this.qty;
    }
    public boolean getVAT()
    {
        return this.VAT;
    }
    public String getName()
    {
        return this.name;
    }
    public float getWeight()
    {
        return this.weight;
    }

    public void incQuantity()
    {
        this.qty ++;
        calctotal();
    }
    public void decQuantity()
    {
        this.qty --;
        calctotal();
    }

}
