package fourpointoneother;
import fourpointone.ProtectedMethod;
public class CallingClass extends ProtectedMethod{
		
		public CallingClass() {
			System.out.println("Class CallingClass in package \'fourpointone\'");
		}
		
		public void callMethod() {
			System.out.println("Calling protected method.");
			super.protectMethod();
		}
		
		public static void main(String[] args) {
			CallingClass p = new CallingClass();
			p.callMethod();
		}
	
}
