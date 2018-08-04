package kafka.learning.publisher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        KafkaPublisher publisher = new KafkaPublisher();
        publisher.publish();
    }
}
