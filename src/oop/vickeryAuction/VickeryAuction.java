package oop.vickeryAuction;

public class VickeryAuction {
    private String product;
    private int realPrice;
    Participant[] arr = new Participant[100]; //?
    private int current=0; //кол-во записавшихся

    public VickeryAuction(String product, int realPrice){
        if(product.length()!=0)
            this.product = product;
        if(realPrice>0)
            this.realPrice = realPrice;
    }
    //check free place in arr
    public int getFreeInd(){
        int freeIndex = -1;
        int i;
        boolean flag=true;
        for(i=0; i<this.arr.length && flag; i++){
            if(this.arr[i]==null){
                flag = false;
                freeIndex = i;
            }
        }
        return freeIndex;
    }
    //add participant in arr
    public boolean addParticipantInArr(Participant p){
        int freeIndex = getFreeInd();
        boolean isFreeIndex = freeIndex != -1;
        boolean successful = false;
        if(p.getPrice()>=this.realPrice*1.5 && isFreeIndex){
            arr[freeIndex]=p;
            successful=true;
            this.current++;
        }
        return successful;
    }

    public Winner win(){
        int maxPrice, preMaxPrice=0, maxIndex=0;
        int i;
        if(this.current>1){
            maxPrice=this.arr[0].getPrice();
            for(i=1; i<current;i++){
                if(this.arr[i].getPrice()>maxPrice){
                    preMaxPrice = maxPrice;
                    maxPrice = this.arr[i].getPrice();
                    maxIndex=i;
                }else if(this.arr[i].getPrice()>preMaxPrice){
                    preMaxPrice=this.arr[i].getPrice();

                }
            }
        }
        return new Winner(this.arr[maxIndex].getName(), preMaxPrice);
    }
}
