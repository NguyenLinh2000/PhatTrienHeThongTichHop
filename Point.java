
public class Point {

    private int x;
    private int y;
    public static Point origin = new Point();//Khai báo biến static odiễn gốc tọa độ (0, 0).

    public Point(int x, int y) {//khoi tao Point co toa do xy
        this.x = x;
        this.y = y;
    }

    public Point() {//khoi tao voi toa so 0;0
        this.x = 0;
        this.y = 0;
    }

    public Point(Point p) {//viet ra thui hem hieu co giong y cua de bai khong
        this.x = p.x;
        this.y = p.y;
    }
//tao Set va get cho x va y

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
//Override các phương thức sau của lớp Object
    @Override
    public boolean equals(Object obj) {//ham khong lam viec
        Point a = new Point(x, y);
        if (obj.equals(a)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "(+" + this.x + "," + this.y + ")";

    }
//boolean isOrigin(): kiểm tra xem điểm có phải là gốc tọa độ (0, 0).
    public boolean isOrigin() {
        Point a = new Point(this.x, this.y);
        if (a == origin) {
            return true;
        } else {
            return false;
        }

    }
//void move(int x, int y): di chuyển điểm đến tọa độ mới (x, y).
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
//void translate(int dx, int dy): tịnh tiến điểm theo vector tịnh tiến (dx,
//dy).Điểm (x, y) sau khi tịnh tiến theo vector tịnh tiến (dx, dy) sẽ thành điểm (x+ dx, y+
//dy).
    public void translate(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
//static double distance(int x1, int y1, int x2, int y2): tính
//khoảng cách giữa điểm (x1, y1) và điểm (x2, y2).
    public static double distance(int x1, int y1, int x2, int y2) {
        double kc;
        kc = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return kc;
    }
//static double distance(Point p1, Point p2): tính khoảng cách giữa
//điểm p1và p2.
    public static double distance(Point p1, Point p2) {
        double kc;
        kc = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return kc;
    }
//double distance(int x, int y): tính khoảng cách từ điểm đến điểm (x, y).
    public double distance(int x, int y) {
        double kc;
        kc = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return kc;
    }
//double distance(Point p): tính khoảng cách từ điểm đến điểm p.
    public double distance(Point p) {
        double kc;
        kc = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        return kc;
    }
//double distance(double a, double b, double c): tính khoảng cách từ
//điểm đến đường thẳng có phương trình tổng quát ax + by + c = 0
    public double distance(double a, double b, double c) {
        double kc;
        double _x1;
        _x1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double _x2;
        _x2 = Math.abs(a * this.x + b * this.y + c);
        kc = _x2 / _x1;
        return kc;

    }
}