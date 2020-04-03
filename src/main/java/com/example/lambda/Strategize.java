package com.example.lambda;

interface Strategy {
    String approach(String msg);
}

class Soft implements Strategy {

    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static String twice(String msg) {
        return msg + "-" + msg;
    }
}

public class Strategize {

    Strategy strategy;
    String msg;

    public Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {

        // 1.使用匿名内部类；2.使用Lambda 表达式；3.使用函数调用
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "?";
                    }
                },
                msg1 -> msg1.substring(0, 5),
                Unrelated::twice
        };

        Strategize s = new Strategize("hello there");
        s.communicate();

        for(Strategy strategy : strategies) {
            s.changeStrategy(strategy);
            s.communicate();
        }
    }
}
