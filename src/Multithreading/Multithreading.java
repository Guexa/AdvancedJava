
package Multithreading;

/**
 *
 * @author guexa
 */
public class Multithreading {
    
    public static void main(String[] args) {
        
        ThreadE thread1 = new ThreadE();
        thread1.setName("My fisrt thread");
        thread1.start();
        
        ThreadE thread2 = new ThreadE();
        thread2.setName("My second thread");
        thread2.start();
    }
    
}