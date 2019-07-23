public class Apple extends Food {
    private enum Color {
        RED, YELLOW;

        private Color color;

        public void setColor(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return this.color;
        }
    }
}