 package jiedui1;
  
  import java.util.Random;
  import java.util.Scanner;
 
  public class jiedui {
  
     public static void main(String[] args) {
          /**
          * 一共循环10次。
          */
         int rightNum = 0;//正确次数
         int wrongNum = 0;//错误次数
         for (int i =1; i <= 10; i++) {
             System.out.println("请计算第" + i + "道题：");// 做到第几题，循环输出
             int number1 =(int) (Math.random() * 10);
             int number2 =(int) (Math.random() * 10);
             Random num = new Random();// 生成随机运算符
             int index = num.nextInt(3) + 1;
             char[] fuhaos = { '+', '-', '*', '/' };
             String fuhao = String.valueOf(fuhaos[index]);
             Scanner scan = new Scanner(System.in);
             if (fuhao.equals("+")) { // 进行加法运算
                 System.out.println(number1 + "+" + number2 + "=");
                 int input = scan.nextInt();
                 int sum = number1 + number2;
                 if (sum==input) {
                     System.out.println("正确");
                     rightNum++;
                 } else {
                     System.out.println("错误");
                     wrongNum++;
                }
                 System.out.println("正确答案是:" + sum);
             }else if (fuhao.equals("-")) { // 进行减法运算
                 System.out.println(number1 + "-" + number2 + "=");
                 int input = scan.nextInt();
                 int sum = number1 - number2;
                 if (sum==input) {
                     System.out.println("正确");
                     rightNum++;
                 } else {
                    System.out.println("错误");
                     wrongNum++;
                }
                 System.out.println("正确答案是:" + sum);
             }else if (fuhao.equals("*")) { // 进行乘法运算
                 System.out.println(number1 + "*" +number2 + "=");
                int input = scan.nextInt();
                 int sum = number1 * number2;
                if (sum==input) {
                    System.out.println("正确");
                     rightNum++;
                 } else {
                     System.out.println("错误");
                     wrongNum++;
                 }
                 System.out.println("正确答案是:" + sum);
             }else {                     // 进行除法运算
                 System.out.println(number1 + "/" + number2 + "=");
                 int input = scan.nextInt();
                 int sum = number1 / number2;
                 if (sum==input) {
                     System.out.println("正确");
                     rightNum++;
                 } else {
                     System.out.println("错误");
                     wrongNum++;
                 }
                 System.out.println("正确答案是:" + sum);
             }
         }
         System.out.println("做对" + rightNum + "题");
         System.out.println("做错" + wrongNum + "题");
     }
     }
