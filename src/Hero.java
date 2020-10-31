import sun.net.idn.Punycode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Hero {
    public String name;
    public int hp;
    public int damage;


    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }

    public void test(){
        Deque<Hero> ll = new LinkedList<>();
        System.out.println("双向链表结构Deque");
        ll.addLast(new Hero("Hero1"));
        ll.addLast(new Hero("Hero2"));
        ll.addLast(new Hero("Hero3"));
//        System.out.println(ll);

        for (Hero hero: ll){
            System.out.println(hero.getName());
        }

        System.out.println("头部添加元素");
        ll.addFirst(new Hero("Hero4"));
//        System.out.println(ll);
        for (Hero hero: ll){
            System.out.println(hero.getName());
        }

        System.out.println("获取第一个和最后一个元素");
        System.out.println(ll.getFirst().getName());
        System.out.println(ll.getLast().getName());

        System.out.println("删除第一个元素");
        ll.removeFirst();
        for (Hero hero: ll){
            System.out.println(hero.getName());
        }
        System.out.println("******");
        System.out.println("******");

        System.out.println("队列结构Queue");
        Queue<Hero> q = new LinkedList<>();
        q.offer(new Hero("Hero_one"));
        q.offer(new Hero("Hero_two"));
        q.offer(new Hero("Hero_three"));

        for (Hero hero : q){
            System.out.println(hero.getName());
        }

        System.out.println("取出第一个元素");
        q.poll();
        for (Hero hero : q){
            System.out.println(hero.getName());
        }
        System.out.println("查看第一个元素后的队列");
        q.peek();
        for (Hero hero : q){
            System.out.println(hero.getName());
        }
    }
}
