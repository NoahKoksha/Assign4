package koksha;

import java.math.BigInteger;

public class BigNumber {

	private BigInteger num;
	

	public BigNumber(String input) {
		this.num = new BigInteger(input);
	}
	
	public BigNumber add(BigNumber other) {
		BigInteger total = this.num.add(other.num);
		return new BigNumber(total.toString());
	}
	
	public BigNumber mod(BigNumber other) {
		BigInteger result = this.num.mod(other.num);
        return new BigNumber(result.toString());
	}
	
	public String getStr() {
		return this.num.toString();
	}
}
