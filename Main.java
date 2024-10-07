//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      String s="abcdcba";
      boolean result = true;
      int start = 0,end=s.length()-1;
      int l=0;
      if(s.length()%2==0){
          l=(s.length()/2)-1;
      }
      else{
          l=s.length()/2;
      }
      while(start<=l && end>=l){
          if(s.charAt(start)==s.charAt(end)){
              start++;
              end--;
          }
          else{
              System.out.println("Not a plaindrome string");
              result=false;
              break;
          }
      }
        if(result==false){
            System.out.println("Not a palindrome string.");
        }
        else{
            System.out.println("Palindrome string");
        }
      }
    }