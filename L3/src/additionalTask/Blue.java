package additionalTask;

public class Blue extends Printer {
    @Override
    void print(String value) {
        super.print((char)27 + "[34m" + value);
    }
}
