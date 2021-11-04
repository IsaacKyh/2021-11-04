import java.io.Serializable;

public class Add  implements Serializable {


    private final int numA;
    private final int numB;

//    private final int sum;

    public Add(int inNumA, int inNumB
//               ,int inSum
    ) {
        numA = inNumA;
        numB = inNumB;

//        sum = inSum;
    }

    @Override
    public String toString() {
        return numA + "+" + numB
//                + "=" + sum
                ;
    }
}
