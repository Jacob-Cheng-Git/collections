import java.util.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        System.out.println("Linkedlist测试");
        Hero hero = new Hero();
        hero.test();


        System.out.println("**********");
        System.out.println("二叉树写的排序算法");
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
        Node roots = new Node();
        for (int number : randoms) {
            roots.addNode(number);
        }
        System.out.println(roots.values());


        System.out.println("***********");
        System.out.println("hashmap的使用");
        HashMap<Integer , String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1 , "first");
        hashMap.put(2 , "second");   //添加数据，用put
        hashMap.put(3 , "third");
        System.out.println(hashMap);
        System.out.println("第一个元素");
        System.out.println(hashMap.get(1));
        System.out.println("清空hashmap");
        hashMap.clear();             //清空，clear
        System.out.println(hashMap);


        System.out.println("**********");
        System.out.println("hashset的使用");
        HashSet<Integer> objects = new HashSet<>();
        objects.add(1);
        objects.add(2);
        objects.add(31);
        objects.add(44);
        objects.add(5);
        objects.add(66);
        objects.add(7);
        System.out.println("hashset中的数据存储是按照一定的机制存储的，不是按插入顺序存放");
        System.out.println("hashset中的数据不会重复，添加多个相同数据，只会保存其中一个");
        objects.add(1);
        System.out.println(objects);

        System.out.println("**********");
        System.out.println("Collections工具类的使用");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            numbers.add(i);
        }
        System.out.println("集合中的数据");
        System.out.println(numbers);

        Collections.reverse(numbers);    //reverse的使用，翻转集合数据

        System.out.println("翻转后的集合数据");
        System.out.println(numbers);

        System.out.println("集合中的数据");
        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println("集合混淆后的数据");
        Collections.shuffle(numbers);     //shuffle的使用，混淆集合中的数据
        System.out.println(numbers);
        System.out.println("集合排序后的数据");
        Collections.sort(numbers);     //sort的使用，排序
        System.out.println(numbers);

        Collections.swap(numbers,0,5);     //swap的使用，交换集合中两个数据的位置
        System.out.println("交换0和5下标的数据后，集合中的数据:");
        System.out.println(numbers);

        Collections.swap(numbers,0,5);
        Collections.rotate(numbers,2);     //rotate的使用，将集合中的数据滚动起来
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
        System.out.println(numbers);


        System.out.println("*********");
        System.out.println("比较器comparator的使用");//没有比较器，对象排序的时候不知道以哪个参数为标准进行排序
        Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            //通过随机值实例化hero的hp和damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //引入Comparator，指定比较的算法
        Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                //按照hp进行排序
                if(h1.hp>=h2.hp)
                    return 1;  //正数表示h1比h2要大
                else
                    return -1;
            }
        };
        Collections.sort(heros,c);
        System.out.println("按照血量排序后的集合：");
        System.out.println(heros);




/*        System.out.println("测试hashmap按值查找数据的速度");
        HashMap<String,Hero> hashMap1 = new HashMap<>();
        for (int i=0; i<2000000; i++){
            Hero hero1 = new Hero("hero "+i);
            hashMap1.put(hero1.name,hero1);
        }
        System.out.println("数据准备完成");
        for (int j=0; j<10; j++){
            long start = System.currentTimeMillis();
            Hero target = hashMap1.get("hero 1000000");
            if (target!=null){
                System.out.println("找到了目标"+target.name);
                long end = System.currentTimeMillis();
                System.out.println("总共花的时间"+(end-start)+"毫秒");
            }else {
                System.out.println("查找的目标不存在");
            }
        }*/





    }
}
