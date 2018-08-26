package cn.jyd.design.strategy;


public class TestStrategy{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		new OperateClass(new StrategyA()).operateNum(a, b);
		new OperateClass(new StrategyB()).operateNum(a, b);
		new OperateClass(new StrategyC()).operateNum(a, b);
		new OperateClass(new StrategyD()).operateNum(a, b);
	}
}