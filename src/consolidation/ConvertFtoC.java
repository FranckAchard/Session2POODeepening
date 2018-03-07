package consolidation;

public class ConvertFtoC {
	
	public static float convFtoC(float fDegrees) {
		// T(°C) = (T(°F) - 32) × 5/9		
		return (fDegrees - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("45°F = " + convFtoC(45) + "°C");
	}

}
