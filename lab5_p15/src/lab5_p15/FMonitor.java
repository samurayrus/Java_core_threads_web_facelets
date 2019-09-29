package lab5_p15;
import java.io.IOException;
import java.util.*;
import java.nio.file.*;

public final class FMonitor {
private Path path; //имя
private List<Imonitor> list;//Коллекцию создаем для записи ссылок на объекты. Их может негораничено
//Удаление нужно для сборки мусора, т.к неиспользуемые не пропадают

    public FMonitor(String name) {
        //this.name=name;
        path = Paths.get(name); //при создании объекта получаем имя
        if(!Files.exists(path) || !Files.isDirectory(path)) throw new IllegalArgumentException(); // вернет булоекан. Если его не существует или это не папка, то выдаст ошибку.
        list = new LinkedList<>();
    }
    
    public void addListener(Imonitor client)
    {
    list.add(client);
    }
    
    public void removeListener(Imonitor client)
    {
    list.remove(this);
    }
    //Все происходит в одном потоке. 
    public void start() throws Exception
    {
    WatchService watch = FileSystems.getDefault().newWatchService();
    path.register(watch,StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
    for(int i =0;i<3;i++)
    {
    WatchKey key = watch.take();
    for(WatchEvent ev : key.pollEvents())
    {
        // 100 System.out.println(ev.context());
        fire(ev.context().toString(),ev.kind()); //101
    }        
    key.reset();
    }
        watch.close();
    }

    private void fire(String fname, WatchEvent.Kind kind) {   //101
    for(Imonitor client:list)                                 //101
        if(kind==StandardWatchEventKinds.ENTRY_CREATE)        //101
        client.added(fname);                                  //101
             else                                             //101
                if(kind==StandardWatchEventKinds.ENTRY_DELETE)//101
                    client.deleted(fname);                    //101
    }
}
