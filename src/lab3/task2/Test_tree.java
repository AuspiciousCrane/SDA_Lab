package lab3.task2;

public class Test_tree {
	
	public static void main(String[] args) {
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Ruffles(mytree);
		//mytree = new Star(mytree);
		System.out.println(mytree.getDescription() + " costs:" +mytree.cost());

		System.out.println("Alice tree: ");
		Tree aliceTree = new Fraserfir();
		aliceTree = new BallRed(aliceTree);
		aliceTree = new BallRed(aliceTree);
		System.out.println(aliceTree.getDescription());
		System.out.println("Cost: " + aliceTree.cost());

		System.out.println("Bob tree: ");
		Tree bobTree = new Douglasfir();
		bobTree = new Star(bobTree);
		bobTree = new Ruffles(bobTree);
		bobTree = new BallRed(bobTree);
		bobTree = new BallSilver(bobTree);
		bobTree = new BallBlue(bobTree);
		bobTree = new Ribbon(bobTree);
		bobTree = new Light(bobTree);
		bobTree = new LED(bobTree);
		bobTree = new Star(bobTree);
		System.out.println(bobTree.getDescription());
		// expected cost 
		// bobTree = 15 + 4 + 1 + 1 + 3 + 2 + 2 + 5 + 10 = 43
		System.out.println("Cost: " + bobTree.cost());

		System.out.println("Test_tree goodbye");
	}
}