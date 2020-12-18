import java.util.*;
import java.util.LinkedList;

class Node{
	int data;
	Node link;
}

public class swea우선순위큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Node> queue = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. enQueue\n2. deQueue\n3. size\n4. peek\n0. end");
			int sel = sc.nextInt();
			if(sel == 0) {
				break;
			} else if(sel == 1) {
				Node n = new Node();
				n.data = sc.nextInt();
				if(!queue.isEmpty()) {
					Node[] nd = new Node[queue.size()];
					for (int i = 0; i < nd.length; i++) {
						nd[i] = queue.poll();
					}
					for (int i = 0; i < nd.length; i++) {
						if(nd[i].data < n.data) {
							queue.offer(nd[i]);
						} else {
							queue.offer(n);
						}
					}
					
				} else {
					n.link = null;
					queue.offer(n);
				}
				
			} else if(sel == 2) {
				Node n = new Node();
				n.data = sc.nextInt();
				if(!queue.isEmpty()) {
					Node[] nd = new Node[queue.size()];
					for (int i = 0; i < nd.length; i++) {
						nd[i] = queue.poll();
						
						if(nd[i].data != n.data) {
							queue.offer(nd[i]);
						}
					}
				} else {
					System.out.println("�걧媛� 鍮꾩뿀�뒿�땲�떎.");
				}
			} else if(sel == 3) {
				System.out.println(queue.size());
			} else if(sel == 4) {
				while(!queue.isEmpty()) {
					System.out.println(queue.poll().data);
				}
			}
		}
		 
	}

}
