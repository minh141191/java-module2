package minitest.servise;

import java.io.IOException;

public interface Manage<E> {
    E create();
    E update() throws IOException;
    E delete() throws IOException;
    E getById();
    void displayAll();
}
