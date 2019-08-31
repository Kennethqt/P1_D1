package Compuertas;

public class Compuerta {
    protected boolean valueInput1;
    protected boolean valueInput2;
    protected Compuerta input1;
    protected Compuerta input2;
    protected boolean output;

    public Compuerta getInput1() {
        return input1;
    }

    public void setInput1(Compuerta input1) {
        this.input1 = input1;
    }

    public Compuerta getInput2() {
        return input2;
    }

    public void setInput2(Compuerta input2) {
        this.input2 = input2;
    }

    public boolean CalcularEntradas(){
        return false;
    }
    public boolean isInput1() {
        return valueInput1;
    }

    public void setValueInput1(boolean input1) {
        this.valueInput1 = input1;
    }

    public boolean isInput2() {
        return valueInput2;
    }

    public void setValueInput2(boolean input2) {
        this.valueInput2 = input2;
    }

    public boolean isOutput() {
        return output;
    }

    }

