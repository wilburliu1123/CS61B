public class SLList{
  public IntNode first;
  private int size;
  public SLList(int x){
    first = new IntNode(x, null);
    size = 1;
  }
  private class IntNode {
    public int item;
    public IntNode next;
    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

  /** Adds x to the front of the list. */
  public void addFirst(int x) {
    first = new IntNode(x, first);
    size += 1;
  }
  /** Returns the first item in the list */
  public int getFirst() {
    return first.item;
  }
  /** Returns the last item in the list */
  public int getLast() {
    size += 1;
    IntNode p = first;
    while (p.next != null) {
      p = p.next;
    }
    return p.item;
  }
  public void printList(IntNode p) {
    if (p == null) {
      return;
    }
    while (p != null) {
      System.out.println(p.item);
      p = p.next;
    }
    System.out.println(p);
  }
  /** reverse a list */
  public void reverse() {
    IntNode frontofReversed = null;
    IntNode nextNodeToAdd = first;
    while (nextNodeToAdd != null) {
      IntNode remainderOfOriginal = nextNodeToAdd.next;
      nextNodeToAdd.next = frontofReversed;
      frontofReversed = nextNodeToAdd;
      nextNodeToAdd = remainderOfOriginal;
    }
    first = frontofReversed;
}
  public void insert(int x, int pos) {
    size += 1;
      if (pos == 0) {
        addFirst(x);
        return;
      }
      IntNode p = first;
        while (pos > 1 && p.next != null) {
          pos --;
          p = p.next;
        }
        IntNode newNode = new IntNode(x, p.next);
        p.next = newNode;
  }
  public static void main(String[] args) {
      SLList L = new SLList(15);
      L.addFirst(10);
      L.addFirst(5);
      L.addLast(20);
      L.insert(25,3);
      L.reverse();
      System.out.println(L.size());

  }
  /** Adds an item to the end of the list. */
  public void addLast(int x) {
    IntNode p = first;
    while (p.next != null) {
      p = p.next;
    }
    p.next = new IntNode(x, null);
  }

  public int size() {
    return size;
  }
}
