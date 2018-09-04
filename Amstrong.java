import java.io.*;
class Amstrong{

public static void main(String[]num){

int temp=Integer.parseInt(num[0]);
int sum=0;
while(temp!=0){
int rem=temp%10;
sum+=Math.pow(rem,3);

temp/=10;
}
if(sum==Integer.parseInt(num[0])){
System.out.println("AMSTRONG");
}
else{
System.out.println("NOT AMSTRONG");}

}
}
