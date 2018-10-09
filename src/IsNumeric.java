/*
* 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
* 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
* */
public class IsNumeric {
    public boolean isNumeric(char[] str) {
        String string=String.valueOf(str);  //字符数组转换为String
        /*
        * 使用正则表达式，Java中转义字符需要两个斜杠“\\”，问号“？”表示0至1个匹配，星号“*”为0至多个匹配，
        * 加号“+”为1至多个匹配（不可以为0个），\\d表示十进制整数，方括号“[]”表示匹配括号内其中一个字符，因此整个正则表达式的含义为：
        * 匹配没有或者1个正号或负号：[\\+\\-]?；
        * 后接0至多位数字：\\d*；
        * 可以有1个或没有小数，若有1个小数，小数点后面有一至多个数字：(\\.\\d+)?；
        * 可以有1个或没有科学计数法，若有则E或e后面可以包含0个或1个正号或负号，科学计数法后面要有1至多个数字：([eE][\\+\\-]?\\d+)?；
        * 前面说一开始正负号后面，小数点前面可以有0个数字，因为在Java和Python中，例如“.2”也是数字。
        * */
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }
}