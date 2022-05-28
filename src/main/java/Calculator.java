public class Calculator {
    public int compute(int name1, int name2, char symbol) {
        switch (symbol) {
            case '+':
                return name1 + name2;
            case '-':
                return name1 - name2;
            default:
                throw new IllegalArgumentException();
        }
    }
}
