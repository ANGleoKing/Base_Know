package algorithm.base.tree;

import algorithm.base.queue.SeqQueue;

import java.util.zip.Deflater;

/**
 * @ClassName BiTree
 * @Description [顺序存储结构实现二叉树]
 * @Author ANGLE0
 * @Date 2019/12/25 20:46
 * @Version V1.0
 **/
public class SeqBiTree {

    private int MAX_SIZE;//最大可容纳节点数
    private int DEFAULT_SIZE = 20;//默认可容纳节点数
    private Object[] seqBiTree;//存放所有节点，0号单元不用
    private int nodeMAX = 0;//最后一个节点下标

    public SeqBiTree() {
        this.MAX_SIZE = DEFAULT_SIZE;
        this.seqBiTree = new Object[this.MAX_SIZE+1];
    }

    public SeqBiTree(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.seqBiTree = new Object[this.MAX_SIZE+1];
    }

    public void addNode(Object data) throws Exception {
        if (nodeMAX == this.MAX_SIZE)
            throw new Exception("树已满，暂不支持扩容");
            seqBiTree[++this.nodeMAX] = data;
    }
}
