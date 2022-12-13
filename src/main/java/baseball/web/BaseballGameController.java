package baseball.web;

import baseball.vo.Computer;
import baseball.vo.User;

public class BaseballGameController {

    private Computer computer;
    private User user;

    public void start(){
        computer = new Computer();
        user = new User();

        setRandomNumber();
        //getNumberFromUser();
    }

    public void setRandomNumber(){
        computer.makeRandomNumber();
    }

    /*public void getNumberFromUser(){
        user.getNumber();
    }*/
}
