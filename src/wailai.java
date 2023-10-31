//import java.util.*;
//
//class Message {
//    int type;
//    String content;
//
//    public Message(int type, String content) {
//        this.type = type;
//        this.content = content;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Queue<Message> queue = new LinkedList<>();
//        Map<Integer, Queue<Message>> typeMap = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String opt = sc.next();
//            if ("in".equals(opt)) {
//                int t = sc.nextInt();
//                String s = sc.next();
//                Message message = new Message(t, s);
//                queue.add(message);
//
//                typeMap.putIfAbsent(t, new LinkedList<>());
//                typeMap.get(t).add(message);
//            } else if ("out".equals(opt)) {
//                int p = sc.nextInt();
//                Message message = null;
//
//                if (p == 0 && !queue.isEmpty()) {
//                    message = queue.poll();
//                    typeMap.get(message.type).poll();
//                } else if (p > 0 && typeMap.get(p) != null && !typeMap.get(p).isEmpty()) {
//                    message = typeMap.get(p).poll();
//                    queue.remove(message);
//                }
//
//                if (message != null) {
//                    System.out.println(message.content);
//                } else {
//                    System.out.println(-1);
//                }
//            }
//        }
//
//        sc.close();
//    }
//}