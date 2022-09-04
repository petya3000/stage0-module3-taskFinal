package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.print(number%100);
        number /= 10;
        System.out.print(number%10);
        number /= 10;
        System.out.println(number);
    }
}
