package mycounter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

class WordNum implements Comparable<WordNum>
{private String w;
private int n;
public WordNum(String w, int n)
{
    this.w = w;
    this.n=n;
}
public String toString()
{return w+"-"+n;}

public int compareTo(WordNum obj)
{
int res = n-obj.n;
if(res==0) res=w.compareTo(obj.w);
return res;
}
}
public class WorldCounter{
    String inFile, outFile;
    static String testString ="ab ab ab gf as vcsas ab gl gf";
    //ArrayList <HashMap> words;
   
    
    public WorldCounter(String inFile, String outFile){
    this.inFile = inFile;
    this.outFile = outFile;
    }
    private Map words = new TreeMap();
    public Map getWords() {return words;}
    
    public Set getValues()
    {
    Set set = new TreeSet();
    for(Object key:words.keySet())
    {
    int n = (int)words.get(key);
    //
        set.add(new Word((Stirng)key,n));
    }
    }


 public void keys()
{

}
 public void countWords() throws FileNotFoundException, IOException //Анализ частоты возвращаекмых слов
 {
 DataInputStream dos;
        dos = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));
        //BufferedReader br=new BufferedReader(dos);
        for (String line = dos.readLine(); line != null; line = dos.readLine()){
        StringTokenizer st;
        while(true)
        {
        st = new StringTokenizer(line);
        String Token = st.nextToken();
        if( !words.contains(Token))
        {HashMap e = null;
        words.add(e);}
        }
        }
 }
}

