package cote;

import java.util.Arrays;
import java.util.Comparator;

public class testCode {


    private static class Node {
        int dest, cost;

/*
Node 클래스의 객체를 정의하여 배열에 담고,
               그 배열의 객체들을 cost 기준으로 오름차순 정렬한다.
 */
        public Node(int dest, int cost){
            this.dest = dest;
            this.cost = cost; // 얘기준 오름차순
        }

        @Override
        public String toString() {
            return "Node{dest: "+ dest+", const: "+cost+"}";
        }
    }

    public static void main(String[] args) {

        Node[] nodes = new Node[5];
        nodes[0] = new Node(1, 10);
        nodes[1] = new Node(2, 20);
        nodes[2] = new Node(3, 15);
        nodes[3] = new Node(4, 5);
        nodes[4] = new Node(1, 25);

        Arrays.sort(nodes, (o1, o2) -> Integer.compare(o1.cost, o2.cost) );

        System.out.println("정렬결과" +Arrays.toString(nodes));

        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.cost, o2.cost);
            }
        });
    }
}
