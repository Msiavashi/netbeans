package FPU;

/**
 * Created by mohammad on 6/28/2016.
 */
public class A3 {
    public A3_A4 a3_a4 = new A3_A4();
    public A2_A3 a2_a3 = null;

    public A3(A2_A3 a2_a3){
        this.a2_a3 = a2_a3;
    }

    private boolean isSmaller(int num1, int num2){
        if (num1 < num2){
            return true;
        }
        return false;
    }

    private float shiftRight(int num1){
        num1 = num1 >> 1;
    }

    private float shiftLeft(int num2){
        num2 = num2 << 1;
    }

    private void adjustNumbers(int signal, int num){
        if(signal == 1){
            shiftLeft(num);
        }
        else{
            shiftRight(num);
        }
    }

    private int increament(int num){
        return num + 1;
    }

    private int decreament(int num){
        return num - 1;
    }

    private String getSignBit(int num){
        return String.valueOf(Integer.toString(num, 2).charAt(0));

    }

    private int incOrDec(int signal, int num){
        if (signal == 1){
            return increament(num);
        }
        else{
            return decreament(num);
        }
    }

    public void startStage(){
        adjustNumbers(0, mux(a3_a4.max1Signal, a3_a4.mux2In2, a3_a4.mux1In2));
        if (a3_a4.incOrDecSignal == 1){
            increament(mux(a3_a4.mux2Signal, a3_a4.in1, a3_a4.in2));
        }
    }
}
