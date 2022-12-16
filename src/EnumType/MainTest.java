package EnumType;

public class MainTest {
    public static void main(String[] args) {
        useConstantMethod(1);
        useConstantMethod(2);
        useConstantMethod(3);
        useConstantMethod(4);
        useConstantMethod(100);
        useConstantMethod(6);   //===>  CTE vermedi
        System.out.println("------------------------------");
        enumYapida(TransactionType.DEPOSIT);
        enumYapida(TransactionType.PAYMENT);
        enumYapida(TransactionType.WITHDRAW);
        enumYapida(TransactionType.TRANSFER);
        enumYapida(TransactionType.OTHER);
//        enumYapida(TransactionType.A);  ==>  CTE Veriyor
    }
    //eski tarz
    private  static void useConstantMethod(int i){
        if (i==TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is deposit");
        } else if (i==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is withdraw");
        } else if (i==TransactionTypeConstant.TRANSACTION) {
            System.out.println("Money is transaction");
        } else if (i==TransactionTypeConstant.PAYMENT) {
            System.out.println("Money is payment");
        } else if (i==TransactionTypeConstant.OTHER) {
            System.out.println("Money is Other");
        }
    }

    // enum yapida

    private static void enumYapida(TransactionType transactionType){
        if (transactionType == TransactionType.DEPOSIT) {
            System.out.println("Money is deposit");
        } else if (transactionType == TransactionType.WITHDRAW) {
            System.out.println("Money is withdraw");
        } else if (transactionType == TransactionType.TRANSFER) {
            System.out.println("Money us transaction");
        } else if (transactionType == TransactionType.PAYMENT) {
            System.out.println("Money is payment");
        } else if (transactionType == TransactionType.OTHER) {
            System.out.println("Money is Other");
        }
    }

}
