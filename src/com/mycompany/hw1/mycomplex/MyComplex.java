package com.mycompany.hw1.mycomplex;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real +
                " + " + imag + "i" +
                ')';
    }


    public boolean isReal() {
        if (this.real == 0.0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isImaginary() {
        if (this.imag == 0.0) {
            return false;
        } else {
            return true;
        }
    }


    public boolean equals(double real, double imag) {
        return real == this.real && imag == this.imag;
    }

    public boolean equals(MyComplex another) {
        if (another == null) {
            throw new NullPointerException();
        }
        return another.getReal() == this.real && another.getImag() == this.imag;
    }


    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }


    public double argument() {
        return Math.atan2(this.imag, this.real);
    }


    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real + right.real;
        newComplex.imag = this.imag + right.imag;
        return newComplex;
    }


    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real - right.real;
        newComplex.imag = this.imag - right.imag;
        return newComplex;
    }


    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }


    public MyComplex divide(MyComplex right) {
        this.real = (this.real * right.real + this.imag * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.imag = (this.imag * right.real - this.real * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        return this;
    }

    public MyComplex conjugate() {
        MyComplex newComplex = new MyComplex(this.real,this.imag*(-1));
        return newComplex;
    }


}
