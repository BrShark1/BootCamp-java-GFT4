public class App {
    public static void main(String[] args) throws Exception {
        int num = 5, count = 0;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
    }
}
