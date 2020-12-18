package com.mycompany.hw1.mypolynomial;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = coeffs.length - 1; i > 0; i--) {
            str.append(coeffs[i]).append("x^").append(i).append("+");
        }
        str.append(coeffs[0]);
        return str.toString();
    }

    public double evaluate(double x) {
        double res = 0.0;
        for (int i = coeffs.length - 1; i > 0; i--) {
            res += coeffs[i]*Math.pow(x,i);
        }
        res += coeffs[0];
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        if (this.coeffs.length >= right.coeffs.length) {
            double[] newCoeffs = new double[this.coeffs.length];
            for (int i = 0; i < right.coeffs.length; i++) {
                newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
            if (this.coeffs.length - right.coeffs.length >= 0)
                System.arraycopy(this.coeffs, right.coeffs.length, newCoeffs, right.coeffs.length, this.coeffs.length - right.coeffs.length);
            MyPolynomial polynomial = new MyPolynomial(newCoeffs);
            return polynomial;
        } else {
            double[] newCoeffs = new double[right.coeffs.length];
            for (int i = 0; i < this.coeffs.length; i++) {
                newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
            System.arraycopy(right.coeffs, this.coeffs.length, newCoeffs, this.coeffs.length, right.coeffs.length - this.coeffs.length);
            MyPolynomial polynomial = new MyPolynomial(newCoeffs);
            return polynomial;
        }
    }


    public MyPolynomial multiply(MyPolynomial right) {
        if (this.coeffs.length >= right.coeffs.length) {
            double[] newCoeffs = new double[right.coeffs.length];
            for (int i = 0; i < right.coeffs.length; i++) {
                newCoeffs[i] = this.coeffs[i]*right.coeffs[i];
            }
            MyPolynomial polynomial = new MyPolynomial(newCoeffs);
            return polynomial;
        } else {
            double[] newCoeffs = new double[this.coeffs.length];
            for (int i = 0; i < this.coeffs.length; i++) {
                newCoeffs[i] = this.coeffs[i]*right.coeffs[i];
            }
            MyPolynomial polynomial = new MyPolynomial(newCoeffs);
            return polynomial;
        }
    }





}
