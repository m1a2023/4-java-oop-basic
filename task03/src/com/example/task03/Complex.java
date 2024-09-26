package com.example.task03;

public class Complex {
	private final double real;
	private final double imag;

	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() { return this.real; }
	public double getImaginary() { return this.imag; }

	public Complex add(Complex number) {
		return new Complex(
				this.real + number.getReal(),
				this.imag + number.getImaginary()
		);
	}

	public Complex multiply(Complex number) {
		return new Complex(
				(this.real * number.getReal() - this.imag * number.getImaginary()),
				(this.real * number.getImaginary() + this.imag * number.getReal())
		);
	}

	@Override
	public String toString() {
		return this.real
				+ (this.imag >= 0
					? " + " + this.imag
					: " - " + -this.imag)
				+ "i";
	}
}
