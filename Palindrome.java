import java.util.*;

class Palindrome{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);
String data=sc.next();
int len=data.length();
boolean flag=false;
for(int i=0;i<len/2;i++){
 for(int j=len-1;j>=(len/2)-1;j--){
 if(data.charAt(i)!=data.charAt(j)){
 	flag=true;
        break;
  }
}
}
if(flag){
System.out.println("PALINDROME");
}
else{
System.out.println("Not palindrome");
}






}
}