public class BmiService {
    public float calculate(float massBody, float heightBody) {
        float index = massBody / (heightBody * heightBody);
        return index;
    }
}
