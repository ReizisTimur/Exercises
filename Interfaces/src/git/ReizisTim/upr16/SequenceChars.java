package git.ReizisTim.upr16;
//Создайте класс, который генерирует серию char. Адаптируйте его так, чтобы он
//мог использоваться для передачи данных Scanner
import java.io.IOException;
import java.nio.*;
import java.util.*;
public class SequenceChars implements Readable{
    private int count;
    public SequenceChars(int count){this.count=count;}
    @Override
    public int read(CharBuffer charBuffer) {
        if(count--==0)
            return -1;
        Random sizeR = new Random();
        Random charN = new Random();
        int size = sizeR.nextInt(8)+2;
        char[] seqChar = new char[size];
        for(char n: seqChar){
            char temp =(char)(charN.nextInt(25)+97);
            charBuffer.append(temp);
        }
        System.out.println(size);
        charBuffer.append("  ");
        return size;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(new SequenceChars(10));
        System.out.println(s.next());
    }
}
