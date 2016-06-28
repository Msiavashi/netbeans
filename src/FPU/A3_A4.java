package FPU;

/**
 * Created by mohammad on 6/28/2016.
 */
public class A3_A4 {

    public A1_A2 a1_a2 = null;
    public A2_A3 a2_a3 = null;
    public A3_A4 a3_a4 = new A3_A4();

    public A3_A4(A2_A3 a2_a3m A1_A2 a1_a2){
        this.a2_a3 = a2_a3;
        this.a1_a2 = a1_a2;
    }

    String controlBits;
    int PC;
    float RS_DATA;
    float RT_DATA;
    float RD;
    float RT;

    public A1_A2 getA1_a2() {
        return a1_a2;
    }

    public void setA1_a2(A1_A2 a1_a2) {
        this.a1_a2 = a1_a2;
    }

    public A2_A3 getA2_a3() {
        return a2_a3;
    }

    public void setA2_a3(A2_A3 a2_a3) {
        this.a2_a3 = a2_a3;
    }

    public A3_A4 getA3_a4() {
        return a3_a4;
    }

    public void setA3_a4(A3_A4 a3_a4) {
        this.a3_a4 = a3_a4;
    }

    public String getControlBits() {
        return controlBits;
    }

    public void setControlBits(String controlBits) {
        this.controlBits = controlBits;
    }

    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }

    public float getRS_DATA() {
        return RS_DATA;
    }

    public void setRS_DATA(float RS_DATA) {
        this.RS_DATA = RS_DATA;
    }

    public float getRT_DATA() {
        return RT_DATA;
    }

    public void setRT_DATA(float RT_DATA) {
        this.RT_DATA = RT_DATA;
    }

    public float getRD() {
        return RD;
    }

    public void setRD(float RD) {
        this.RD = RD;
    }

    public float getRT() {
        return RT;
    }

    public void setRT(float RT) {
        this.RT = RT;
    }
}
