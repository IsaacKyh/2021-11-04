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



// I used HollowRec before I saw that Add also just have 2 ints if I take away the sums from that class, so I took away sums fom Add
// and made sums a local variable instead. So I could use Add on both HollowRec and Add