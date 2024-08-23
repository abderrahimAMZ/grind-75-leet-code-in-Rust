class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] results = new int[n];

        for (int i = n-2; i>=0;i--) {
            if (temperatures[i] < temperatures[i+1]){
                results[i] = 1;
            }
            else if (results[i+1] == 0){
                results[i] = 0;
            }
            else {
                int j  = results[i+1] + 1;
                boolean isAssingedAvalue = false;
                while (temperatures[i] >= temperatures[i+j]) {

                    if (results[i+j] == 0) {
                        results[i] = 0;
                        isAssingedAvalue = true;
                        break;
                    }
                    else {
                        j++;
                    }

                }
                if (!isAssingedAvalue) {
                    results[i] = j;
                }

            }
        }
        return results;
    }
}