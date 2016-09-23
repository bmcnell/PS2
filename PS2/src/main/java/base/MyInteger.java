package base;
//bmcnell
public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0) {
		return true;
		} else {
		return false;
		}
	}
	
	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else {
		return false;
		}
	}
	
	public boolean isPrime() {
		int n;
		for (n = 2; n < iValue; n++) {
			if (iValue % n == 0)
				return false;
		}
		return true;
	}

	public boolean equals() {
		return (getiValue() == iValue);
	}

}










