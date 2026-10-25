package org.reda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyImpl1());
        context.perform();
        context.setStrategy(new StrategyImpl2());
        context.perform();
        context.setStrategy(new StrategyImpl3());
        context.perform();
        // ne pas definir aucune implementation
        Context context1 = new Context();
        context1.perform();
    }
}