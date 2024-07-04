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
        
        //입력값을 1개씩 따로 저장
        char num1char = input.charAt(0);
        char plus = input.charAt(1);
        char num2char = input.charAt(2);

        //char타입으로 받은 입력값을 계산을위해 숫자타입으로 변경
        int num1 = Character.getNumericValue(num1char);
        int num2 = Character.getNumericValue(num2char);

        //정답을 받을 변수 설정 및 변수 초기화
        int ansewr = 0;

        // 계산
        switch (plus) {
            case '+':
                ansewr = num1 + num2;
                break;
            
            case '-':
                ansewr = num1 - num2;
                break;
            
            case '*':
                ansewr = num1 * num2;
                break;
            
            case '/':
                ansewr = num1 / num2;
                break;
        
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }


        System.out.println("결과는[ " + num1 + " ]입니다.");
        System.out.println("결과는[ " + plus + " ]입니다.");
        System.out.println("결과는[ " + num2 + " ]입니다.");
        System.out.println("결과는[ " + ansewr + " ]입니다.");
    }
}
