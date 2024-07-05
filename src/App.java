import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //메세지 출력
        System.out.print("계산식을 입력하세요(EX:3*2):");

        //입력받기
        Scanner scanner = new Scanner(System.in);

        //입력값을 한번에 저장(3+2)
        String input = scanner.nextLine();

        //입력값이 3개인지 확인
        //3개가 아니면 에러
        if (input.length() != 3) {
            System.out.println("인수의 갯수가 모자랍니다. 3개를 입력해주세요.");
            scanner.close();
            return;
        }

        
        //입력값을 1개씩 따로 저장
        //이렇게 하면 두자리 숫자는 불가능 차후 수정 할 것
        //1.연산자 찾기
        //2.연산자의 앞 뒷의 숫자 찾기
        char num1char = input.charAt(0);
        char plus = input.charAt(1);
        char num2char = input.charAt(2);

        //첫번째 인수와 세번째 인수가 숫자인지 확인
        if (!Character.isDigit(num1char) || !Character.isDigit(num2char)) {
            System.out.println("ERR_첫번째와 세번째인수는 숫자여야합니다.");
            scanner.close();
            return;
        }

        //char타입으로 받은 입력값을 계산을위해 숫자타입으로 변경
        int num1 = Character.getNumericValue(num1char);
        int num2 = Character.getNumericValue(num2char);

        //정답을 받을 변수 설정 및 변수 초기화
        int ansewr = 0;

        // 계산
        // 에러가나면 [isChecked 변수랑 errMsg를 정의해서 System.exit(1)로 종료때림] 이렇게 될 수 있게 해보기
        if (plus == '+') {
            ansewr = num1 + num2;
        } else if (plus == '-') {
            ansewr = num1 - num2;
        } else if (plus == '*') {
            ansewr = num1 * num2;
        } else if (plus == '/') {
            ansewr = num1 / num2;
        } else {
            System.out.println("두번째 인수는 + - * / 만 입력해주세요.");
            scanner.close();
            return;
        }

        System.out.println("결과는[ " + ansewr + " ]입니다.");
    }
}
