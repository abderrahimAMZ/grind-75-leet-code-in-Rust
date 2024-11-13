import java.util.ArrayList;
import java.util.HashMap;

class TimeMap {
    class Tuple {
        public String value;
        public int timestamp;

        Tuple(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    HashMap<String, ArrayList<Tuple>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Tuple(value, timestamp));
    }

    public String get(String key, int timestamp) {
        ArrayList<Tuple> array = map.get(key);

        if (array == null || array.isEmpty()) {
            return "";
        }

        else if (timestamp >= array.get(0).timestamp && timestamp <= array.get(array.size()-1).timestamp) {
            int l = 0;
            int r = array.size() -1;

            int mid = 0;

            while (l <= r) {
                mid = l + (r -l )/2;

                if (array.get(mid).timestamp > timestamp) {
                    r = mid -1;
                }
                else if (array.get(mid).timestamp < timestamp) {
                    l = mid +1;
                }
                else {
                    return array.get(mid).value;
                }
            }
            while (mid > 0  && array.get(mid).timestamp > timestamp) {
                mid--;
            }
            return array.get(mid).value;

        }
        else if (timestamp < array.get(0).timestamp ) {
            return "";
        }
        else {
            return array.getLast().value;
        }

    }
}

