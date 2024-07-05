// -*- coding: utf-8 -*-
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        if (args.length != 3) {
            System.out.println("인수의 갯수가 모자랍니다. 3개를 입력해주세요.");
            return;
        }
        
        //변수 정의
        int num1, num2;
        char plus;

        // 첫번째 인수 세번째 인수를 저장
        try {
            num1 = Integer.parseInt(args[0]); 
            num2 = Integer.parseInt(args[2]); 
        } catch (NumberFormatException e) {
            System.out.println("첫번째 세번째 인수가 숫자가 아닙니다.");  //첫번째 세번째 인수가 숫자가 아니면 에러
            return;
        }

        plus = args[1].charAt(0); // 연산자 저장

        //답 초기화
        int ansewr = 0;

        //계산시작
        // 에러가나면 [isChecked 변수랑 errMsg를 정의해서 System.exit(1)로 종료때림] 이렇게 될 수 있게 해보기
        if (plus == '+') {
            ansewr = num1 + num2;
        } else if (plus == '-') {
            ansewr = num1 - num2;
        } else if (plus == 'x') { //else if (plus == '*') { 로 했을시 [인수의 갯수가 모자랍니다. 3개를 입력해주세요.] 에러가 발생 해결 방법 못 찾음.. 이스케이프??
            ansewr = num1 * num2;
        } else if (plus == '/') {
            ansewr = num1 / num2;
        } else {
            System.out.println("두번째 인수는 + - x / 만 입력해주세요.");
        }

        System.out.println("결과는[" + ansewr +"]입니다.");

}
    }
