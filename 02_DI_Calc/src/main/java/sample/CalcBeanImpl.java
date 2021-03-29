package sample;

public class CalcBeanImpl implements CalcBean {

	private int su1; // 14 setter ÅëÇÑ ÁÖÀÔ
	private int su2; // 5 »ı¼ºÀÚ ÅëÇÑ ÁÖÀÔ
	
	public CalcBeanImpl(int su2) {
		this.su2 = su2;
	}
	
	public void setSu1(int su1) {
		this.su1 = su1;
	}
	
	@Override
	public void calculate() {
		System.out.println("µ¡¼À:"+(su1+su2));
		System.out.println("»¬¼À:"+(su1-su2));
		System.out.println("°ö¼À:"+(su1*su2));
		System.out.println("³ª´°¼À:"+(su1/su2));
	}

}
