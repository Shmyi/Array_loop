
public class BeanCounter {
	private int beanCount;
	private int minBeanSize;
	private int maxBeanSize;
	
	public BeanCounter() {
		minBeanSize = Integer.MAX_VALUE;
		maxBeanSize = Integer.MIN_VALUE;
		beanCount = 0;
	};
	
	public int getBeanCount() {
		return beanCount;
	}
	public int getMinBeanSize() {
		return minBeanSize;
	}
	public int getMaxBeanSize() {
		return maxBeanSize;
	}
	public void examineBean(int beanSize) {
		if (beanSize < minBeanSize) {
			minBeanSize = beanSize;

		}
		if (beanSize > maxBeanSize) {
			maxBeanSize = beanSize;
		}
		beanCount++;
	}
	public String toString() {
		String report = String.format("Bean count = %s, Max = %s, Min = %s", beanCount, maxBeanSize, minBeanSize);
		return report;
	}
	
}
