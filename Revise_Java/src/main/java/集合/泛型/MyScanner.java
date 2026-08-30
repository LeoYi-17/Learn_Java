package 集合.泛型;

public class MyScanner implements MyIterator<String>{
    @Override
    public String next() {
        return "键盘录入字符串";
    }
}
