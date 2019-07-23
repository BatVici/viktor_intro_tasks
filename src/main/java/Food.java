public class Food extends Product implements IEdible {
    public void Eat(){
        this.setQuantity(-1);
    }
}