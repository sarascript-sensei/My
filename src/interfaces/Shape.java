package interfaces;

    public abstract class Shape {
        private double height;
        private double width;
        private double area;
        private double perimeter;

        public void setValues(double height, double width)
        {
            this.height = height;
            this.width = width;
        }

        public double getHeight()
        {
            return height;
        }

        public double getWidth()
        {
            return width;
        }

        public abstract double calculateArea();
        public abstract double calculatePerimeter();
    }
