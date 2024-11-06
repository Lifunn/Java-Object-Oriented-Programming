package tree;

public class TreeTest {
	public static void main(String[] args) {
		// --- 1. Building the tree ---
		System.out.println("--- 1. [5 points] Building the tree ---");
		System.out.println("We will test your work with the following tree:");
		System.out.println("----------------------------------------------- ");
		System.out.println();
		System.out.println("                        1        ");
		System.out.println("                      /   \\     ");
		System.out.println("                     /     \\    ");
		System.out.println("                    2       3    ");
		System.out.println("                   / \\     / \\ ");
		System.out.println("                  /   \\   /   \\");
		System.out.println("          tree =    4     5 6     7 ");
		System.out.println("                  \\           / ");
		System.out.println("                   8         9   ");

		// Please build your tree in here
        Tree tree = new Tree(1,
                new Tree(2,
                        new Tree(4, null, new Tree(8)),
                        new Tree(5)),
                new Tree(3,
                        new Tree(6),
                        new Tree(7, null, new Tree(9))));

		// Show it
		System.out.println();
		System.out.println("Use toString() method:");
		System.out.println("-----------------------");
		System.out.println();
		System.out.println(tree);
		System.out.println();
		System.out.println("Use toStringAdv() method, i.e., rotated, without edges:");
		System.out.println("------------------------------------------------------- ");
		System.out.println();
		System.out.println(tree.toStringAdv());
		System.out.println();
		
		System.out.println("--- 2. [5 points] triple ---");
		tree.triple();
		System.out.println("After triple() has been called:");
		System.out.println("------------------------------ ");
		System.out.println(tree.toStringAdv());
		System.out.println();

		System.out.println("--- 3. [5 points] printDepthFirst ---");
		tree.printDepthFirst();
		System.out.println("After printDepthFirst() has been called:");
		System.out.println("------------------------------ ");
		System.out.println();

		System.out.println("--- 4. [10 points] createFreshCopy ---");
		Tree newTree = tree.createFreshCopy();
		tree.mirror();
		System.out.println("After createFreshCopy() has been called:");
		System.out.println("------------------------------ ");
		System.out.println("tree: ");
		System.out.println(tree.toStringAdv());
		System.out.println("newTree: ");
		System.out.println(newTree.toStringAdv());
		System.out.println();

		System.out.println("--- 5. [5 points] saveDepthFirst ---");
		System.out.println("We will test with the following tree:");
	    System.out.println("------------------------------------------- ");
	    System.out.println();
	    System.out.println("                             4        ");
	    System.out.println("                           /   \\     ");
	    System.out.println("                          /     \\    ");
	    System.out.println("          tree =            5       6    ");
	    System.out.println("                        / \\     / \\ ");
	    System.out.println("                       7   8   9   10 ");
	    // Build the tree:
	    Tree tree1 = new Tree(4, 
                new Tree(5, new Tree(7), new Tree(8)), 
                new Tree(6, new Tree(9), new Tree(10)));
	    int array[] = new int[13];
	    int startPosition = 4;
	    int endPosition = tree1.saveDepthFirst(array, startPosition);
	    System.out.println("end: " + endPosition); // The index of last node in array
	    for (int i = 0; i < array.length; i++) {
	    	System.out.print(array[i] + " ");
	    }
	    System.out.println();
	    System.out.println();

	    System.out.println("--- 6. [5 points] find ---");
		System.out.println("We will test with the following binary tree:");
	    System.out.println("------------------------------------------- ");
	    System.out.println();
	    System.out.println("                             5        ");
	    System.out.println("                           /   \\     ");
	    System.out.println("                          /     \\    ");
	    System.out.println("          tree =            3       8    ");
	    System.out.println("                        / \\     / \\ ");
	    System.out.println("                       1   4   7   10 ");
	    // Build the tree:
	    // Membuat pohon binary search
		Tree tree2 = new Tree(5,
				new Tree(3, new Tree(1), new Tree(4)),
				new Tree(8, new Tree(7), new Tree(10)));

	    System.out.println(tree2.find(8));
		System.out.println("After find(8) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println();

	    System.out.println("--- 7. [5 points] insert ---");
		System.out.println("We will test with the following binary tree:");
		System.out.println("------------------------------------------- ");
		System.out.println("                             5        ");
		System.out.println("                           /   \\     ");
		System.out.println("                          /     \\    ");
		System.out.println("          tree =            3       8    ");
		System.out.println("                        / \\     / \\ ");
		System.out.println("                       1   4   7   10 ");
		// Membuat pohon binary search
		Tree tree3 = new Tree(5,
				new Tree(3, new Tree(1), new Tree(4)),
				new Tree(8, new Tree(7), new Tree(10)));

	    tree3 = tree3.insert(9);
	    System.out.println("After insert(9) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println(tree3);
	    System.out.println(tree3.toStringAdv());
	    tree3 = tree3.insert(12);
	    System.out.println("After insert(12) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println(tree3);
	    System.out.println(tree3.toStringAdv());
	    tree3 = tree3.insert(8);
	    System.out.println("After insert(8) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println(tree3);
	    System.out.println(tree3.toStringAdv());
	}
}
