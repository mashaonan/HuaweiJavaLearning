public class Calculator {
    public int compute(int name1, int name2, String symbol) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computable computable = ComputeFactory.getCompute(symbol);
        return computable.compute(name1, name2);
    }
}
