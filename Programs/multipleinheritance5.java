package Day5;


	interface Tester{
		void testSoftware();
	}
	class ManualTester implements Tester{
		public void testSoftware() {
			System.out.println("Manual test in process");
		}
	}

	class AutomationTester implements Tester{
		public void testSoftware() {
			System.out.println("Automation test in progress");
		}
	}
	public class multipleinheritance5 {
		public static void main(String[] args) {
			ManualTester m = new ManualTester();
			AutomationTester n = new AutomationTester();
			System.out.println("manual tester:");
			m.testSoftware();
			System.out.println("\nAutomation tester:");
			n.testSoftware();
		}

	}



