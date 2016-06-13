package producerid;

import javax.jms.Connection;

import org.apache.activemq.ActiveMQConnectionFactory;

  class ProducerConnection /*implements Runnable*/{
	//public void run() {
    
	
	
	public static Connection getConnection(){
		Connection connection = null;
		try {
            
        	// Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://172.30.190.28:");

            // Create a Connection
            connection = connectionFactory.createConnection();
            connection.start();
            
            
		}
        catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
		return connection;
    }

	
}
