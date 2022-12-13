package baseball.view;

public class GameMessage {
    static final String INPUT_NUMBER_MESSAGE= "숫자를 입력해주세요 : ";
    static final String BALL= "볼";
    static final String STRIKE= "스트라이크";
    static final String NOTHING= "낫싱";
    static final String GAME_END_MESSAGE= "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    static final String ASK_RESTART_MESSAGE= "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    static final int RESTART = 1;
    static final int EXIT = 2;
    public static final int NUMBER_LENGTH = 3;

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;
}
