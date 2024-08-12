import java.util.Scanner;
public class BeamLauncher {

	public static void main(String[] args) {
		int beanCount=0;
		int minBeanSize=0;
		int maxBeanSize=0;
		int beanSize=0;
		String ifcontinue="yes";
		String report="";
		
		BeanCounter beancounter = new BeanCounter();
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("Please enter bean size: ");
		beanSize = scanner.nextInt();
		scanner.nextLine();
		beancounter.examineBean(beanSize);
		report = beancounter.toString();
		
		System.out.println(report);
		System.out.println("Do you want to continue? Enter yes to continue, anything else to exist" );
		ifcontinue = scanner.nextLine();
	
		}
		while(ifcontinue.equalsIgnoreCase("yes"));
	
	System.out.println("Program by Yi Chen");
	}
}
