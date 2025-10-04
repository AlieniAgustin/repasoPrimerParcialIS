public class PatoPeronista extends Duck {

	public PatoPeronista() {
		quackBehavior = new QuackPeronista();
		flyBehavior = new FlyWithPeron();
	}

	public void display() {
		System.out.println("I'm a pato peronista");
	}

}
