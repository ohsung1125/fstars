import java.util.Scanner;

class GradeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double score[] = new double[8];
		double sum = 0; 
		double su = 0;
		int k = 0;
		int i = 0;
		System.out.println("현재 다니고 있는 학기에는 0을 입력");
		for(i = 0; i < 8; i++) {
			System.out.print((i+1) +"학기의 학점을 입력 => "); 
			score[i] = scanner.nextDouble();
			if(score[i] == 0)
				break;
			sum += score[i];
		}
		
		k = 8-i;
		su = 32 - sum;
		System.out.println("");
		System.out.printf("현재 평균 학점은 %.2f 입니다\n",(sum/i));
		System.out.println("남은 학기는 " + k + "학기입니다.");
		System.out.printf("이 기간 동안 학점 4.0을 넘기기 위해서는 학기 평균 %.2f 학점을 맞아야합니다.\n",(su/k));
	}
} 
