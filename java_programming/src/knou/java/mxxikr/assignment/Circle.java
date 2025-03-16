package knou.java.mxxikr.assignment;

class Circle {
        static final double PI = 3.14;
        private int r; // 반지름

        public Circle() {
            r = 0;
        }

        public Circle(int a) {
            r = a;
        }

        // 반지름 리턴
        public int getR() {
            return r;
        }

        // 반지름 변경
        public void setR(int a) {
            this.r = a;
        }

        public double getArea() {
            return r * r * PI;
        }
}