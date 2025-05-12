package com.chapter11_generics.generics;

// 일반적으로 <> (다이아몬드 연산자) 안에 T 알파벳을 사용한다. (모든 알파벳이 들어올 수는 있다.)
public class GenericTest<T> {
    private T value; // 타입이 아직 결정되지 않음.

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
