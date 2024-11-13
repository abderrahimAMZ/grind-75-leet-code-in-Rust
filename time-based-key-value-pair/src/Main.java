








public class Main {
    public static void main(String[] args) {

        // test 1
        {
            TimeMap timeMap = new TimeMap();
            timeMap.set("foo", "bar", 1);
            System.out.println(timeMap.get("foo", 1)); // expected output is "bar"
            System.out.println(timeMap.get("foo", 3)); // expected output is "bar"
            timeMap.set("foo", "bar2", 4);
            System.out.println(timeMap.get("foo", 4)); // expected output is "bar2"
            System.out.println(timeMap.get("foo", 5)); // expected output is "bar2"
        }

        // test 2
        {
            TimeMap timeMap = new TimeMap();
            timeMap.set("love", "high", 10);
            timeMap.set("love", "low", 20);
            System.out.println(timeMap.get("love", 5)); // expected output is ""
            System.out.println(timeMap.get("love", 10)); // expected output is "high"
            System.out.println(timeMap.get("love", 15)); // expected output is "high"
            System.out.println(timeMap.get("love", 20)); // expected output is "low"
            System.out.println(timeMap.get("love", 25)); // expected output is "low"

        }


    }

}













