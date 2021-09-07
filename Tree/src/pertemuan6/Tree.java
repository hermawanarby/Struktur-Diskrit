/**
 * Created by Hermawan Arby 193040161 on 24/4/2021.
 */
package pertemuan6;

// Import library Stack
import java.util.Stack;

// Kelas Tree
public class Tree {
	
	// Atribut root untuk menyimpan node dari root di tree
	private Node root;

	// Konstruktor tree, yang akan dijalankan pertama kali
	public Tree() {
		
		// Nilai root awal diisi null
		root = null; 
	} 
	
	// Method find untuk mencari node yang ada di tree, dengan parameter int key
	public Node find(int key) {
		
		// Variabel current diisi root, yang mana root ini nilainya itu null
		Node current = root;
		
		// Selama current.id tidak sama dengan key
		while (current.id != key) {
			
			// Jika key kurang dari current.id
			if (key < current.id) {
				
				// maka current diisi dengan current.leftChild
				current = current.leftChild;
				
			// jika tidak
			} else {
				
				// Maka current diisi dengan current.rightChild
				current = current.rightChild;
			}
			
			// Jika current sama dengan null 
			if (current == null) {
				
				// maka mengambalikan nilai null
				return null;
			}
		}
		
		// Mengembalikan nilai current
		return current;
	}

	// Method insert untuk menambahkan node baru pada tree, dengan parameter int id dan String data
	public void insert(int id, String data) {
		
		// Instansiasi objek newNode dari kelas Node
		Node newNode = new Node();
		
		// newNode.id diisi nilai dari id yang baru dimasukan
		newNode.id = id;
		
		// newNode.data diisi nilai dari data yang baru dimasukan
		newNode.data = data;
		
		// Jika nilai root sama dengan null
		if (root == null) {
			
			// maka root diisi nilai newNode
			root = newNode;
			
			// Jika tidak
		} else {
			
			// Variabel current diisi dengan nilai root
			Node current = root;
			
			// Deklarasi variabel parent
			Node parent;
			
			// Selama true
			while (true) {
				
				// parent diisi nilai dari current
				parent = current;
				
				// Jika id kurang dari current.id
				if (id < current.id) {
					
					// Maka current diisi current.leftChild 
					current = current.leftChild;
					
					// Jika current sama dengan null
					if (current == null) {
						
						// Maka parent.leftChild diisi newNode
						parent.leftChild = newNode;
						
						// Mengembalikan nilai
						return; 
					}
				// Jika tidak
				} else {
					
					// current diisi dengan current.rightChild
					current = current.rightChild;
					
					// Jika current sama dengan null 
					if (current == null) {
						
						// parent.rightChild diisi dengan newNode
						parent.rightChild = newNode;
						
						// Mengembalikan nilai
						return;
					}
				}
			}
		}
	} 

	// Function delete untuk mengahpus node yang ada di tree dengan paramater key
	public boolean delete(int key) {
		
		// Variabel current diisi nilai dari root
		Node current = root;
		// Variabel parent diisi nilai dari root
		Node parent = root;
		
		// Deklarasi variabel isLeftChild dengan nilai awal true
		boolean isLeftChild = true;
		
		// Selama current.id tidak sama dengan key
		while (current.id != key) {
			
			// Maka, parent diisi dengan current
			parent = current;
			
			// Jika key kurang dari current.id
			if (key < current.id) {
				
				// Maka, isLeftChild bernilai true
				isLeftChild = true;
				
				// current diisi dengan current.leftChild
				current = current.leftChild;
				
			// Jika tidak
			} else {
				
				// isLeftChild bernilai false
				isLeftChild = false;
				
				// current diisi dengan current.rightChild
				current = current.rightChild;
			}
			
			// Jika current sama dengan null
			if (current == null) {
				
				// Maka, akan mengembalikan nilai false
				return false;
			}
		}
		
		// Jika current.leftChild sama dengan null dan current.rightChild sama dengan null, maka...
		if (current.leftChild == null && current.rightChild == null) {
			
			// Jika current sama dengan root
			if (current == root) {
				
				// root diisi dengan null
				root = null;
				
				// Jika isLeftChild true
			} else if (isLeftChild) {
				
				// Maka parent.leftChild diisi dengan current.leftChild
				parent.leftChild = current.leftChild;
				
				// Jika tidak
			} else {
				
				// Maka, parent.rightChild diisi dengan current.leftChild
				parent.rightChild = current.leftChild;
			}
			
			// Jika current.rightChild sama dengan null
		} else if (current.rightChild == null) {
			
			// Jika current sama dengan root
			if (current == root) {
				
				// Maka root diisi dengan current.leftChild
				root = current.leftChild;
				
				// Jika isLeftChild
			} else if (isLeftChild) {
				
				// Maka, parent.leftChild diisi dengan current.leftChild 
				parent.leftChild = current.leftChild;
				
				// Jika tidak 
			} else {
				
				// Maka, parent.rightChild diisi dengan current.leftChild
				parent.rightChild = current.leftChild;
			}
			
			// Jika current.leftChild sama dengan null
		} else if (current.leftChild == null) {
			
			// Jika current sama dengan root
			if (current == root) {
				
				// Maka, root diisi dengan current.rightChild
				root = current.rightChild;
				
				// Jika isLeftChild
			} else if (isLeftChild) {
				
				// Maka, parent.leftChild diisi dengan current.rightChild
				parent.leftChild = current.rightChild;
				
				// Jika tidak 
			} else {
				
				// parent.rightChild diisi dengan current.rightChild
				parent.rightChild = current.rightChild;
			}
			
			// Jika tidak
		} else {
			
			// Inisiasi successor dengan nilai getSuccessor(current)
			Node successor = getSuccessor(current);
			
			// Jika current sama dengan root
			if (current == root) {
				
				// root diisi dengna successor
				root = successor;
				
				// Jika isLeftChild
			} else if (isLeftChild) {
				
				// Maka, parent.leftChild diisi dengan successor
				parent.leftChild = successor;
				
				// Jika tidak
			} else {
				
				// parent.rightChild diisi dengan successor
				parent.rightChild = successor;
			}
			
			// successor.leftChild diisi dengan current.leftChild
			successor.leftChild = current.leftChild;
		}
		
		// Mengembalikan nilai true
		return true;
	}
	
	// Method getSuccessor dengan parameter delNode yang bertipe Node
	private Node getSuccessor(Node delNode) {
		
		// Deklarasi variabel successorParent diisi dengan nilai dari delNode
		Node successorParent = delNode;
		
		// Deklarasi variabel successor diisi dengan nilai dari delNode
		Node successor = delNode;
		
		// Deklarasi variabel current diisi dengan nilai dari delNode.rightChild
		Node current = delNode.rightChild;
		
		// Selama nilai dari current tidak sama dengan null, maka...
		while (current != null) {
			
			// successorParent diisi dengan successor
			successorParent = successor;
			
			// successor diisi dengan current
			successor = current;
			
			// current diisi dengan current.leftChild
			current = current.leftChild;
		}
		
		// Jika successor tidak sama dengan delNode.rightChild, maka...
		if (successor != delNode.rightChild) {
			
			// successorParent.leftChild diisi dengan successor.rightChild
			successorParent.leftChild = successor.rightChild;
			
			// successor.rightChild diisi dengan delNode.rightChild
			successor.rightChild = delNode.rightChild;
		}
		
		// Mengembalikan nilai dari successor
		return successor;
	}
	
	// Method traverse untuk memilih tipe traverse yang akan dipakai
	public void traverse(int traverseType) {
		
		// switch
		switch (traverseType) {
		
			// Pilihan 1 yaitu Preorder
			case 1:
				
				// Menampilkan tulisan "Preorder traversal:" ke layar
				System.out.print("Preorder traversal: ");
				
				// Memanggil method preOrder
				preOrder(root);
				
				// Untuk menghentikan case 1
				break;
				
			// Pilihan 2 yaitu inOrder
			case 2:
				
				// Menampilkan tulisan "Inorder traversal:" ke layar
				System.out.print("Inorder traversal: ");
				
				// Memanggil method inOrder
				inOrder(root);
				
				// Untuk menghentikan case 2
				break;
				
			// Pilihan 3 yaitu postOrder
			case 3:
				
				// Menampilkan tulisan "Postorder traversal:" ke layar
				System.out.print("Postorder traversal: ");
				
				// Memanggil method postOrder
				postOrder(root);
				
				// Untuk menghentikan case 3
				break;
		} 
		
		// Untuk memberi jarak antar baris
		System.out.println();

	}
	
	// Method preOrder untuk menampilkan data yang ada didalam tree keseluruhan dengan cara..
	// menampilkan parent-nya terlebih dahulu, kemudian maka akan mencetak dari blok kiri ke blok kanan
	private void preOrder(Node localRoot) {
		
		// Jika localRoot tidak sama dengan null
		if (localRoot != null) {
			
			// Maka, menampilkan data dari parent localRoot.id 
			System.out.print(localRoot.id + " ");
			
			// Lalu, menampilkan data yang ada di selebah kiri
			preOrder(localRoot.leftChild);
			
			// Kemudian, menampilkan data yang ada di sebelah kanan
			preOrder(localRoot.rightChild);
		}
	}

	// Method inOrder untuk menampilkan seluruh data yang ada di tree seacara berurutan dari kiri ke kanan 
	private void inOrder(Node localRoot) {
		
		// Jika localRoot tidak sama dengan null
		if (localRoot != null) {
			
			// Menampilkan data yang ada di selebah kiri
			inOrder(localRoot.leftChild);
			
			// Menampilkan data dari parent localRoot.id 
			System.out.print(localRoot.id + " ");
			
			// Menampilkan data yang ada di sebelah kanan
			inOrder(localRoot.rightChild);
		}
	} 
	
	// Method postOrder untuk menampilkan seluruh data yang ada di tree, yang terlebih dahulu di...
	// sebelah blok kiri ke sebelah kanan, dengan mendahulukan data child-nya
	private void postOrder(Node localRoot) {
		
		// Jika localRoot tidak sama dengan null
		if (localRoot != null) {
			
			// Menampilkan data yang ada di selebah kiri
			postOrder(localRoot.leftChild);
			
			// Menampilkan data yang ada di sebelah kanan
			postOrder(localRoot.rightChild);
			
			// Menampilkan data dari parent localRoot.id 
			System.out.print(localRoot.id + " ");
		}
	} 
	
	// Method displayTree untuk menampilkan data yang ada di tree
	public void displayTree() {
		
		// Instansiasi objek globalStack dari stuktur data Stack
		Stack globalStack = new Stack();
		
		// Untuk menambahkan data ke dalama tree dengan parameter root
		globalStack.push(root);
		
		// Mendeklarasi variable nBlanks dengan nilai 32
		int nBlanks = 32;
		
		// Mendeklarasi variable isRowEmpty dengan nilai false
		boolean isRowEmpty = false;
		
		// Untuk memberi batas
		System.out.println("......................................................");
		
		// Selama isRowEmpty nilai nya false
		while (isRowEmpty == false) {
			
			// Instansiasi objek localStack dari stuktur data Stack
			Stack localStack = new Stack();
			
			// Variabel isRowEmpty bernilai true
			isRowEmpty = true;
			
			// Niali awal j = 0, jika j kurang dari nilai nBlanks, j +1
			for (int j = 0; j < nBlanks; j++) {
				
				// Untuk memberi jarak
				System.out.print(' ');
			}
			
			// Selama globalStack.isEmpty() bernilai false
			while (globalStack.isEmpty() == false) {
				
				// Deklarasi variabel temp dengan nilai (Node) globalStack.pop() untuk menampung data sementara
				Node temp = (Node) globalStack.pop();
				
				// Jika varibale temp tidak sama dengan null
				if (temp != null) {
					
					// Menampilkan data temp.id
					System.out.print(temp.id);
					
					// Menambahkan data ke selebah kiri
					localStack.push(temp.leftChild);
					
					// Menambahkan data ke selebah kanan
					localStack.push(temp.rightChild);
					
					// Jika data sebelah kiri tidak sama dengan null, atau data sebelah kanan tidak sama dengan null
					if (temp.leftChild != null || temp.rightChild != null) {
						
						// Variabel isRowEmpty diisi dengan nilai false
						isRowEmpty = false;
					}
					
				// Jika tidak
				} else {
					
					// Menampilkan -- ke layar
					System.out.print("--");
					
					// Menambahkan data dengan nilai null
					localStack.push(null);
					
					// Menambahkan data dengan nilai null
					localStack.push(null);
				}
				
				// Nilai awal j = 0, jika j kurang dari nilai nBlanks * 2 - 2, j +1
				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					
					// Untuk memberi jarak
					System.out.print(' ');
				}
			}
			
			// Untuk memberi jarak
			System.out.println();
			
			// Nilai dari nBlanks dibagi dengan 2
			nBlanks /= 2;
			
			// Selama localStack.isEmpty() bernilai false
			while (localStack.isEmpty() == false) {
				
				// Menambahakn ke stack yaitu perintah hapus
				globalStack.push(localStack.pop());
			}
		}
		
		// Untuk memberi batas 
		System.out.println("......................................................");
	}
	
}
