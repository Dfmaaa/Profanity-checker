import java.util.Scanner;
public class Profanity_check{
 static String str(String[] a){
  String s="";
  for(int i=0;i<a.length;i++){
  s+=a[i];
}
  return s;
}
static boolean frm(int from,String word, String[] b){
 char[] a=word.toCharArray();
boolean see=false;
 String n="";
for(int f=from;f<word.length();f++){
n+=a[f];
if(exist(b,n)==true){
   see=true;
 }
}
return see;
}
static boolean exist(String[] a, String word){
 boolean ex=false;
 for(int x=0;x<a.length;x++){
  if(a[x].equals(word)){
   ex=true;
}
}
  return ex;
}
 public static void main(String[] args){
  Scanner inp=new Scanner(System.in);
  while(true){
  System.out.print("message:");
  String message=inp.nextLine();
  String check_this=str(message.split(" "));
  String[] p={"fuck","motherfucker","fucker","idiot","dumb","stupid"}; //list of bad words, you can add words here.
  boolean check=false;
  for(int n=0;n<check_this.length();n++){
   if(frm(n,check_this,p)==true){
    check=true;
}
  }
if(check==true){
 System.out.println("The word you entered is not allowed.");
}
else{
System.out.println("word successfully entered!");
   }
  }
 }
}