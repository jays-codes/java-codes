package ph.zai.javaee;

import javax.jms.*;
import com.sun.messaging.ConnectionFactory;
import com.sun.messaging.ConnectionConfiguration;

public class MessageSender {

	public static void main(String[] args) {
		Session session = null;
		ConnectionFactory factory;
		QueueConnection connection=null;
		
		try{
			factory = new ConnectionFactory();
			factory.setProperty(ConnectionConfiguration.imqAddressList, 
					"mq://localhost:7676,mq://localhost:7676");
			connection = factory.createQueueConnection("admin", "admin");
			connection.start();
			
			session = connection.createQueueSession(false,  Session.AUTO_ACKNOWLEDGE);
			Queue ioqueue = session.createQueue("TestQueue");
			MessageProducer queueSender = session.createProducer(ioqueue);
			
			TextMessage outMsg = session.createTextMessage("IBM 201 Mkt");
			
			queueSender.send(outMsg);
			queueSender.close();
		} 
		catch(JMSException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				session.close();
				connection.close();
			} catch (Exception e){
				System.out.println("Cannot close JMS connection/session " + e.getMessage());
			}
		}

	}

}
