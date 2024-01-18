package k_Chapter10;

abstract class MobileApp {
	abstract void execute();
	void appInfo() {
		System.out.println("This is a mobile app");
	}
}

class GameApp extends MobileApp {
	void execute() {
		System.out.println("Game app execute");
	}
	
	@Override
	void appInfo() {
		System.out.println("Game app");
	}
}

class SocialApp extends MobileApp {
	void execute() {
		System.out.println("Socail app executes");
	}
}



public class Z_Pratice01 {
	public static void main(String[] args) {
		MobileApp myGameApp = new GameApp();
		MobileApp mySocialApp = new SocialApp();
		
		myGameApp.execute();
		myGameApp.appInfo();
		
		mySocialApp.execute();
		mySocialApp.appInfo();
	}
}
