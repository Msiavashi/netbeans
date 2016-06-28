package FPU;

import HBDMIPS.EXE_MEM;
import HBDMIPS.ID;
import HBDMIPS.ID_EXE;
import HBDMIPS.IF;

/**
 * Created by mohammad on 6/27/2016.
 */
public class A2_A3 {
    public A1_A2 a1_a2 = null;
    public A2_A3 a2_a3 = new A2_A3();

    public A2_A3(A1_A2 a1_a2){
        this.a1_a2 = a1_a2;
    }

    String controlBits;
    int PC;
    float RS_DATA;
    float RT_DATA;
    float RD;
    float RT;

    float max1;
    float max2;

    public float getMax1() {
        return max1;
    }

    public void setMax1(float max1) {
        this.max1 = max1;
    }

    public float getMax2() {
        return max2;
    }

    public void setMax2(float max2) {
        this.max2 = max2;
    }

    public A1_A2 getA1_a2() {
        return a1_a2;
    }

    public void setA1_a2(A2_A3 a1_a2) {
        this.a1_a2 = a1_a2;
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

    public void setA1_a2(A1_A2 a1_a2) {
        this.a1_a2 = a1_a2;
    }
}
