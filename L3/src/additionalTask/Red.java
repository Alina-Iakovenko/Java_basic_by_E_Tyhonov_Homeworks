package additionalTask;

public class Red extends Printer {
    @Override
    void print(String value) {
        super.print((char)27 + "[31m" + value);
    }
}
