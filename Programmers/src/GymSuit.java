import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);

        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        int numberOfStudentsWhohaveGymSuit = n;

        setLostList(lost, lostList);
        setReserveList(reserve, reserveList);

        checkIfLostListandReserveListHaveSameStudent(lostList, reserveList);

        numberOfStudentsWhohaveGymSuit -= lostList.size();
        return getNumberOfStudentsWhohaveGymSuit(lostList, reserveList, numberOfStudentsWhohaveGymSuit);
    }

    private int getNumberOfStudentsWhohaveGymSuit(List<Integer> lostList, List<Integer> reserveList, int numberOfStudentsWhohaveGymSuit) {
        for (int i = 0; i < reserveList.size(); i++) {
            for (int j = 0; j < lostList.size(); j++){
                if(reserveList.get(i)-1 == lostList.get(j)){
                    reserveList.remove(i);
                    lostList.remove(j);
                    numberOfStudentsWhohaveGymSuit++;
                    i--;
                    break;
                }
                if(reserveList.get(i)+1 == lostList.get(j)){
                    reserveList.remove(i);
                    lostList.remove(j);
                    numberOfStudentsWhohaveGymSuit++;
                    i--;
                    break;
                }
            }
        }
        return numberOfStudentsWhohaveGymSuit;
    }

    private void checkIfLostListandReserveListHaveSameStudent(List<Integer> lostList, List<Integer> reserveList) {
        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (lostList.get(i) == reserveList.get(j)) {
                    lostList.remove(i);
                    reserveList.remove(j);
                    i--;
                    break;
                }
            }
        }
    }

    private void setReserveList(int[] reserve, List<Integer> reserveList) {
        for (int i = 0; i < reserve.length; i++) {
            reserveList.add(reserve[i]);
        }
    }

    private void setLostList(int[] lost, List<Integer> lostList) {
        for (int i = 0; i < lost.length; i++) {
            lostList.add(lost[i]);
        }
    }
}