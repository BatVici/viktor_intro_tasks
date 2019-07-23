public class HTreeElement<T> {
    T node;
    HTreeElement left;
    HTreeElement right;
    int index;
    boolean isFull = false;

    public HTreeElement(T object, int elementCount){
        this.node = object;
        this.index = elementCount;
        elementCount++;
    }

    public boolean addElement (Object object, int elementCount){
        if(left == null){
            this.left = new HTreeElement(object, elementCount);
            return false;
        }
        else if(right == null){
            this.right = new HTreeElement(object, elementCount);
            this.isFull = true;
            return true;
        }
        return true;
    }
}