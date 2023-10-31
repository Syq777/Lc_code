//package mianshi;
//import java.util.*;
// class static LRUCache {
//
//    /**
//     * 双向链表长度
//     */
//    private int size;
//
//    /**
//     * 最大容量
//     */
//    private int capacity;
//
//    /**
//     * 哈希表，存储数据
//     */
//    private Map<Integer, DoubleLinkedNode> cache;
//
//    /**
//     * 双向链表头节点，不存储任何值，标识作用
//     */
//    private DoubleLinkedNode head;
//
//    /**
//     * 双向链表尾节点，不存储任何值，标识作用
//     */
//    private DoubleLinkedNode tail;
//
//    /**
//     * 构造方法
//     */
//    public LRUCache(int capacity) {
//        this.size = 0;
//        this.capacity = capacity;
//        this.cache = new HashMap<>();
//        this.head = new DoubleLinkedNode();
//        this.tail = new DoubleLinkedNode();
//        head.next = tail;
//        tail.prev = head;
//    }
//
//    /**
//     * 获取元素
//     */
//    public int get(int key) {
//        DoubleLinkedNode node = this.cache.get(key);
//
//        // 如果要获取的节点不存在
//        if (node == null) {
//            return -1;
//        }
//        // 移动到双向链表头部
//        moveToHead(node);
//        // 返回值
//        return node.value;
//    }
//
//    /**
//     * 添加元素
//     */
//    public void put(int key, int value) {
//        DoubleLinkedNode node = cache.get(key);
//        // 如果元素不存在
//        if (node == null) {
//            node = new DoubleLinkedNode(key, value);
//            // 添加到哈希表中
//            cache.put(key, node);
//            // 双向链表长度加 1
//            size++;
//            // 添加到双向链表头部
//            addToHead(node);
//            // 如果长度大于容量，说明要删除元素了
//            if (size > capacity) {
//                // 从双向链表中删除最后一个元素
//                DoubleLinkedNode tail = removeTail();
//                // 同时从哈希表中删除对应的元素
//                cache.remove(tail.key);
//                // 长度减 1
//                size--;
//            }
//            // 如果元素存在
//        } else {
//            // 修改值
//            node.value = value;
//            // 移动到双向链表头部
//            moveToHead(node);
//        }
//    }
//
//    /**
//     * 自己构造一个双向链表节点
//     */
//    class DoubleLinkedNode {
//
//        /**
//         * 键
//         */
//        int key;
//
//        /**
//         * 值
//         */
//        int value;
//
//        /**
//         * 前驱节点
//         */
//        DoubleLinkedNode prev;
//
//        /**
//         * 后继节点
//         */
//        DoubleLinkedNode next;
//
//        /**
//         * 构造方法
//         */
//        public DoubleLinkedNode() {}
//        public DoubleLinkedNode(int key, int value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//    /**
//     * 添加一个节点到双向链表头部
//     */
//    private void addToHead(DoubleLinkedNode node) {
//        node.next = head.next;
//        node.prev = head;
//        node.next.prev = node;
//        head.next = node;
//    }
//
//    /**
//     * 从双向链表中删除一个节点
//     */
//    private void removeNode(DoubleLinkedNode node) {
//        node.next.prev = node.prev;
//        node.prev.next = node.next;
//        node.prev = null;
//        node.next = null;
//    }
//
//    /**
//     * 将双向链表中一个节点移动双向链表到头部
//     */
//    private void moveToHead(DoubleLinkedNode node) {
//        removeNode(node);
//        addToHead(node);
//    }
//
//    /**
//     * 移除双向链表中最后一个节点
//     */
//    private DoubleLinkedNode removeTail() {
//        DoubleLinkedNode node = this.tail.prev;
//        removeNode(node);
//        return node;
//    }
//
//     public static void main(String[] args) {
//         LRUCache lruCache = new LRUCache(2);
//         LRUCache cache = new LRUCache(3); // 定义容量为3的缓存
//
//         cache.put(1, 100);
//         cache.put(2, 200);
//         cache.put(3, 300);
//
//         System.out.println(cache.get(1)); // 输出100
//         System.out.println(cache.get(4)); // 输出-1, 因为键4不存在
//
//         cache.put(4, 400); // 容量满了，所以会删除最久未使用的元素，即键1对应的元素
//
//         System.out.println(cache.get(1)); // 输出-1, 因为键1的元素已被删除
//         System.out.println(cache.get(2)); // 输出200
//         System.out.println(cache.get(3)); // 输出300
//         System.out.println(cache.get(4)); // 输出400
//
//         cache.put(3, 333); // 更新键3对应的值
//         System.out.println(cache.get(3)); // 输出333
//
//     }
//}
