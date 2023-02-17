
public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation() {}
	LinearEquation(double _a, double _b, double _c, double _d, double _e, double _f) {
		a = _a;
		b = _b;
		c = _c;
		d = _d;
		e = _e;
		f = _f;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		return (a*d - b*c != 0);
	}
	
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}