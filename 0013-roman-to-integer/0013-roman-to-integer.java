/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Solution
{
       public static int value(char c) {

        if (c == 'I') {
            return 1;
        } 
        else if (c == 'V') {
            return 5;
        } 
        else if (c == 'X') {
            return 10;
        } 
        else if (c == 'L') {
            return 50;
        } 
        else if (c == 'C') {
            return 100;
        } 
        else if (c == 'D') {
            return 500;
        } 
        else {
            return 1000;
        }
    }
	public static int romanToInt(String s) {
	   
	    int res = 0;
	    for(int i=0;i<s.length();i++){
	        int current = value(s.charAt(i));
	        if(i + 1 < s.length()){
	            int next = value(s.charAt(i+1));
	            if(current < next){
	                res = res - current;
	            }
	            else{
	                res += current;
	            }
	        }
	        else{
	            res = res + current;
	        }
	    }
	    return res;
	}
}
