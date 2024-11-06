package tree;

/** Binary trees with nodes labelled by integers */
public class Tree {
	private int nodeValue;
	private Tree leftChild, rightChild;

	/** Creates a new instance of Tree: a branch */
	public Tree(int nodeValue, Tree leftChild, Tree rightChild) {
		this.nodeValue = nodeValue;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	/**
	 * Creates a new instance of Tree: a leaf (a special case
	 * of the above) */
	public Tree(int nodeValue) {
		this.nodeValue = nodeValue;
		this.leftChild = null;
		this.rightChild = null;
	}

	/** Sample method: Mirror myself */
	public void mirror() {
		if (leftChild != null) { // Left branch, please mirror yourself
			leftChild.mirror();  // This works by delegation
		}
		if (rightChild != null) { // Right branch, please mirror yourself
			rightChild.mirror();  // This works by delegation
		}
		Tree tempLeft = leftChild; // Swap the branches, mirror myself
		leftChild = rightChild;
		rightChild = tempLeft;
	}
	
	/**
	 * Converts a tree to an expression-tree string representation
	 */
	@Override
	public String toString() {
		String leftString, rightString;

		// Convert the left and right branches to strings,
		// delegating the task to them if they exist.
		if (leftChild == null) {
			leftString = "empty";
		} else {
			leftString = leftChild.toString(); // Please do your job, Mr. Left Subtree.
		}
		if (rightChild == null) {
			rightString = "empty";
		} else {
			rightString = rightChild.toString(); // Please do your job, Mrs. Right Subtree.
		}
		// Now I do my own job:
		String result = "branch(" + nodeValue + "," + leftString + "," + rightString + ")";
		return result;
	}

	/**
	 * Converts a tree to an expression-tree string representation (advanced)
	 */
	public String toStringAdv() {
		return this.toStringFrom(0);
	}
	public String toStringFrom(int depth) {
		int step = 4; // Depth step (number of spaces printed)

		// Delegate task to Mr. Left Subtree, if necessary:
		String leftString;
		if (leftChild != null) {
			leftString = leftChild.toStringFrom(depth + step);
		} else {
			leftString = "";
		}
		// Delegate task to Mrs. Right Subtree, if necessary:
		String rightString;
		if (rightChild != null) {
			rightString = rightChild.toStringFrom(depth + step);
		} else {
			rightString = "";
		}
		// My own task now:
		String result = rightString + spaces(depth) + nodeValue + "\n" + leftString;
		return result;
	}
	private String spaces(int n) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s = s + " ";
		}
		return s;
	}
	
	// 2
	public void triple() {
		// Panggil rekursif pada subtree kiri jika ada
		if (leftChild != null) {
			leftChild.triple();
		}
		
		// Panggil rekursif pada subtree kanan jika ada
		if (rightChild != null) {
			rightChild.triple();
		}
		
		// Kalikan nilai root saat ini dengan tiga
		nodeValue *= 3;
	}
	
	// 3
	public void printDepthFirst() {
		// Cetak nilai node saat ini
		System.out.print(nodeValue + " ");
	
		// Rekursif pada subtree kiri jika ada
		if (leftChild != null) {
			leftChild.printDepthFirst();
		}
	
		// Rekursif pada subtree kanan jika ada
		if (rightChild != null) {
			rightChild.printDepthFirst();
		}
	}

	// 4
	public Tree createFreshCopy() {
		// Salin subtree kiri jika ada, rekursif
		Tree newLeftChild = (leftChild == null) ? null : leftChild.createFreshCopy();
	
		// Salin subtree kanan jika ada, rekursif
		Tree newRightChild = (rightChild == null) ? null : rightChild.createFreshCopy();
	
		// Buat node baru yang merupakan salinan node saat ini
		return new Tree(nodeValue, newLeftChild, newRightChild);
	}

	// 5
	public int saveDepthFirst(int array[], int index) {
		// Simpan nilai node pada posisi index
		array[index] = nodeValue;
	
		// Posisi berikutnya untuk menyimpan hasil traversal subtree
		int currentIndex = index + 1;
	
		// Jika ada subtree kiri, rekursif simpan traversal depth-first ke array
		if (leftChild != null) {
			currentIndex = leftChild.saveDepthFirst(array, currentIndex);
		}
	
		// Jika ada subtree kanan, rekursif simpan traversal depth-first ke array
		if (rightChild != null) {
			currentIndex = rightChild.saveDepthFirst(array, currentIndex);
		}
	
		// Kembalikan posisi terakhir yang terisi di array
		return currentIndex;
	}
	
	// 6
	public Tree find(int value) {
		// Jika nilai node sama dengan value, kembalikan subtree ini
		if (nodeValue == value) {
			return this;
		}
	
		// Jika value lebih kecil dari nodeValue, cari di subtree kiri jika ada
		if (value < nodeValue && leftChild != null) {
			return leftChild.find(value);
		}
	
		// Jika value lebih besar dari nodeValue, cari di subtree kanan jika ada
		if (value > nodeValue && rightChild != null) {
			return rightChild.find(value);
		}
	
		// Jika tidak ditemukan, kembalikan null
		return null;
	}
	
	// 7 
	public Tree insert(int value) {
		// Jika nilai sudah ada, kembalikan pohon tanpa perubahan
		if (value == nodeValue) {
			return this;
		}
		
		// Jika nilai lebih kecil, masukkan ke subtree kiri
		if (value < nodeValue) {
			if (leftChild == null) {
				leftChild = new Tree(value); // Tambahkan node baru sebagai leaf kiri
			} else {
				leftChild = leftChild.insert(value); // Rekursi ke subtree kiri
			}
		} 
		// Jika nilai lebih besar, masukkan ke subtree kanan
		else {
			if (rightChild == null) {
				rightChild = new Tree(value); // Tambahkan node baru sebagai leaf kanan
			} else {
				rightChild = rightChild.insert(value); // Rekursi ke subtree kanan
			}
		}
	
		// Kembalikan referensi pohon
		return this;
	}
}
