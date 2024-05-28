public class TASK2 {
    public static void main(String[] args) {
        int  fertittaCenterCapacity =  7035, ticketsAmountSold = 7034, ticketsMaximumSold = 7035;
        boolean stillTicketsForSold = ticketsAmountSold < fertittaCenterCapacity;
        boolean soldOut = ticketsMaximumSold > fertittaCenterCapacity;
        System.out.println("Still have tickets for sell. Please hurry up! "+ stillTicketsForSold);



    }
}
