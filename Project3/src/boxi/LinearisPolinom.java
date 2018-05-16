package boxi;

import boxi.IPolinomok;

public class LinearisPolinom implements IPolinomok {

private double a;
private double b;

public LinearisPolinom(double a, double b) {
	super();
	this.a = a;
	this.b = b;
}

@Override
public double szamol(double szam) {
	return a * szam + b;
}

@Override
public int foka() {
	return 1;
}

@Override
public String toString() {
	if(b > 0)
		return "y= " + a + "x " + "+" + b;
	else
		return "y= " + a + "x " + b;
}
}