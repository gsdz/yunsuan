 package jiedui1;
  
  import java.util.Random;
  import java.util.Scanner;
 
  public class jiedui {
  
     public static void main(String[] args) {
          /**
          * һ��ѭ��10�Ρ�
          */
         int rightNum = 0;//��ȷ����
         int wrongNum = 0;//�������
         for (int i =1; i <= 10; i++) {
             System.out.println("������" + i + "���⣺");// �����ڼ��⣬ѭ�����
             int number1 =(int) (Math.random() * 10);
             int number2 =(int) (Math.random() * 10);
             Random num = new Random();// ������������
             int index = num.nextInt(3) + 1;
             char[] fuhaos = { '+', '-', '*', '/' };
             String fuhao = String.valueOf(fuhaos[index]);
             Scanner scan = new Scanner(System.in);
             if (fuhao.equals("+")) { // ���мӷ�����
                 System.out.println(number1 + "+" + number2 + "=");
                 int input = scan.nextInt();
                 int sum = number1 + number2;
                 if (sum==input) {
                     System.out.println("��ȷ");
                     rightNum++;
                 } else {
                     System.out.println("����");
                     wrongNum++;
                }
                 System.out.println("��ȷ����:" + sum);
             }else if (fuhao.equals("-")) { // ���м�������
                 System.out.println(number1 + "-" + number2 + "=");
                 int input = scan.nextInt();
                 int sum = number1 - number2;
                 if (sum==input) {
                     System.out.println("��ȷ");
                     rightNum++;
                 } else {
                    System.out.println("����");
                     wrongNum++;
                }
                 System.out.println("��ȷ����:" + sum);
             }else if (fuhao.equals("*")) { // ���г˷�����
                 System.out.println(number1 + "*" +number2 + "=");
                int input = scan.nextInt();
                 int sum = number1 * number2;
                if (sum==input) {
                    System.out.println("��ȷ");
                     rightNum++;
                 } else {
                     System.out.println("����");
                     wrongNum++;
                 }
                 System.out.println("��ȷ����:" + sum);
             }else {                     // ���г�������
                 System.out.println(number1 + "/" + number2 + "=");
                 int input = scan.nextInt();
                 int sum = number1 / number2;
                 if (sum==input) {
                     System.out.println("��ȷ");
                     rightNum++;
                 } else {
                     System.out.println("����");
                     wrongNum++;
                 }
                 System.out.println("��ȷ����:" + sum);
             }
         }
         System.out.println("����" + rightNum + "��");
         System.out.println("����" + wrongNum + "��");
     }
     }
