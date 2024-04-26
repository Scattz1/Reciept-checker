import java.util.ArrayList;

class checker
{
    private ArrayList<Item> receipt = new ArrayList<>();
    
    public static void main(String args[])
    {

    }


    public void AddItem(int target_id)
    {
        int pos = 0;
        while(pos <= receipt.size())
        {
            if(receipt.get(pos).getID() == target_id)
            {
                receipt.get(pos).incQuantity();
                return;
            }
            pos ++;
        }
        
    }

}
