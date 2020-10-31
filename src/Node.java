import java.util.ArrayList;
import java.util.List;

public class Node {

    public Node leftNode;
    public Node rightNode;
    public Object value;

    public void addNode(Object v){
        if(null == value){    //如果当前节点没有值，就把数据放在当前节点上
            value = v;
        }else{      //如果当前节点有值，就进行判断大小关系
            if ((Integer)v - (Integer) value <=0){   //新增的值比之前的节点小或者相等
                if(null == leftNode)
                    leftNode = new Node();
                leftNode.addNode(v);
            }else{       //新增的值比之前的节点大
                if (null == rightNode)
                    rightNode = new Node();
                rightNode.addNode(v);
            }
        }
    }

    // 中序遍历所有的节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.values());

        return values;
    }
}
