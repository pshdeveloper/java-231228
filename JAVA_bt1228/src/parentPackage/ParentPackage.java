package parentPackage;

public class ParentPackage {
	// public 접근 제한자를 사용한 필드
	public String portectedField;
	
	// protected 접근 제한자를 사용한 필드
	protected String portecteField;
	
	public void parentClass() {
		this.portectedField = "Public Field";
	}
	
	public void protectedMethod() {
		System.out.println("This is a public method");
	}
}
