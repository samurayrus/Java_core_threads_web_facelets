
package lab2;

public class ComLineParser {
    String[] keys; //ключи
    String[] delimeters; // разделители

 //   ComLineParser() {
 ///       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 //   }
    // варианты завершения разбора командной строки
	public enum SwitchStatus { NoError, Error, ShowUsage }; 

        public ComLineParser(String[] keys)
        {
        this(keys,new String[]{"/","-"});
        }
        public ComLineParser(String[] keys, String[] delimeters)
        {
            this.delimeters=delimeters;
            this.keys=keys;
        }
        public void OnUsage(String errorKey)
        {    
        if(errorKey!=null)
        {
        System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
        System.out.println("   -?  показать Help файл");
        System.out.println("   -r  задать имя входного файла");
        System.out.println("   -w  выполнить вывод в указанный файл");
        System.out.println(errorKey);
        }}
        
        public SwitchStatus OnSwitch(String key, String keyValue)
        {
        System.out.println(key+"  "+keyValue);
        return SwitchStatus.NoError;
        }

    public Boolean Parse(String[] args) {
        SwitchStatus ss = SwitchStatus.NoError;	    
        int argNum;
        for (argNum = 0; (ss == SwitchStatus.NoError) && (argNum < args.length); argNum++) {
            // провера наличия правильного разделителя
            boolean isDelimeter = false;
            for (int n = 0; !isDelimeter && (n < delimeters.length); n++) {
                isDelimeter = args[argNum].regionMatches(0,delimeters[n], 0, 1);
            }
            if (isDelimeter) {
                // проверка наличия правильного ключа
                Boolean isKey = false;
                int i;
                for (i = 0; !isKey && (i < keys.length); i++) {
                    isKey = args[argNum].toUpperCase().regionMatches(1,keys[i].toUpperCase(),0,keys[i].length());
                    if (isKey) break;
                }
                if (!isKey) {
                    ss = SwitchStatus.Error;
                    break;
                } else {
                    ss = OnSwitch(keys[i].toLowerCase(), 
                         args[argNum].substring(1 + keys[i].length()));
                }
            }
            else {
                ss= SwitchStatus.Error;
                break;
            }
        }
        // завершение разбора командной строки
        if (ss == SwitchStatus.ShowUsage)    OnUsage(null);
        if (ss == SwitchStatus.Error)        OnUsage((argNum == args.length) ? null : args[argNum]);
        
        return ss == SwitchStatus.NoError;
    }   
}