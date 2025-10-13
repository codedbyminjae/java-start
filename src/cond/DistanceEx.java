package cond;

public class DistanceEx {
    public static void main (String[] args) {
        int distance = 25;
        
        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 20) {
            System.out.println("자동차");
        } else if (distance <= 30) {
            System.out.println("비행기");
        }
    }
}
