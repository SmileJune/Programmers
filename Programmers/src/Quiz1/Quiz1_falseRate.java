package Quiz1;

import java.util.*;
import java.util.Comparator;

public class Quiz1_falseRate {
    public int[] solution(int N, int[] stages) {

        Map<Integer, Integer> map = new HashMap<>(N + 1);
        setMapAndValueToZero(N, map);
        setValueOfMap(stages, map);

        Map<Integer, Double> falseRateMap = new HashMap<>(N);
        setFalseRateMap(N, map, falseRateMap);

        List<Map.Entry<Integer, Double>> list = new ArrayList(map.entrySet());

        sorting(list);

        int[] answer = new int[N];
        setAnswer(list, answer);
        return answer;

    }

    private void sorting(List<Map.Entry<Integer, Double>> list) {
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                double c1 = o1.getValue();
                double c2 = o2.getValue();
                return Double.compare(c1, c2);
            }
        });
    }

    private void setAnswer(List<Map.Entry<Integer, Double>> list, int[] answer) {
        int i = 0;
        for (Map.Entry element : list) {
            answer[i] = (int) element.getKey();
            i++;
        }
    }

    private void setFalseRateMap(int N, Map<Integer, Integer> map, Map<Integer, Double> falseRateMap) {
        for (int i = 1; i <= N; i++) {
            falseRateMap.put(i, getFalseRate(i, N, map));
        }
    }

    private void setValueOfMap(int[] stages, Map<Integer, Integer> map) {
        for (int i = 0; i < stages.length; i++) {
            int newValue = map.get(stages[i]) + 1;
            map.put(stages[i], newValue);
        }
    }

    private void setMapAndValueToZero(int N, Map<Integer, Integer> map) {
        for (int i = 1; i <= N + 1; i++) {
            map.put(i, 0);
        }
    }

    double getFalseRate(int i, int N, Map<Integer, Integer> map) {
        int totalNumberOfPeopleReached = 0;
        for (int j = i; j <= N + 1; j++) {
            totalNumberOfPeopleReached += map.get(j);
        }
        return map.get(i) / (double) totalNumberOfPeopleReached;
    }
}
