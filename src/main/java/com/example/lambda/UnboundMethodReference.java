package com.example.lambda;

class X {
    String f() { return "X::f()"; }
}

interface MakeString1 {
    String make();
}

interface MakeString2 {
    String make(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        // 无效，因为隐式参数 this
        // MakeString1 ms1 = X::f;
        MakeString2 ms2 = X::f;
    }
}
