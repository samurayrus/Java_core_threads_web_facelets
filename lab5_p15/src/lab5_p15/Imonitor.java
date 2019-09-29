package lab5_p15;

public interface Imonitor {
//реагирование на появление и удаление файлов
    void added(String fname);
    void deleted(String fname);
}
