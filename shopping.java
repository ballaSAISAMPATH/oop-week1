class Item_count_exception extends Exception{
     Item_count_exception(String str){
        System.out.println(str);
    }
}
class Item_mismatched_exception extends Exception{
    Item_mismatched_exception(String str){
        System.out.println(str);
    }
}
class Pin_mismatched_exception extends Exception{
    Pin_mismatched_exception(String str){
        System.out.println(str);
    }
}

public class shopping {
    public static void main(String[] args) throws Item_count_exception,Item_mismatched_exception,Pin_mismatched_exception{
        int items_count_before_check=10,items_count_after_check=11;
        boolean item_mismatched=true,pin_mimatched=true;
        try{
            if(items_count_before_check!=items_count_after_check){
                throw new Item_count_exception("items need to be re_verified!!\n");
            }
        }  catch(Item_count_exception obj) {
            System.out.println("thank you for shopping!!!\n");
        }
        try{
            if(item_mismatched){
                throw new Item_mismatched_exception("items mismatched,please check again!!\n");
            }
        }
        catch(Item_mismatched_exception obj) {
            System.out.println("thank you for shopping!!!\n");
        }
        
        try{
            if(item_mismatched){
                throw new Pin_mismatched_exception("items mismatched,please check again!!\n");
            }
        }
        catch(Pin_mismatched_exception obj) {
            System.out.println("thank you for shopping!!!\n");
        }
    }
}
