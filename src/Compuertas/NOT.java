package Compuertas;

public class NOT extends Compuerta {
    public boolean CalcularEntradas() {
        boolean valueInput1 = false;
        if (this.input1 != null) {
            valueInput1 = this.input1.CalcularEntradas();
        } else {
            valueInput1 = this.valueInput1;
        }
        return !(valueInput1);
    }
}
