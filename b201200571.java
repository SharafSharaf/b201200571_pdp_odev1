import java.util.ArrayList;
import java.util.Arrays;



class Block{
     
    private int previousHash;
    private String [] transacitons;
    
    private int blockHash;
    
    
    public Block(int previousHash , String [] transacitons){
    
    this.previousHash=previousHash;
    this.transacitons = transacitons ;
    
    Object[] contens=
    {Arrays.hashCode(transacitons), previousHash};
    this.blockHash=Arrays.hashCode(contens);
        
    }
    
    
    public int getPreviousHash(){
        return previousHash;
    }
    
    public String[]getTransactions() {
        return transacitons;
    }
    
    public int getBlockHash(){
        return blockHash;
    }
    
}

public class Main{
    
    /*
    
    Hash=digital singuature
    Each block will have :
    
    list of transaciton
    previous Hash
    
    Hash
    
    */
    
    ArrayList<Block> blockchain=new ArrayList<Block>();
    
    public static void main(String [] args){
        
        String [] genesisTransactions={"bashar sent ahmet 10 dollar","ahmet sent bim 10 dollars "};
        Block genesisBlock=new Block (0, genesisTransactions);
        
        String [] block2transactions={"basahr sent 10 bitcoin to huseyn","huseyn sent 10 dollar to starbucks"};
        Block block2 =new Block(genesisBlock.getBlockHash() , block2transactions);
        String [] block3transactions={"bashar sent 20 bitcoin to mehmet"};
        Block block3 =new Block(block2.getBlockHash() , block3transactions);
        
        System.out.println("hash of genesis block : ");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("hash of block 2");
        System.out.println(block2.getBlockHash());
        System.out.println("hash of block 3");
        System.out.println(block3.getBlockHash());
        
        // String [] list1={"a","b","c"};
        // String [] list2={"a","b","c"};
        // //Bölmeye çalıştığımız matrisler
        
        // System.out.println(Arrays.hashCode(list1));
        // System.out.println(Arrays.hashCode(list2));
        
        // String [] list3={"aa","b","c"};
        // System.out.println(Arrays.hashCode(list3));
        //Burada blok zincirinin temel prensibi ve bir bloğun değişmesiyle diğer blokların nasıl değiştiği ortaya çıktı.
    }
    
    
}
    