package ph.zai.javaee;

import javax.jms.*;

import com.sun.messaging.ConnectionConfiguration;
import com.sun.messaging.ConnectionFactory;

public class MessageReceiver implements MessageListener{

	public static void main(String[] args){
		new MessageReceiver();
	}
	
	Session sess = null;
	ConnectionFactory factory;
	QueueConnection conn = null;
	MessageConsumer consumer = null;
	
	MessageReceiver(){
		try{
			factory = new ConnectionFactory();
			factory.setProperty(ConnectionConfiguration.imqAddressList, "mq://localhost:7676, mq://localhost:7676");
			conn = factory.createQueueConnection("admin", "admin");
			conn.start();
			
			sess = conn.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue ioqueue = sess.createQueue("TestQueue");
			
			consumer = sess.createConsumer(ioqueue);
			consumer.setMessageListener(this);
			
			System.out.println("Listening to test queue");
			Thread.sleep(100000);
		} catch(InterruptedException e){
			System.out.println("Error: " + e.getMessage());
		} catch(JMSException e){
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e){
				System.out.println("Can't close JMS connection/session " + e.getMessage());
			}
		}
	}
	
	
	@Override
	public void onMessage(Message msg) {
		String msgText;
		try{
			if (msg instanceof TextMessage) {
				msgText = ((TextMessage) msg).getText();
				System.out.println("Got from the queue: " + msgText);
			} else {
				System.out.println("Got a non text message");
			}
		} catch(JMSException e){
			System.out.println("Error while consuming a message: " + e.getMessage());
		}
	}

}
