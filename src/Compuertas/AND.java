package Compuertas;

public class AND extends Compuerta{

    public boolean CalcularEntradas() {
        boolean valueInput1 = false;
        boolean valueInput2 = false;
        if(this.input1!=null) {
            valueInput1 = this.input1.CalcularEntradas();
        }  else{
            valueInput1 = this.valueInput1;

        }
        if(this.input2!=null){
            valueInput2 = this.input1.CalcularEntradas();
        }  else{
            valueInput2 = this.valueInput2;
        }
        return valueInput1 && valueInput2;
    }

    public void setValueInput1(boolean valueInput1) {
        this.valueInput1 = valueInput1;
    }

    public void setValueInput2(boolean valueInput2) {
        this.valueInput2 = valueInput2;
    }

    public void setInput1(Compuerta input1) {
        this.input1 = input1;
    }

    public void setInput2(Compuerta input2) {
        this.input2 = input2;
    }
    public static void main(String args[]){
        Compuerta comp1 = new AND();
        Compuerta comp2 = new AND();
        comp1.setValueInput1(true);
        comp1.setValueInput2(true);
        comp2.setValueInput1(false);
        comp2.setValueInput2(false);
        comp1.setInput1(comp2);
        System.out.println(comp1.CalcularEntradas());

    }
}