import java.util.concurrent.locks.*;
class ReentrantLock2 
{
      public static void main(String[] args)
      {
           ReentrantLock i = new ReentrantLock();
           i.lock();
           i.lock();
           i.lock();
           System.out.println("Thread is locked----"+i.isLocked());
           System.out.println("Thread is hold by current thread----"+i.isHeldByCurrentThread());
           System.out.println("Waiting threads to get lock-----"+i.getQueueLength());
           System.out.println("Hold count-----"+i.getHoldCount());
           i.unlock();
           System.out.println("Hold count-----"+i.getHoldCount());
           System.out.println("Thread is locked----"+i.isLocked());
           i.unlock();
           i.unlock();
           System.out.println("Hold count-----"+i.isLocked());
           System.out.println("Fair policy is accquired----"+i.isFair());

       }
}