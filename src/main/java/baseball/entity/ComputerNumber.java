package baseball.entity;

import baseball.view.GameMessage;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<String> randomNumbers;
    //역할
    // 1. 랜덤 3자리 숫자 정하기
    public List<String> makeRandomNumber(){
        randomNumbers = new ArrayList<>();
        while(randomNumbers.size() < GameMessage.NUMBER_LENGTH){
            String number = Integer.toString(Randoms.pickNumberInRange(GameMessage.MIN_NUMBER, GameMessage.MAX_NUMBER));

            boolean isExistNumber = randomNumbers.stream().noneMatch(s -> s.startsWith(number)); //List에 없는 숫자이면
            if(isExistNumber) {
                randomNumbers.add(number);
            }
        }

        System.out.println(randomNumbers.toString());
        return randomNumbers;
    }

    // 2. 입력 값에 대한 힌트 보여주기
    // 3. 결과로 진행여부 판단하기

}
