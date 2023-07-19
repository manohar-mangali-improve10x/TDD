package tringle;

public class Triangle {
    public int findMaximumEdgeOfTriangle(int l, int b) {
        int value = l + b -1;
        if (value >= 0){
          return value;
        }else {
            return -1;
        }
    }
}
