package com.company;

public class Calc {
    private float num;

    public void setValue(float n){
        num = n;
    }

    public float add(float n){
        float x = num + n;
        return x;
    }
    public float sub(float n){
        float x = num - n;
        return x;
    }
    public float mul(float n){
        float x = num * n;
        return x;
    }
    public float div(float n){
        float x = num * n;
        return x;
    }
}
