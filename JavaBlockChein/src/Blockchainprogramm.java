import java.util.ArrayList;
import java.util.Arrays;

public class Blockchainprogramm {
    public static void main(String[] args) {
        String statement1 = "Meine Welt ist perfect  ";
        int hashvalue = statement1.hashCode();
        System.out.println("Statement = " + statement1 + "whose hash value = " + hashvalue);

        String [] list1  = {"Alex", "Emmy", "Olga"};
        String [] list2  = {"Krys", "Serg", "Ivan"};

        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        System.out.println("hash 1 = " + hash1 + " hash 2 = " + hash2);

        ArrayList<Block> blockChain = new ArrayList<>();

        //block one
        String[] intialValues = {"Shad has $700", "Miguel has $550"};
        Block firstBlock = new Block(intialValues, 0);
        blockChain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());

        //block two
        String[] schadGivesItAway = {"Shad gives Tim $40", "Shad gives Tany $60 ", "Shad gives Terry $80"};
        Block secondBlock = new Block(schadGivesItAway, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("second block is " + secondBlock.toString());
        System.out.println("The block chain is " + blockChain.toString());

        //block three
        String[] shadGetsSomeBack = {"Tim gives Shad $10", "Terry gives $50 to shad"};
        Block thirdBlock = new Block(shadGetsSomeBack, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("Third chain is " + blockChain.toString());
    }
}